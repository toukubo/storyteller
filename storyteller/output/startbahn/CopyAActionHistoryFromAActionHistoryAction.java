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

public class CopyAActionHistoryFromAActionHistoryAction extends Action{
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
		ActionHistory actionHistory2 = new ActionHistoryImpl();
		BeanUtils.copyProperties(actionHistory2,actionHistory);
                actionHistory2.setId(null);
		//actionHistory2.setSomething(null);
		session.saveOrUpdate(actionHistory2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", actionHistory2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}