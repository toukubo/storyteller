package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class PostIncomePaymentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		IncomePayment incomePayment = new IncomePaymentImpl();
		IncomePaymentForm incomePaymentform = (IncomePaymentForm) form;

                String error = "";


                		Integer j2eeStoryInt = incomePaymentform.getJ2eeStory();
		incomePaymentform.setJ2eeStory(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(incomePaymentform.getId() == null || incomePaymentform.getId().intValue() == 0){
			incomePayment.setId(null);
			incomePaymentform.setId(null);
		}else{
			incomePayment.setId(incomePaymentform.getId());
			Criteria criteria = session.createCriteria(IncomePayment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			incomePayment = (IncomePayment) criteria.uniqueResult();

		}
                		incomePayment.setValue(incomePaymentform.getValue());
		incomePayment.setDate(incomePaymentform.getDate());


		
		StringFullfiller.fullfil(incomePayment);
                		Criteria criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(j2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		incomePayment.setJ2eeStory(j2eestory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(incomePayment);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostIncomePaymentDetail.do", incomePayment.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "IncomePayments.do", incomePayment.getId().toString());
		return null;

		
	}
	
	
}