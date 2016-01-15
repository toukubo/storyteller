package net.storyteller.web.app;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.J2eeStoryImpl;
import net.storyteller.model.Sentence;
import net.storyteller.model.StrutsAction;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UrlsOfStrutsActionsOfNonAllVerbOfAJ2eeStoryByNameAction extends Action{
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
		StringBuilder builder
		 = new StringBuilder();
		for (Iterator iter = j2eeStory.getSentences().iterator(); iter.hasNext();) {
			Sentence sentence = (Sentence) iter.next();
			if(!sentence.getVerb().getName().equals("ALL")){
				for (Iterator iterator = sentence.getStrutsActions().iterator(); iterator.hasNext();) {
					StrutsAction strutsAction = (StrutsAction) iterator.next();
					String url = "";
					if(req.getServerPort() != 80){
						url = "http://" + req.getServerName() + ":" + req.getServerPort() + "/" + req.getContextPath() + "/"
						+ "output/" + j2eeStory.getName() + "/" + strutsAction.getFilename() + "\r\n";
					}else{
						url = "http://" + req.getServerName() + "/" + req.getContextPath() + "/"
								+ "output/" + j2eeStory.getName() + "/" + strutsAction.getFilename()+ "\r\n";
					}
					res.getWriter().write(url);
				}
				
			}
		}
		 res.getWriter().flush();
		 res.getWriter().close();
		 return null;
	}
	
	
}


