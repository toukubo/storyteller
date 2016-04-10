package net.storyteller.web;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.beans.SentenceForm;
import net.storyteller.model.*;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SentenceVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Sentence sentence = new SentenceImpl();
		SentenceForm sentenceform = (SentenceForm) form;
		
                		Integer firstobjectiveInt = sentenceform.getFirstobjective();
		sentenceform.setFirstobjective(null);
		Integer verbInt = sentenceform.getVerb();
		sentenceform.setVerb(null);
		Integer secountobjectiveInt = sentenceform.getSecountobjective();
		sentenceform.setSecountobjective(null);
		Integer j2eeStoryInt = sentenceform.getJ2eeStory();
		sentenceform.setJ2eeStory(null);

		
		BeanUtils.copyProperties(sentence,sentenceform);
		StringFullfiller.fullfil(sentence);
		if(sentenceform.getId() == null || sentenceform.getId().intValue() == 0){
			sentence.setId(null);
		}else{
			sentence.setId(sentenceform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(NounClause.class);
		criteria2.add(Restrictions.idEq(firstobjectiveInt));
		NounClause firstobjective = (NounClause) criteria2.uniqueResult();
		sentence.setFirstobjective(firstobjective);
		 criteria2 = session.createCriteria(Verb.class);
		criteria2.add(Restrictions.idEq(verbInt));
		Verb verb = (Verb) criteria2.uniqueResult();
		sentence.setVerb(verb);
		 criteria2 = session.createCriteria(NounClause.class);
		criteria2.add(Restrictions.idEq(secountobjectiveInt));
		NounClause secountobjective = (NounClause) criteria2.uniqueResult();
		sentence.setSecountobjective(secountobjective);
		 criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(j2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		sentence.setJ2eeStory(j2eestory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(sentence);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "CreatesStrutsActionsFromSentence.do", sentence.getId().toString());
		return null;

		
	}
	
	
}


