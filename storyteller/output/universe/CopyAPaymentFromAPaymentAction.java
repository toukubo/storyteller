package net.universe.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.universe.model.*;
import net.universe.model.crud.*;


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

public class CopyAPaymentFromAPaymentAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Payment.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Payment payment = (Payment) criteria.uniqueResult();
		Payment payment2 = new PaymentImpl();
		BeanUtils.copyProperties(payment2,payment);
                payment2.setId(null);
		//payment2.setSomething(null);
		session.saveOrUpdate(payment2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", payment2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}