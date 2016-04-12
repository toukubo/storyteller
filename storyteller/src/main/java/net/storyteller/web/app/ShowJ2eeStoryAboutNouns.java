package net.storyteller.web.app;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.J2eeStoryImpl;
import net.storyteller.model.Noun;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import static net.storyteller.web.util.HttpUtil.isAcceptJSON;
import static net.storyteller.web.util.JSONResponseUtil.writeResponseAsJSON;

public class ShowJ2eeStoryAboutNouns extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		J2eeStory j2eeStory = new J2eeStoryImpl();
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Criteria criteria = session.createCriteria(J2eeStory.class);
		criteria
				.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		j2eeStory = (J2eeStory) criteria.uniqueResult();
		req.setAttribute("j2eeStory", j2eeStory);
		
		Criteria criteriaNoun = session.createCriteria(Noun.class);
		criteriaNoun.add(Restrictions.eq("j2eeStory", j2eeStory));
		criteriaNoun.addOrder(Order.asc("name"));
		List nouns = criteriaNoun.list();
		req.setAttribute("Nouns", nouns);
		
		if ( isAcceptJSON(req)) {
			writeResponseAsJSON(res, nouns);
			return null;			
		}
		
		return mapping.findForward("success");
	}
	
	
}

