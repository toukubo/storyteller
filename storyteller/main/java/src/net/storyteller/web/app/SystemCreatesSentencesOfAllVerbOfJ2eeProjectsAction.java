package net.storyteller.web.app;

import java.net.URL;
import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.model.Noun;
import net.storyteller.model.NounClause;
import net.storyteller.model.NounClauseImpl;
import net.storyteller.model.NounUse;
import net.storyteller.model.NounUseImpl;
import net.storyteller.model.Sentence;
import net.storyteller.model.SentenceImpl;
import net.storyteller.model.Verb;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class SystemCreatesSentencesOfAllVerbOfJ2eeProjectsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext(),50);
		Criteria criteria = session.createCriteria(Noun.class);
		Vector vector = new Vector();
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			boolean exists = false;
			Noun noun = (Noun) iter.next();
			for (Iterator iterator = noun.getNounUses().iterator(); iterator.hasNext();) {
				NounUse nounuse = (NounUse) iterator.next();
				for (Iterator iterator2 = nounuse.getNounClause().getAsfirst().iterator(); iterator2.hasNext();) {
					Sentence sentence = (Sentence) iterator2.next();
					if(sentence.getVerb().getName().equals("ALL")){
						exists = true;
						break;
					}
				}
			}
			
			if(!exists){
				Criteria criteria2 = session.createCriteria(Verb.class);
				criteria2.add(Restrictions.eq("name","ALL"));
				Verb verb = (Verb)criteria2.uniqueResult();
				
				
				Transaction transaction = session.beginTransaction();
				
				NounClause newNounClause = new  NounClauseImpl();
				StringFullfiller.fullfil(newNounClause);
				session.saveOrUpdate(newNounClause);
				transaction.commit();
				session.flush();
				
				
				transaction = session.beginTransaction();
				Sentence sentence = new SentenceImpl();
				sentence.setFirstobjective(newNounClause);
				sentence.setVerb(verb);
				sentence.setJ2eeStory(noun.getJ2eeStory());
				StringFullfiller.fullfil(sentence);
				session.save(sentence);
				transaction.commit();
				session.flush();
				
				transaction = session.beginTransaction();
				NounUse nounUse = new NounUseImpl();
				nounUse.setNoun(noun);
				nounUse.setNounClause(newNounClause);
				nounUse.setOforder(1);
				nounUse.setMutiple(true);
				session.save(nounUse);
				transaction.commit();
				session.flush();
				
				 
				try{
//				HttpClient client = new HttpClient();
////				client.setParams(new HttpClientParams(new HttpClientParams(new HttpParams().)))
//				URL url = null;
//				GetMethod getMethod = null;
//				if(req.getServerPort() != 80){
//					getMethod = new GetMethod("http://" + req.getServerName() + ":" + req.getServerPort() + req.getContextPath() + "/CreatesStrutsActionsFromSentence.do");
//				}else{
//					getMethod = new GetMethod("http://" + req.getServerName() +"/"+ req.getContextPath() + "/CreatesStrutsActionsFromSentence.do");
//				}
//				
//				getMethod.setFollowRedirects(true);
//				getMethod.getParams().setParameter("http.socket.timeout", new Integer(40000));
//
//				getMethod.setQueryString(new NameValuePair[]{new NameValuePair("id",sentence.getId().toString())});
////				getMethod.set
//				client.executeMethod(getMethod);
//				
//				System.err.println("hey it is finished but ..." + getMethod.getResponseBody());
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		req.setAttribute("nouns",vector);
		session.flush();
		
		
		
		return mapping.findForward("success");
	}
	
	
}
