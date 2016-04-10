package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.beans.JspTemplateForm;
import net.storyteller.model.JspTemplate;
import net.storyteller.model.JspTemplateImpl;
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

public class JSPTemplateVRPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		JspTemplate jsptemplate = new JspTemplateImpl();
		JspTemplateForm jsptemplateform = (JspTemplateForm) form;
		Integer VerbInt = jsptemplateform.getVerb();
		System.err.println(VerbInt + " is verb int at top----------------------");
		System.err.println(jsptemplateform.getVerb() + " is verb int of jsptemplateform ----------------------");
		System.err.println("the template is " + jsptemplateform.getTemplate());
		jsptemplateform.setVerb(null);

		BeanUtils.copyProperties(jsptemplate, jsptemplateform);
		StringFullfiller.fullfil(jsptemplate);

		if (jsptemplateform.getId() == null || jsptemplateform.getId().intValue() == 0) {
			jsptemplate.setId(null);
		} else {
			jsptemplate.setId(jsptemplateform.getId());
		}

		//this is sample. change below according to each model to VP.
		//		jsptemplate.setContent(jsptemplateform.getContent());

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Verb.class);
		criteria.add(Restrictions.idEq(VerbInt));
		System.err.println(VerbInt + " is verb int ----------------------");
		Verb verb = (Verb)criteria.uniqueResult();
		jsptemplate.setVerb(verb);
		System.err.println(verb.getId() + " is id ---------------------------------");

		session.saveOrUpdate(jsptemplate);
		transaction.commit();
		session.flush();
		
		req.setAttribute("id", jsptemplate.getId());
		return mapping.findForward("success");
		
	}
	
	
}
