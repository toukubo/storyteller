package net.universe.web.app;

import net.universe.model.*;
import net.universe.beans.*;

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


public class PostCustomerDetailVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CustomerDetail customerDetail = new CustomerDetailImpl();
		CustomerDetailForm customerDetailform = (CustomerDetailForm) form;

                String error = "";


                		Integer customerInt = customerDetailform.getCustomer();
		customerDetailform.setCustomer(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(customerDetailform.getId() == null || customerDetailform.getId().intValue() == 0){
			customerDetail.setId(null);
			customerDetailform.setId(null);
		}else{
			customerDetail.setId(customerDetailform.getId());
			Criteria criteria = session.createCriteria(CustomerDetail.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			customerDetail = (CustomerDetail) criteria.uniqueResult();

		}
                		customerDetail.setZipthree(customerDetailform.getZipthree());
		customerDetail.setZipfour(customerDetailform.getZipfour());
		customerDetail.setAddress(customerDetailform.getAddress());


		
		StringFullfiller.fullfil(customerDetail);
                		Criteria criteria2 = session.createCriteria(Customer.class);
		criteria2.add(Restrictions.idEq(customerInt));
		Customer customer = (Customer) criteria2.uniqueResult();
		customerDetail.setCustomer(customer);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(customerDetail);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCustomerDetailDetail.do", customerDetail.getId().toString());
		return null;

		
	}
	
	
}