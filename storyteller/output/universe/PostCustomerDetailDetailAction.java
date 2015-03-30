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


public class PostCustomerDetailDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		CustomerDetail customerDetail = new CustomerDetailImpl();
		CustomerDetailForm customerDetailform = new CustomerDetailForm();
		Criteria criteria = session.createCriteria(CustomerDetail.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			customerDetail = (CustomerDetail) criteria.uniqueResult();
			new CopyProperties(customerDetail,customerDetailform);
		} else if(req.getAttribute("form")!=null){
                        customerDetailform = (CustomerDetailForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(customerDetailform.getId()));
			customerDetail = (CustomerDetail) criteria.uniqueResult();
		}
		

		req.setAttribute("model",customerDetail);
		req.setAttribute("form",customerDetailform);


                  Criteria criteriaCustomer= session.createCriteria(Customer.class);
			req.setAttribute("Customers", criteriaCustomer.list());

 
		
		return mapping.findForward("success");
	}
	
	
}