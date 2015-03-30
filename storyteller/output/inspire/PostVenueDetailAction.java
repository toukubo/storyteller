package net.inspire.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.inspire.model.*;
import net.inspire.beans.*;


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


public class PostVenueDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Venue venue = new VenueImpl();
		VenueForm venueform = new VenueForm();
		Criteria criteria = session.createCriteria(Venue.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			venue = (Venue) criteria.uniqueResult();
			new CopyProperties(venue,venueform);
		} else if(req.getAttribute("form")!=null){
                        venueform = (VenueForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(venueform.getId()));
			venue = (Venue) criteria.uniqueResult();
		}
		

		req.setAttribute("model",venue);
		req.setAttribute("form",venueform);


                   
		
		return mapping.findForward("success");
	}
	
	
}