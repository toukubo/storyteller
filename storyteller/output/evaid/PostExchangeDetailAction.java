package net.evaid.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.evaid.model.*;
import net.evaid.beans.*;


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


public class PostExchangeDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Exchange exchange = new ExchangeImpl();
		ExchangeForm exchangeform = new ExchangeForm();
		Criteria criteria = session.createCriteria(Exchange.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			exchange = (Exchange) criteria.uniqueResult();
			new CopyProperties(exchange,exchangeform);
		} else if(req.getAttribute("form")!=null){
                        exchangeform = (ExchangeForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(exchangeform.getId()));
			exchange = (Exchange) criteria.uniqueResult();
		}
		

		req.setAttribute("model",exchange);
		req.setAttribute("form",exchangeform);


                   
		
		return mapping.findForward("success");
	}
	
	
}