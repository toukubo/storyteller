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

public class CopyAOperationFromAOperationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Operation.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Operation operation = (Operation) criteria.uniqueResult();
		Operation operation2 = new OperationImpl();
		BeanUtils.copyProperties(operation2,operation);
                operation2.setId(null);
		//operation2.setSomething(null);
		session.saveOrUpdate(operation2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", operation2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}