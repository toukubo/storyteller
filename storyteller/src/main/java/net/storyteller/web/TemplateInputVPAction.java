package net.storyteller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.beans.TemplateInputForm;
import net.storyteller.model.TemplateInput;
import net.storyteller.model.TemplateInputImpl;
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

public class TemplateInputVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		TemplateInput templateinput = new TemplateInputImpl();
		TemplateInputForm templateinputform = (TemplateInputForm) form;
		
		Integer verbInt = templateinputform.getVerb();
		templateinputform.setVerb(null);

		
		BeanUtils.copyProperties(templateinput,templateinputform);
		StringFullfiller.fullfil(templateinput);
		if(templateinputform.getId() == null || templateinputform.getId().intValue() == 0){
			templateinput.setId(null);
		}else{
			templateinput.setId(templateinputform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Verb.class);
		criteria2.add(Restrictions.idEq(verbInt));
		Verb verb = (Verb) criteria2.uniqueResult();
		templateinput.setVerb(verb);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(templateinput);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "TemplateInputDetailAddingToVerb.do", templateinput.getId().toString());
		return null;

		
	}
	
	
}


