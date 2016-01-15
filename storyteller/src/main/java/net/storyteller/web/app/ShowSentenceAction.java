package net.storyteller.web.app;

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

public class ShowSentenceAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Sentence sentence = new SentenceImpl();
		Criteria criteria = session.createCriteria(Sentence.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			sentence = (Sentence) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			sentence = (Sentence) criteria.uniqueResult();
		}

		req.setAttribute("sentence",sentence);
		
		
		Criteria criteria2 = session.createCriteria(ValidationRule.class);
		req.setAttribute("ValidationRules", criteria2.list());
		return mapping.findForward("success");
	}
	
	
}