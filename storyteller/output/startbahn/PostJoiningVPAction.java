package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostJoiningVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Joining joining = new JoiningImpl();
		JoiningForm joiningform = (JoiningForm) form;

                String error = "";


                		Integer publicUserInt = joiningform.getPublicUser();
		joiningform.setPublicUser(null);
		Integer communityInt = joiningform.getCommunity();
		joiningform.setCommunity(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(joiningform.getId() == null || joiningform.getId().intValue() == 0){
			joining.setId(null);
			joiningform.setId(null);
		}else{
			joining.setId(joiningform.getId());
			Criteria criteria = session.createCriteria(Joining.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			joining = (Joining) criteria.uniqueResult();

		}
                		joining.setDate(joiningform.getDate());


		
		StringFullfiller.fullfil(joining);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		joining.setPublicUser(publicuser);
		criteria2 = session.createCriteria(Community.class);
		criteria2.add(Restrictions.idEq(communityInt));
		Community community = (Community) criteria2.uniqueResult();
		joining.setCommunity(community);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(joining);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostJoiningDetail.do", joining.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Joinings.do", joining.getId().toString());
		return null;

		
	}
	
	
}