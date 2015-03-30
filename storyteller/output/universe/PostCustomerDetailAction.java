package net.universe.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.universe.model.*;
import net.universe.beans.*;


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


public class PostCustomerDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Customer customer = new CustomerImpl();
		CustomerForm customerform = new CustomerForm();
		Criteria criteria = session.createCriteria(Customer.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			customer = (Customer) criteria.uniqueResult();
			new CopyProperties(customer,customerform);
		} else if(req.getAttribute("form")!=null){
                        customerform = (CustomerForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(customerform.getId()));
			customer = (Customer) criteria.uniqueResult();
		}
		

		req.setAttribute("model",customer);
		req.setAttribute("form",customerform);


                   
		
		return mapping.findForward("success");
	}
	
	
}