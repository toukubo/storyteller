package net.universe.web.app;

import net.universe.model.*;
import net.universe.beans.*;

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
import org.hibernate.Transaction;
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


                		Integer contractInt = paymentform.getContract();
		paymentform.setContract(null);
		Integer narratorInt = paymentform.getNarrator();
		paymentform.setNarrator(null);

		
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
                		payment.setCommission(paymentform.getCommission());
		payment.setPaymentdate(paymentform.getPaymentdate());
		payment.setPaymentflag(paymentform.isPaymentflag());
		payment.setTotal(paymentform.getTotal());
		payment.setNo(paymentform.getNo());
		payment.setTax(paymentform.getTax());
		payment.setManagementrate(paymentform.getManagementrate());
		payment.setManagementprice(paymentform.getManagementprice());
		payment.setWithholdingtax(paymentform.getWithholdingtax());
		payment.setPrice(paymentform.getPrice());


		
		StringFullfiller.fullfil(payment);
                		Criteria criteria2 = session.createCriteria(Contract.class);
		criteria2.add(Restrictions.idEq(contractInt));
		Contract contract = (Contract) criteria2.uniqueResult();
		payment.setContract(contract);
		criteria2 = session.createCriteria(Narrator.class);
		criteria2.add(Restrictions.idEq(narratorInt));
		Narrator narrator = (Narrator) criteria2.uniqueResult();
		payment.setNarrator(narrator);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(payment);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPaymentDetail.do", payment.getId().toString());
		return null;

		
	}
	
	
}