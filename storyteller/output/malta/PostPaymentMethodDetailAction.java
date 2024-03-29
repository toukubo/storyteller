package net.malta.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.malta.model.*;
import net.malta.beans.*;


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


public class PostPaymentMethodDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		PaymentMethod paymentMethod = new PaymentMethodImpl();
		PaymentMethodForm paymentMethodform = new PaymentMethodForm();
		Criteria criteria = session.createCriteria(PaymentMethod.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			paymentMethod = (PaymentMethod) criteria.uniqueResult();
			new CopyProperties(paymentMethod,paymentMethodform);
		} else if(req.getAttribute("form")!=null){
                        paymentMethodform = (PaymentMethodForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(paymentMethodform.getId()));
			paymentMethod = (PaymentMethod) criteria.uniqueResult();
		}
		

		req.setAttribute("model",paymentMethod);
		req.setAttribute("form",paymentMethodform);


                   
		
		return mapping.findForward("success");
	}
	
	
}