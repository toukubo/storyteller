package net.clbs.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.clbs.model.*;
import net.clbs.model.crud.*;


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

public class CopyATransitionFromATransitionAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Transition.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Transition transition = (Transition) criteria.uniqueResult();
		Transition transition2 = new TransitionImpl();
		BeanUtils.copyProperties(transition2,transition);
                transition2.setId(null);
		//transition2.setSomething(null);
		session.saveOrUpdate(transition2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", transition2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}