package net.storyteller.web;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

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

public class J2eeStoryVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		J2eeStory j2eestory = new J2eeStoryImpl();
		J2eeStoryForm j2eestoryform = (J2eeStoryForm) form;
		

		
		BeanUtils.copyProperties(j2eestory,j2eestoryform);
		StringFullfiller.fullfil(j2eestory);
		if(j2eestoryform.getId() == null || j2eestoryform.getId().intValue() == 0){
			j2eestory.setId(null);
		}else{
			j2eestory.setId(j2eestoryform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(j2eestory);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "J2eeStoryDetail.do", j2eestory.getId().toString());
		return null;

		
	}
	
	
}


