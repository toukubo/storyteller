package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostFriendshipVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Friendship friendship = new FriendshipImpl();
		FriendshipForm friendshipform = (FriendshipForm) form;

                String error = "";


                		Integer topublicuserInt = friendshipform.getTopublicuser();
		friendshipform.setTopublicuser(null);
		Integer frompublicuserInt = friendshipform.getFrompublicuser();
		friendshipform.setFrompublicuser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(friendshipform.getId() == null || friendshipform.getId().intValue() == 0){
			friendship.setId(null);
			friendshipform.setId(null);
		}else{
			friendship.setId(friendshipform.getId());
			Criteria criteria = session.createCriteria(Friendship.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			friendship = (Friendship) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(friendship);
                		Criteria criteria2 = session.createCriteria(Topublicuser.class);
		criteria2.add(Restrictions.idEq(topublicuserInt));
		Topublicuser topublicuser = (Topublicuser) criteria2.uniqueResult();
		friendship.setTopublicuser(topublicuser);
		criteria2 = session.createCriteria(Frompublicuser.class);
		criteria2.add(Restrictions.idEq(frompublicuserInt));
		Frompublicuser frompublicuser = (Frompublicuser) criteria2.uniqueResult();
		friendship.setFrompublicuser(frompublicuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(friendship);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostFriendshipDetail.do", friendship.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Friendships.do", friendship.getId().toString());
		return null;

		
	}
	
	
}