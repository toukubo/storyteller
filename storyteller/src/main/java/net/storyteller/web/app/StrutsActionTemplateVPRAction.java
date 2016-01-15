package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.beans.StrutsActionTemplateForm;
import net.storyteller.model.JspTemplate;
import net.storyteller.model.StrutsActionTemplate;
import net.storyteller.model.StrutsActionTemplateImpl;
import net.storyteller.model.Verb;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class StrutsActionTemplateVPRAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		StrutsActionTemplate strutsactiontemplate = new StrutsActionTemplateImpl();
		StrutsActionTemplateForm strtusactointemplateform = (StrutsActionTemplateForm) form;
		Integer VerbInt = strtusactointemplateform.getVerb();
		strtusactointemplateform.setVerb(null);
		Integer TargeteeactionInt = strtusactointemplateform.getTargeteeaction();
		strtusactointemplateform.setTargeteeaction(null);
		Integer JspTemplateInt = strtusactointemplateform.getJspTemplate();
		strtusactointemplateform.setJspTemplate(null);

		BeanUtils.copyProperties(strutsactiontemplate, strtusactointemplateform);
		StringFullfiller.fullfil(strutsactiontemplate);

		if (strtusactointemplateform.getId() == null || strtusactointemplateform.getId().intValue() == 0) {
			strutsactiontemplate.setId(null);
		} else {
			strutsactiontemplate.setId(strtusactointemplateform.getId());
		}

		//this is sample. change below according to each model to VP.
		//		strutsactiontemplate.setContent(strtusactointemplateform.getContent());

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Verb.class);
		criteria.add(Restrictions.idEq(VerbInt));
		Verb verb = (Verb) criteria.uniqueResult();
		strutsactiontemplate.setVerb(verb);
		
		criteria = session.createCriteria(StrutsActionTemplate.class);
		criteria.add(Restrictions.idEq(TargeteeactionInt));
		StrutsActionTemplate targeteeaction = (StrutsActionTemplate) criteria.uniqueResult();
		strutsactiontemplate.setTargeteeaction(targeteeaction);
		
		criteria = session.createCriteria(JspTemplate.class);
		criteria.add(Restrictions.idEq(JspTemplateInt));
		JspTemplate jspTemplate= (JspTemplate) criteria.uniqueResult();
		strutsactiontemplate.setJspTemplate(jspTemplate);

		session.saveOrUpdate(strutsactiontemplate);
		transaction.commit();
		session.flush();

		req.setAttribute("id", strutsactiontemplate.getId());
		return mapping.findForward("success");
		
		
		
	}
	
	
}
