package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class PostEventAttendanceVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		EventAttendance eventAttendance = new EventAttendanceImpl();
		EventAttendanceForm eventAttendanceform = (EventAttendanceForm) form;

                String error = "";


                		Integer eventInt = eventAttendanceform.getEvent();
		eventAttendanceform.setEvent(null);
		Integer artistInt = eventAttendanceform.getArtist();
		eventAttendanceform.setArtist(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(eventAttendanceform.getId() == null || eventAttendanceform.getId().intValue() == 0){
			eventAttendance.setId(null);
			eventAttendanceform.setId(null);
		}else{
			eventAttendance.setId(eventAttendanceform.getId());
			Criteria criteria = session.createCriteria(EventAttendance.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			eventAttendance = (EventAttendance) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(eventAttendance);
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
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostEventAttendanceDetail.do", eventAttendance.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "EventAttendances.do", eventAttendance.getId().toString());
		return null;

		
	}
	
	
}