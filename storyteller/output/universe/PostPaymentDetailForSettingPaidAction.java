package net.universe.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.universe.model.*;
import net.universe.beans.*;


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


public class PostPaymentDetailForSettingPaidAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Payment payment = new PaymentImpl();
		PaymentForm paymentform = new PaymentForm();
		Criteria criteria = session.createCriteria(Payment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			payment = (Payment) criteria.uniqueResult();
			new CopyProperties(payment,paymentform);
		} else if(req.getAttribute("form")!=null){
                        paymentform = (PaymentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(paymentform.getId()));
			payment = (Payment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",payment);
		req.setAttribute("form",paymentform);


                  Criteria criteriaContract= session.createCriteria(Contract.class);
			req.setAttribute("Contracts", criteriaContract.list());

Criteria criteriaNarrator= session.createCriteria(Narrator.class);
			req.setAttribute("Narrators", criteriaNarrator.list());

Criteria criteriaContractDetail= session.createCriteria(ContractDetail.class);
			req.setAttribute("ContractDetails", criteriaContractDetail.list());

 
		
		return mapping.findForward("success");
	}
	
	
}