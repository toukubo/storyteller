package net.malta.web.app;

import net.malta.model.*;
import net.malta.beans.*;

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

//<snippet sentence="PaymentsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Payment.class);
                
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
		
		
//</snippet>

                   

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportPaymentsAction csvExportPaymentsAction 
//                               = new CsvExportPaymentsAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}