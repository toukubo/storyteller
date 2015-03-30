package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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


public class PostSalaryPaymentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		SalaryPayment salarypayment = new SalaryPaymentImpl();
		SalaryPaymentForm salarypaymentform = (SalaryPaymentForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(salarypaymentform.getId() == null || salarypaymentform.getId().intValue() == 0){
			salarypayment.setId(null);
			salarypaymentform.setId(null);
		}else{
			salarypayment.setId(salarypaymentform.getId());
			Criteria criteria = session.createCriteria(SalaryPayment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			salarypayment = (SalaryPayment) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(salarypayment);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(salarypayment);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostSalaryPaymentDetail.do", salarypayment.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "SalaryPayments.do", salarypayment.getId().toString());
		return null;

		
	}
	
	
}