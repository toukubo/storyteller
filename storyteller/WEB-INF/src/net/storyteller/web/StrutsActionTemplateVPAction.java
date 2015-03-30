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

public class StrutsActionTemplateVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		StrutsActionTemplate strutsactiontemplate = new StrutsActionTemplateImpl();
		StrutsActionTemplateForm strutsactiontemplateform = (StrutsActionTemplateForm) form;
		
                		Integer targeteeactionInt = strutsactiontemplateform.gettargeteeaction();
		strutsactiontemplateform.settargeteeaction(null);
		Integer verbInt = strutsactiontemplateform.getverb();
		strutsactiontemplateform.setverb(null);
		Integer jspTemplateInt = strutsactiontemplateform.getjspTemplate();
		strutsactiontemplateform.setjspTemplate(null);

		
		BeanUtils.copyProperties(strutsactiontemplate,strutsactiontemplateform);
		StringFullfiller.fullfil(strutsactiontemplate);
		if(strutsactiontemplateform.getId() == null || strutsactiontemplateform.getId().intValue() == 0){
			strutsactiontemplate.setId(null);
		}else{
			strutsactiontemplate.setId(strutsactiontemplateform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Targeteeaction.class);
		criteria2.add(Restrictions.idEq(TargeteeactionInt));
		Targeteeaction targeteeaction = (Targeteeaction) criteria2.uniqueResult();
		StrutsActionTemplate.setTargeteeaction(targeteeaction);
		Criteria criteria2 = session.createCriteria(Verb.class);
		criteria2.add(Restrictions.idEq(VerbInt));
		Verb verb = (Verb) criteria2.uniqueResult();
		StrutsActionTemplate.setVerb(verb);
		Criteria criteria2 = session.createCriteria(JspTemplate.class);
		criteria2.add(Restrictions.idEq(JspTemplateInt));
		JspTemplate jsptemplate = (JspTemplate) criteria2.uniqueResult();
		StrutsActionTemplate.setJspTemplate(jsptemplate);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(strutsactiontemplate);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "StrutsActionTemplateDetail.do", strutsactiontemplate.getId().toString());
		return null;

		
	}
	
	
}


