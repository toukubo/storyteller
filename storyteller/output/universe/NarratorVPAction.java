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

public class NarratorVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Narrator narrator = new NarratorImpl();
		NarratorForm narratorform = (NarratorForm) form;
		
		
		BeanUtils.copyProperties(narrator,narratorform);
		StringFullfiller.fullfil(narrator);
		if(narratorform.getId() == null || narratorform.getId().intValue() == 0){
			narrator.setId(null);
		}else{
			narrator.setId(narratorform.getId());
		}
		
		BeanFactory factory = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		SessionFactory sessionFactory = (SessionFactory) factory
				.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(narrator);
		transaction.commit();
		session.flush();
		sessionFactory.close();
		
		
		req.setAttribute("id", narrator.getId());
		return mapping.findForward("success");
		
	}
	
	
}