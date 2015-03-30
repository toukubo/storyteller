package net.realize.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.realize.model.*;
import net.realize.beans.*;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class PostUserDetailGoingStartedAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		User user = new UserImpl();
		UserForm userform = new UserForm();
		Criteria criteria = session.createCriteria(User.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			user = (User) criteria.uniqueResult();
			new CopyProperties(user,userform);
		} else if(req.getAttribute("form")!=null){
                        userform = (UserForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(userform.getId()));
			user = (User) criteria.uniqueResult();
		}
		

		req.setAttribute("model",user);
		req.setAttribute("form",userform);


                  Criteria criteriaCertificationType= session.createCriteria(CertificationType.class);
			req.setAttribute("CertificationTypes", criteriaCertificationType.list());

 
		
		return mapping.findForward("success");
	}
	
	
}