package net.realize.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.realize.model.*;
import net.realize.beans.*;


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


public class PostCommitionPaymentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		CommitionPayment commitionPayment = new CommitionPaymentImpl();
		CommitionPaymentForm commitionPaymentform = new CommitionPaymentForm();
		Criteria criteria = session.createCriteria(CommitionPayment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			commitionPayment = (CommitionPayment) criteria.uniqueResult();
			new CopyProperties(commitionPayment,commitionPaymentform);
		} else if(req.getAttribute("form")!=null){
                        commitionPaymentform = (CommitionPaymentForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(commitionPaymentform.getId()));
			commitionPayment = (CommitionPayment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",commitionPayment);
		req.setAttribute("form",commitionPaymentform);


                  Criteria criteriaUser= session.createCriteria(User.class);
			req.setAttribute("Users", criteriaUser.list());

 
		
		return mapping.findForward("success");
	}
	
	
}