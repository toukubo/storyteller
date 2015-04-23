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

public class ValidationRuleVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ValidationRule validationrule = new ValidationRuleImpl();
		ValidationRuleForm validationruleform = (ValidationRuleForm) form;
		
                
		
		BeanUtils.copyProperties(validationrule,validationruleform);
		StringFullfiller.fullfil(validationrule);
		if(validationruleform.getId() == null || validationruleform.getId().intValue() == 0){
			validationrule.setId(null);
		}else{
			validationrule.setId(validationruleform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(validationrule);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ValidationRuleDetail.do", validationrule.getId().toString());
		return null;

		
	}
	
	
}


