package net.malta.web.app;

import net.malta.model.*;
import net.malta.beans.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class PostPaymentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Payment payment = new PaymentImpl();
		PaymentForm paymentform = (PaymentForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(paymentform.getId() == null || paymentform.getId().intValue() == 0){
			payment.setId(null);
			paymentform.setId(null);
		}else{
			payment.setId(paymentform.getId());
			Criteria criteria = session.createCriteria(Payment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			payment = (Payment) criteria.uniqueResult();

		}
                		payment.setMail(paymentform.getMail());
		payment.setTotalprice(paymentform.getTotalprice());
		payment.setOnetime(paymentform.getOnetime());


		
		StringFullfiller.fullfil(payment);
                
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(payment);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPaymentDetail.do", payment.getId().toString(),"success=true");
		return null;

		
	}
	
	
}