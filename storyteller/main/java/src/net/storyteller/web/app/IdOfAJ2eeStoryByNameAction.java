package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.J2eeStoryImpl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class IdOfAJ2eeStoryByNameAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		J2eeStory j2eeStory = new J2eeStoryImpl();
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());

		Criteria criteria = session.createCriteria(J2eeStory.class);
		criteria.add(Restrictions.eq("name", new String(req.getParameter("name"))));
		j2eeStory = (J2eeStory) criteria.uniqueResult();
		res.getWriter().write(j2eeStory.getId().toString());
		res.getWriter().flush();
		res.getWriter().close();
		return null;
	}
	
	
}

