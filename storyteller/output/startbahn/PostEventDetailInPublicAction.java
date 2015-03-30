package net.startbahn.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.beans.*;


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


public class PostEventDetailInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Event event = new EventImpl();
		EventForm eventform = new EventForm();
		Criteria criteria = session.createCriteria(Event.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			event = (Event) criteria.uniqueResult();
			new CopyProperties(event,eventform);
		} else if(req.getAttribute("form")!=null){
                        eventform = (EventForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(eventform.getId()));
			event = (Event) criteria.uniqueResult();
		}
		

		req.setAttribute("model",event);
		req.setAttribute("form",eventform);


                  Criteria criteriaAuction= session.createCriteria(Auction.class);
			req.setAttribute("Auctions", criteriaAuction.list());

 
		
		return mapping.findForward("success");
	}
	
	
}