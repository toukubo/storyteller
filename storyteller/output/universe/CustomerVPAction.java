package net.universe.web.app;

import net.universe.model.*;
import net.universe.model.crud.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;

import org.apache.commons.beanutils.BeanUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class CustomerVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Customer customer = new CustomerImpl();
		CustomerForm customerform = (CustomerForm) form;
		
		
		BeanUtils.copyProperties(customer,customerform);
		StringFullfiller.fullfil(customer);
		if(customerform.getId() == null || customerform.getId().intValue() == 0){
			customer.setId(null);
		}else{
			customer.setId(customerform.getId());
		}
		
		BeanFactory factory = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		SessionFactory sessionFactory = (SessionFactory) factory
				.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(customer);
		transaction.commit();
		session.flush();
		sessionFactory.close();
		
		
		req.setAttribute("id", customer.getId());
		return mapping.findForward("success");
		
	}
	
	
}