package net.storyteller.web;

import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;

public class J2eeStoryDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		J2eeStory j2eestory = new J2eeStoryImpl();
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

		req.setAttribute("j2eestory",j2eestory);
		
		
		Criteria criteria4 = session.createCriteria(Noun.class);
		req.setAttribute("Nouns", criteria4.list());
		
		Criteria criteria3 = session.createCriteria(Verb.class);
		req.setAttribute("Verbs", criteria3.list());
		
		
		
		
		
		
		
		int i = 0;
		for (Iterator iter = j2eestory.getSentences().iterator(); iter.hasNext();) {
			Sentence sentence = (Sentence) iter.next();
			if(!sentence.getVerb().getName().equals("ALL")){
				i++;
			}
		}
		req.setAttribute("sum", i);
		
		
		
		
		
		return mapping.findForward("success");
	}
	
	
}

