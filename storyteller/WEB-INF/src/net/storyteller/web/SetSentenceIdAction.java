package net.storyteller.web;

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
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;


public class SetSentenceNameAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Sentence.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Sentence sentence = (Sentence) criteria.uniqueResult();
		sentence.setName(true);
		session.saveOrUpdate(sentence);
		transaction.commit();
		session.flush();


		new HTTPGetRedirection(req, res, "Sentences.do", sentence.getId().toString());
		return null;

		
		
		return mapping.findForward("success");
	}
	
	
}