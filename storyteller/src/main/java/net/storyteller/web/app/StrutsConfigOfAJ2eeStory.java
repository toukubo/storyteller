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

public class StrutsConfigOfAJ2eeStory extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		J2eeStory j2eeStory = new J2eeStoryImpl();
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext(),100);
		Criteria criteria = session.createCriteria(J2eeStory.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			j2eeStory = (J2eeStory) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			j2eeStory = (J2eeStory) criteria.uniqueResult();
		}
		
		if(req.getParameter("name")!=null){
			criteria.add(Restrictions.eq("name",req.getParameter("name")));
			j2eeStory = (J2eeStory) criteria.uniqueResult();
		}
		
		

		req.setAttribute("j2eeStory", j2eeStory);
		req.setAttribute("sentences",j2eeStory.getSentences());
		
		return mapping.findForward("success");
	}
	
	
}
