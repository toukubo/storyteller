package net.gasaccounting.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

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


public class PostSalaryPaymentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		SalaryPayment salarypayment = new SalaryPaymentImpl();
		SalaryPaymentForm salarypaymentform = new SalaryPaymentForm();
		Criteria criteria = session.createCriteria(SalaryPayment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			salarypayment = (SalaryPayment) criteria.uniqueResult();
			new CopyProperties(salarypayment,salarypaymentform);
		} else if(req.getAttribute("form")!=null){
                        salarypaymentform = (SalaryPaymentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(salarypaymentform.getId()));
			salarypayment = (SalaryPayment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",salarypayment);
		req.setAttribute("form",salarypaymentform);


                   
		
		return mapping.findForward("success");
	}
	
	
}