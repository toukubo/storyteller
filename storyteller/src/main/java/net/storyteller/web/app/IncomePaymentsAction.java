package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class IncomePaymentsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(IncomePayment.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			IncomePayment incomePayment = (IncomePayment) iter.next();
			vector.add(incomePayment);
		}
		IncomePayment incomePayment = new IncomePaymentImpl();
		IncomePaymentForm incomePaymentform = new IncomePaymentForm();
		criteria = session.createCriteria(IncomePayment.class);


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
		
		
		req.setAttribute("incomePayments",vector);


                  Criteria criteriaJ2eeStory= session.createCriteria(J2eeStory.class);
			req.setAttribute("J2eeStorys", criteriaJ2eeStory.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}