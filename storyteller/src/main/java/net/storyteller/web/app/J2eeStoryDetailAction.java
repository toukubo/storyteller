package net.storyteller.web.app;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.*;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.Vector;

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
		
		
		if(j2eestory.getId()!=null && j2eestory.getId().intValue()!=0){
			Criteria criteria4 = session.createCriteria(Noun.class);
			criteria4.add(Restrictions.eq("j2eeStory", j2eestory));
			criteria4.addOrder(Order.asc("name"));
			req.setAttribute("Nouns", criteria4.list());

		}
		
		Criteria criteria3 = session.createCriteria(Verb.class);
		criteria3.addOrder(Order.asc("name"));
		req.setAttribute("Verbs", criteria3.list());
		
		Vector vector = new Vector();
		
		if(j2eestory.getId() !=null && j2eestory.getId().intValue()!=0){
			
			Criteria criteria5 = session.createCriteria(Sentence.class);
			criteria5.add(Restrictions.eq("j2eeStory", j2eestory));
			if (StringUtils.isNotBlank(req.getParameter("verb"))) {
				Criteria criteria6 = session.createCriteria(Verb.class);
				criteria6.add(Restrictions.eq("id", Integer.valueOf(req.getParameter("verb"))));
				Verb verb = (Verb) criteria6.uniqueResult();
				criteria5.add(Restrictions.eq("verb", verb));
			}
			
			if (StringUtils.isNotBlank(req.getParameter("noun"))) {
				Criteria criteria6 = session.createCriteria(Noun.class);
				criteria6.add(Restrictions.eq("id", Integer.valueOf(req.getParameter("noun"))));
				Noun noun = (Noun) criteria6.uniqueResult();
				for (Iterator iter = criteria5.list().iterator(); iter.hasNext();) {
					Sentence sentence = (Sentence) iter.next();
					for (Iterator iterator = sentence.getFirstobjective().getOfuse().iterator(); iterator
							.hasNext();) {
						NounUse nounUse = (NounUse) iterator.next();
						if(nounUse.getNoun().getId().intValue() == Integer.valueOf(req.getParameter("noun")).intValue()){
							vector.add(sentence);
							break;
						}
					}
				}
				req.setAttribute("Sentences", vector);
				
			}else{
				req.setAttribute("Sentences", criteria5.list());
				
			}
		}

		
		
		
		
		
		
		
		
		
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

