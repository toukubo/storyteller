package net.realize.web.app;

import net.realize.model.*;
import net.realize.beans.*;

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


public class CommitionPaymentsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="CommitionPaymentsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(CommitionPayment.class);
                
		req.setAttribute("commitionPayments",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			CommitionPayment commitionPayment = (CommitionPayment) iter.next();
//			vector.add(commitionPayment);
//		}
		CommitionPayment commitionPayment = new CommitionPaymentImpl();
		CommitionPaymentForm commitionPaymentform = new CommitionPaymentForm();
		criteria = session.createCriteria(CommitionPayment.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			commitionPayment = (CommitionPayment) criteria.uniqueResult();
			new CopyProperties(commitionPayment,commitionPaymentform);
		} else if(req.getAttribute("form")!=null){
                        commitionPaymentform = (CommitionPaymentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(commitionPaymentform.getId()));
			commitionPayment = (CommitionPayment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",commitionPayment);
		req.setAttribute("form",commitionPaymentform);
		
		
//</snippet>

                  Criteria criteriaUser= session.createCriteria(User.class);
			req.setAttribute("Users", criteriaUser.list());

 

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportCommitionPaymentsAction csvExportCommitionPaymentsAction 
//                               = new CsvExportCommitionPaymentsAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}