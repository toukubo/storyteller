package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Event.class);
                
if(StringUtils.isNotBlank(req.getParameter("recentlyadded"))){   if(req.getParameter("recentlyadded").equals("true")){
      criteria.add(Restrictions.eq("recentlyadded",true));
   }else{
      criteria.add(Restrictions.eq("recentlyadded",false));
   }
}

		if(StringUtils.isNotBlank(req.getParameter("artist"))) {
			Criteria criteria2 = session.createCriteria(Artist.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("artist"))));
			Artist artist = (Artist) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("artist", artist));
		}
 
if(StringUtils.isNotBlank(req.getParameter("poplular"))){   if(req.getParameter("poplular").equals("true")){
      criteria.add(Restrictions.eq("poplular",true));
   }else{
      criteria.add(Restrictions.eq("poplular",false));
   }
}




		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


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
		
		


                  Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}