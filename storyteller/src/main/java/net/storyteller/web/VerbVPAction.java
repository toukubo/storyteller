package net.storyteller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.beans.VerbForm;
import net.storyteller.model.Verb;
import net.storyteller.model.VerbImpl;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VerbVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Verb verb = new VerbImpl();
		VerbForm verbform = (VerbForm) form;
		
                
		
		BeanUtils.copyProperties(verb,verbform);
		StringFullfiller.fullfil(verb);
		if(verbform.getId() == null || verbform.getId().intValue() == 0){
			verb.setId(null);
		}else{
			verb.setId(verbform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(verb);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "VerbDetail.do", verb.getId().toString());
		return null;

		
	}
	
	
}


