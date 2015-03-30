package net.GKNJR003.web.app;

import net.GKNJR003.model.*;
import net.GKNJR003.model.crud.*;

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

public class MS_COPVPambadasAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		MS_COP mS_COP = new MS_COPImpl();
		MS_COPForm mS_COPform = (MS_COPForm) form;
		
		
		BeanUtils.copyProperties(mS_COP,mS_COPform);
		StringFullfiller.fullfil(mS_COP);
		if(mS_COPform.getId() == null || mS_COPform.getId().intValue() == 0){
			mS_COP.setId(null);
		}else{
			mS_COP.setId(mS_COPform.getId());
		}
		
		BeanFactory factory = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		SessionFactory sessionFactory = (SessionFactory) factory
				.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(mS_COP);
		transaction.commit();
		session.flush();
		sessionFactory.close();
		
		
		req.setAttribute("id", mS_COP.getId());
		return mapping.findForward("success");
		
	}
	
	
}