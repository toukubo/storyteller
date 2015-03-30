package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

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


public class EventListAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Event.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Event event = (Event) iter.next();
			vector.add(event);
		}
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
		
		
		req.setAttribute("events",vector);
		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}