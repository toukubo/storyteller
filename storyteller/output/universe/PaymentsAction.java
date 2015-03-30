package net.universe.web.app;

import net.universe.model.*;
import net.universe.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class PaymentsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Payment.class);
                
		if(StringUtils.isNotBlank(req.getParameter("paymentdatestartdate")) && StringUtils.isNotBlank(req.getParameter("paymentdateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("paymentdatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("paymentdateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}

		if(StringUtils.isNotBlank(req.getParameter("contract"))) {
			Criteria criteria2 = session.createCriteria(Contract.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("contract"))));
			Contract contract = (Contract) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("contract", contract));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("narrator"))) {
			Criteria criteria2 = session.createCriteria(Narrator.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("narrator"))));
			Narrator narrator = (Narrator) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("narrator", narrator));
		}
 









		if(StringUtils.isNotBlank(req.getParameter("contractDetail"))) {
			Criteria criteria2 = session.createCriteria(ContractDetail.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("contractDetail"))));
			ContractDetail contractDetail = (ContractDetail) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("contractDetail", contractDetail));
		}
 
if(StringUtils.isNotBlank(req.getParameter("payment"))){   if(req.getParameter("payment").equals("true")){
      criteria.add(Restrictions.eq("payment",true));
   }else{
      criteria.add(Restrictions.eq("payment",false));
   }
}

if(StringUtils.isNotBlank(req.getParameter("paid"))){   if(req.getParameter("paid").equals("true")){
      criteria.add(Restrictions.eq("paid",true));
   }else{
      criteria.add(Restrictions.eq("paid",false));
   }
}


		req.setAttribute("payments",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Payment payment = (Payment) iter.next();
//			vector.add(payment);
//		}
		Payment payment = new PaymentImpl();
		PaymentForm paymentform = new PaymentForm();
		criteria = session.createCriteria(Payment.class);


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

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}