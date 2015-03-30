package net.startbahn.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;
import net.enclosing.util.HTTPGetRedirection;


public class SetActionHistoryNonDateAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(ActionHistory.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		ActionHistory actionHistory = (ActionHistory) criteria.uniqueResult();
		actionHistory.setDate(false);
		session.saveOrUpdate(actionHistory);
		transaction.commit();
		session.flush();


		new HTTPGetRedirection(req, res, "ActionHistorys.do", actionHistory.getId().toString());
		return null;
	}
	
	
}