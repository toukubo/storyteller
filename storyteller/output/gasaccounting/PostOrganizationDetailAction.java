package net.gasaccounting.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

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


public class PostOrganizationDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Organization organization = new OrganizationImpl();
		OrganizationForm organizationform = new OrganizationForm();
		Criteria criteria = session.createCriteria(Organization.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			organization = (Organization) criteria.uniqueResult();
			new CopyProperties(organization,organizationform);
		} else if(req.getAttribute("form")!=null){
                        organizationform = (OrganizationForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(organizationform.getId()));
			organization = (Organization) criteria.uniqueResult();
		}
		

		req.setAttribute("model",organization);
		req.setAttribute("form",organizationform);


                   
		
		return mapping.findForward("success");
	}
	
	
}