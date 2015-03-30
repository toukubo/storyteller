package net.plest.web.app;

import net.plest.model.*;
import net.plest.beans.*;

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
import org.hibernate.criterion.Restrictions;


public class PostPublicUserVPForRegistrationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		PublicUser publicUser = new PublicUserImpl();
		PublicUserForm publicUserform = (PublicUserForm) form;

                String error = "";


                		Integer fromFollowingInt = publicUserform.getFromFollowing();
		publicUserform.setFromFollowing(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(publicUserform.getId() == null || publicUserform.getId().intValue() == 0){
			publicUser.setId(null);
			publicUserform.setId(null);
		}else{
			publicUser.setId(publicUserform.getId());
			Criteria criteria = session.createCriteria(PublicUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			publicUser = (PublicUser) criteria.uniqueResult();

		}
                		publicUser.setPassword(publicUserform.getPassword());
		publicUser.setAccount(publicUserform.getAccount());
		publicUser.setMail(publicUserform.getMail());
		publicUser.setServiceid(publicUserform.getServiceid());
		publicUser.setPasswordConfirmation(publicUserform.getPasswordConfirmation());
		publicUser.setName(publicUserform.getName());


		
		StringFullfiller.fullfil(publicUser);
                		Criteria criteria2 = session.createCriteria(FromFollowing.class);
		criteria2.add(Restrictions.idEq(fromFollowingInt));
		FromFollowing fromfollowing = (FromFollowing) criteria2.uniqueResult();
		publicUser.setFromFollowing(fromfollowing);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(publicUser);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPublicUserDetail.do", publicUser.getId().toString(),"success=true");
		return null;

		
	}
	
	
}