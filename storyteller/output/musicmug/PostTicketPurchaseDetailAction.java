package net.musicmug.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.musicmug.model.*;
import net.musicmug.beans.*;


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


public class PostTicketPurchaseDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		TicketPurchase ticketPurchase = new TicketPurchaseImpl();
		TicketPurchaseForm ticketPurchaseform = new TicketPurchaseForm();
		Criteria criteria = session.createCriteria(TicketPurchase.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			ticketPurchase = (TicketPurchase) criteria.uniqueResult();
			new CopyProperties(ticketPurchase,ticketPurchaseform);
		} else if(req.getAttribute("form")!=null){
                        ticketPurchaseform = (TicketPurchaseForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(ticketPurchaseform.getId()));
			ticketPurchase = (TicketPurchase) criteria.uniqueResult();
		}
		

		req.setAttribute("model",ticketPurchase);
		req.setAttribute("form",ticketPurchaseform);


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

Criteria criteriaLive= session.createCriteria(Live.class);
			req.setAttribute("Lives", criteriaLive.list());

 
		
		return mapping.findForward("success");
	}
	
	
}