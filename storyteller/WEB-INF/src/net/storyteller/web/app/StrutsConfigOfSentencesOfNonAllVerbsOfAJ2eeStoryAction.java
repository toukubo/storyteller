package net.storyteller.web.app;

import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.J2eeStoryImpl;
import net.storyteller.model.Sentence;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class StrutsConfigOfSentencesOfNonAllVerbsOfAJ2eeStoryAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		J2eeStory j2eeStory = new J2eeStoryImpl();
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Criteria criteria = session.createCriteria(J2eeStory.class);
		criteria.add(Restrictions.eq("name", new String(req.getParameter("name"))));
//		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		j2eeStory = (J2eeStory) criteria.uniqueResult();
		req.setAttribute("j2eeStory", j2eeStory);
		
		
		Vector vector = new Vector();
		for (Iterator iter = j2eeStory.getSentences().iterator(); iter.hasNext();) {
			Sentence sentence = (Sentence) iter.next();
			if(!sentence.getVerb().getName().equals("ALL")){
				vector.add(sentence);
			}
		}
		req.setAttribute("sentences",vector);
		
		return mapping.findForward("success");
	}
	
	
}

