package net.iwager.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.iwager.model.*;
import net.iwager.beans.*;


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


public class PostPrivilegeDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Privilege privilege = new PrivilegeImpl();
		PrivilegeForm privilegeform = new PrivilegeForm();
		Criteria criteria = session.createCriteria(Privilege.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			privilege = (Privilege) criteria.uniqueResult();
			new CopyProperties(privilege,privilegeform);
		} else if(req.getAttribute("form")!=null){
                        privilegeform = (PrivilegeForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(privilegeform.getId()));
			privilege = (Privilege) criteria.uniqueResult();
		}
		

		req.setAttribute("model",privilege);
		req.setAttribute("form",privilegeform);


                   
		
		return mapping.findForward("success");
	}
	
	
}