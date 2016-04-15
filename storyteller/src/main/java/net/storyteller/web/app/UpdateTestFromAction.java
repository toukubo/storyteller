package net.storyteller.web.app;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiler;
import net.storyteller.beans.TestForm;
import net.storyteller.model.IntraUser;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.J2eeStoryImpl;
import net.storyteller.model.Jsp;
import net.storyteller.model.NounUse;
import net.storyteller.model.Sentence;
import net.storyteller.model.Test;
import net.storyteller.model.TestImpl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class UpdateTestFromAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		IntraUser intraUser = (IntraUser) req.getAttribute("u");
		if(intraUser==null){
			Criteria criteriaIntraUser = session
					.createCriteria(IntraUser.class);
			criteriaIntraUser.add(Restrictions.eq("id", new Integer(1)));
			intraUser = (IntraUser) criteriaIntraUser.uniqueResult();
		}		
		J2eeStory j2eeStory = new J2eeStoryImpl();

		Criteria criteria = session.createCriteria(J2eeStory.class);
		criteria
				.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		j2eeStory = (J2eeStory) criteria.uniqueResult();
		req.setAttribute("j2eeStory", j2eeStory);
		
		Criteria criteriaTest = session.createCriteria(Test.class);
		req.setAttribute("Tests", criteriaTest.list());
		
		for (Iterator iter = j2eeStory.getSentences().iterator(); iter.hasNext();) {
			Sentence sentence = (Sentence) iter.next();
			if( ( sentence.getMaintest()==null || sentence.getMaintest().getId().intValue() ==0 ) && !sentence.getVerb().getName().equals("ALL")){
				Test test = new TestImpl();
				test.setAsmain(sentence);
				test.setJ2eeStory(j2eeStory);
				if(sentence.getJsps().size()>0){
					test.setJsp((Jsp)sentence.getJsps().iterator().next());
				}
				test.setResponsible(intraUser);
				test.setCreator(intraUser);
				test.setSummery(((NounUse)sentence.getFirstobjective().getOfuse().iterator().next()).getNoun().getJapanese() + sentence.getVerb().getJapanese());
				test.setResponsible(intraUser);
				test.setCreator(intraUser);
				test.setDebugger(intraUser);
				
				StringFullfiler.fullfil(test);
				Transaction transaction = session.beginTransaction();
				session.save(test);
				transaction.commit();
				session.flush();
				
				sentence.setMaintest(test);
				transaction = session.beginTransaction();
				session.saveOrUpdate(sentence);
				transaction.commit();
				session.flush();
				
			}
		}
		
		


		Test test = new TestImpl();
		TestForm testform = new TestForm();
                   
		new HTTPGetRedirection(req, res, "AjaxDisplayTests.do",null, "j2eeStory="+j2eeStory.getId().toString());
		return null;



	}
}