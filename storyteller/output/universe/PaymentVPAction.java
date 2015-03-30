package net.universe.web;

import net.universe.model.*;
import net.universe.model.crud.*;

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

public class PaymentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Payment payment = new PaymentImpl();
		PaymentForm paymentform = (PaymentForm) form;
		
                		Integer contractInt = paymentform.getContract();
		paymentform.setContract(null);

		
		BeanUtils.copyProperties(payment,paymentform);
		StringFullfiller.fullfil(payment);
		if(paymentform.getId() == null || paymentform.getId().intValue() == 0){
			payment.setId(null);
		}else{
			payment.setId(paymentform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Contract.class);
		criteria2.add(Restrictions.idEq(contractInt));
		Contract contract = (Contract) criteria2.uniqueResult();
		payment.setContract(contract);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(payment);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "PaymentDetail.do", payment.getId().toString());
		return null;

		
	}
	
	
}