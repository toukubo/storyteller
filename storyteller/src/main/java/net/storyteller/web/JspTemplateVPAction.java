package net.storyteller.web;

import net.storyteller.beans.JspTemplateForm;
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
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class JspTemplateVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		JspTemplate jsptemplate = new JspTemplateImpl();
		JspTemplateForm jsptemplateform = (JspTemplateForm) form;
		
                		Integer verbInt = jsptemplateform.getVerb();
		jsptemplateform.setVerb(null);

		
		BeanUtils.copyProperties(jsptemplate,jsptemplateform);
		StringFullfiller.fullfil(jsptemplate);
		if(jsptemplateform.getId() == null || jsptemplateform.getId().intValue() == 0){
			jsptemplate.setId(null);
		}else{
			jsptemplate.setId(jsptemplateform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Verb.class);
		criteria2.add(Restrictions.idEq(verbInt));
		Verb verb = (Verb) criteria2.uniqueResult();
		jsptemplate.setVerb(verb);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(jsptemplate);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "JspTemplateDetail.do", jsptemplate.getId().toString());
		return null;

		
	}
	
	
}