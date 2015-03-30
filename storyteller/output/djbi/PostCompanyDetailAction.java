package net.djbi.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.djbi.model.*;
import net.djbi.beans.*;


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


public class PostCompanyDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Company company = new CompanyImpl();
		CompanyForm companyform = new CompanyForm();
		Criteria criteria = session.createCriteria(Company.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			company = (Company) criteria.uniqueResult();
			new CopyProperties(company,companyform);
		} else if(req.getAttribute("form")!=null){
                        companyform = (CompanyForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(companyform.getId()));
			company = (Company) criteria.uniqueResult();
		}
		

		req.setAttribute("model",company);
		req.setAttribute("form",companyform);


                   
		
		return mapping.findForward("success");
	}
	
	
}