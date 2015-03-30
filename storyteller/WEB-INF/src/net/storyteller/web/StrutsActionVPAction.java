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

public class StrutsActionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		StrutsAction strutsaction = new StrutsActionImpl();
		StrutsActionForm strutsactionform = (StrutsActionForm) form;
		
                		Integer sentenceInt = strutsactionform.getsentence();
		strutsactionform.setsentence(null);
		Integer targeteejspInt = strutsactionform.gettargeteejsp();
		strutsactionform.settargeteejsp(null);
		Integer targeteeactionInt = strutsactionform.gettargeteeaction();
		strutsactionform.settargeteeaction(null);

		
		BeanUtils.copyProperties(strutsaction,strutsactionform);
		StringFullfiller.fullfil(strutsaction);
		if(strutsactionform.getId() == null || strutsactionform.getId().intValue() == 0){
			strutsaction.setId(null);
		}else{
			strutsaction.setId(strutsactionform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Sentence.class);
		criteria2.add(Restrictions.idEq(SentenceInt));
		Sentence sentence = (Sentence) criteria2.uniqueResult();
		StrutsAction.setSentence(sentence);
		Criteria criteria2 = session.createCriteria(Targeteejsp.class);
		criteria2.add(Restrictions.idEq(TargeteejspInt));
		Targeteejsp targeteejsp = (Targeteejsp) criteria2.uniqueResult();
		StrutsAction.setTargeteejsp(targeteejsp);
		Criteria criteria2 = session.createCriteria(Targeteeaction.class);
		criteria2.add(Restrictions.idEq(TargeteeactionInt));
		Targeteeaction targeteeaction = (Targeteeaction) criteria2.uniqueResult();
		StrutsAction.setTargeteeaction(targeteeaction);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(strutsaction);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "StrutsActionDetail.do", strutsaction.getId().toString());
		return null;

		
	}
	
	
}


