package net.inspire.web.app;

import net.inspire.model.*;
import net.inspire.beans.*;

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


public class EventsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="EventsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Event.class);
                
		req.setAttribute("events",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Event event = (Event) iter.next();
//			vector.add(event);
//		}
		Event event = new EventImpl();
		EventForm eventform = new EventForm();
		criteria = session.createCriteria(Event.class);


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
		
		
//</snippet>

                  Criteria criteriaVenue= session.createCriteria(Venue.class);
			req.setAttribute("Venues", criteriaVenue.list());

 

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportEventsAction csvExportEventsAction 
//                               = new CsvExportEventsAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}