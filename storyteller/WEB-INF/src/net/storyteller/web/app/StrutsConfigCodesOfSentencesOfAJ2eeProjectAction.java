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

public class StrutsConfigCodesOfSentencesOfAJ2eeProjectAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		J2eeStory j2eestory = new J2eeStoryImpl();
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria = session.createCriteria(J2eeStory.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			j2eestory = (J2eeStory) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			j2eestory = (J2eeStory) criteria.uniqueResult();
		}
		
		
		Criteria criteria2 = session.createCriteria(Sentence.class);
		criteria2.add(Restrictions.eq("j2eeStory",j2eestory));
		Vector vector = new Vector();
		for (Iterator iter = criteria2.list().iterator(); iter.hasNext();) {
			Sentence sentence = (Sentence) iter.next();
			vector.add(sentence.getStrutsConfigCode());
		}
		req.setAttribute("strutsactioncodes",vector);

		req.setAttribute("j2eestory", j2eestory);
		
		
		
		
		return mapping.findForward("success");
	}
	
	
}
