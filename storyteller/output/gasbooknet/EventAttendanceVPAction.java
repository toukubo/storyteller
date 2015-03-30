package net.gasbooknet.web;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class EventAttendanceVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		EventAttendance eventAttendance = new EventAttendanceImpl();
		EventAttendanceForm eventAttendanceform = (EventAttendanceForm) form;
		
                		Integer eventInt = eventAttendanceform.getEvent();
		eventAttendanceform.setEvent(null);
		Integer artistInt = eventAttendanceform.getArtist();
		eventAttendanceform.setArtist(null);

		
		BeanUtils.copyProperties(eventAttendance,eventAttendanceform);
		StringFullfiller.fullfil(eventAttendance);
		if(eventAttendanceform.getId() == null || eventAttendanceform.getId().intValue() == 0){
			eventAttendance.setId(null);
		}else{
			eventAttendance.setId(eventAttendanceform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Event.class);
		criteria2.add(Restrictions.idEq(eventInt));
		Event event = (Event) criteria2.uniqueResult();
		eventAttendance.setEvent(event);
		criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		eventAttendance.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(eventAttendance);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "EventAttendanceDetail.do", eventAttendance.getId().toString());
		return null;

		
	}
	
	
}