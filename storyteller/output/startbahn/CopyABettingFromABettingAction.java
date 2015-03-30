package net.startbahn.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;


import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;


import net.enclosing.util.HibernateSession;

public class CopyABettingFromABettingAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Betting.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Betting betting = (Betting) criteria.uniqueResult();
		Betting betting2 = new BettingImpl();
		BeanUtils.copyProperties(betting2,betting);
                betting2.setId(null);
		//betting2.setSomething(null);
		session.saveOrUpdate(betting2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", betting2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}