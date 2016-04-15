package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.beans.*;


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
import net.storyteller.desktop.CopyProperties;


public class PostIncomePaymentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		IncomePayment incomePayment = new IncomePaymentImpl();
		IncomePaymentForm incomePaymentform = new IncomePaymentForm();
		Criteria criteria = session.createCriteria(IncomePayment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			incomePayment = (IncomePayment) criteria.uniqueResult();
			new CopyProperties(incomePayment,incomePaymentform);
		} else if(req.getAttribute("form")!=null){
                        incomePaymentform = (IncomePaymentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(incomePaymentform.getId()));
			incomePayment = (IncomePayment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",incomePayment);
		req.setAttribute("form",incomePaymentform);


                  Criteria criteriaJ2eeStory= session.createCriteria(J2eeStory.class);
			req.setAttribute("J2eeStorys", criteriaJ2eeStory.list());

 
		
		return mapping.findForward("success");
	}
	
	
}