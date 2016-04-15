package net.storyteller.web.app;

import java.util.Iterator;

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
import org.hibernate.criterion.Restrictions;

public class UrlsOfBeansOfAJ2eeStoryByNameAction extends Action{
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
		j2eeStory = (J2eeStory)criteria.uniqueResult();

		StringBuilder builder = new StringBuilder();
		for (Iterator iter = j2eeStory.getNouns().iterator(); iter.hasNext();) {
			Noun noun = (Noun) iter.next();
			String string = null;
			if(req.getServerPort() != 80){
				string = "http://" + req.getServerName() + ":" + req.getServerPort() + "/" + req.getContextPath() + "/"
						+ "output/" + j2eeStory.getName() + "/beans/" + noun.getName() + "Form.java\r\n";
			}else{
				string = "http://" + req.getServerName() + "/" + req.getContextPath() + "/"
						+ "output/" + j2eeStory.getName() + "/beans/" + noun.getName() + "Form.java\r\n";
			}
			res.getWriter().write(string);
		}
		 res.getWriter().flush();
		 res.getWriter().close();

//		req.setAttribute("html", builder.toString());
		return null;
	}
	
	
}
