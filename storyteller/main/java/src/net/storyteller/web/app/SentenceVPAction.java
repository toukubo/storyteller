package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.beans.SentenceForm;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.Noun;
import net.storyteller.model.NounClause;
import net.storyteller.model.NounClauseImpl;
import net.storyteller.model.NounUse;
import net.storyteller.model.NounUseImpl;
import net.storyteller.model.Sentence;
import net.storyteller.model.SentenceImpl;
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
		
		NounUse firstobjectiveNounUse = new NounUseImpl();
		NounClause firstobjectiveclause = new NounClauseImpl();
		
 		Criteria criteria2 = session.createCriteria(Noun.class);
		criteria2.add(Restrictions.idEq(firstobjectiveInt));
		Noun firstobjectivenoun = (Noun) criteria2.uniqueResult();
		firstobjectiveNounUse.setNoun(firstobjectivenoun);
		firstobjectiveNounUse.setNounClause(firstobjectiveclause);
		firstobjectiveNounUse.setOforder(1);
		firstobjectiveclause.setCode("");
		
		criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(j2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		sentence.setJ2eeStory(j2eestory);
		
		criteria2 = session.createCriteria(Verb.class);
		criteria2.add(Restrictions.idEq(verbInt));
		Verb verb = (Verb) criteria2.uniqueResult();
		sentence.setVerb(verb);
		
		criteria2 = session.createCriteria(Noun.class);
		criteria2.add(Restrictions.idEq(secountobjectiveInt));
		Noun secountobjective = (Noun) criteria2.uniqueResult();
		NounUse secoundnounUse =new  NounUseImpl();
		NounClause secoundnounclause = new  NounClauseImpl();
		secoundnounclause.setCode("");
		secoundnounUse.setNounClause(secoundnounclause);
		secoundnounUse.setNoun(secountobjective);
		secoundnounUse.setOforder(1);
		
		sentence.setFirstobjective(firstobjectiveclause);
		
		Transaction transaction = session.beginTransaction();
		
		session.save(firstobjectiveclause);
		session.save(firstobjectiveNounUse);
		if(secountobjective!=null){
			session.save(secoundnounclause);
			session.save(secoundnounUse);
			sentence.setSecountobjective(secoundnounclause);
		}
		session.save(sentence);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "CreatesStrutsActionsFromSentence.do", sentence.getId().toString());
		return null;

		
	}
	
	
}


