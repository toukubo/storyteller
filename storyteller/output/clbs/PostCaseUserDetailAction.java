package net.clbs.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.clbs.model.*;
import net.clbs.beans.*;


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


public class PostCaseUserDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		CaseUser caseUser = new CaseUserImpl();
		CaseUserForm caseUserform = new CaseUserForm();
		Criteria criteria = session.createCriteria(CaseUser.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			caseUser = (CaseUser) criteria.uniqueResult();
			new CopyProperties(caseUser,caseUserform);
		} else if(req.getAttribute("form")!=null){
                        caseUserform = (CaseUserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(caseUserform.getId()));
			caseUser = (CaseUser) criteria.uniqueResult();
		}
		

		req.setAttribute("model",caseUser);
		req.setAttribute("form",caseUserform);


                   
		
		return mapping.findForward("success");
	}
	
	
}