package net.ars.web.app;

import net.ars.model.*;
import net.ars.beans.*;

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


public class PostEventVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Event event = new EventImpl();
		EventForm eventform = (EventForm) form;

                String error = "";


                		Integer accidentInt = eventform.getAccident();
		eventform.setAccident(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(eventform.getId() == null || eventform.getId().intValue() == 0){
			event.setId(null);
			eventform.setId(null);
		}else{
			event.setId(eventform.getId());
			Criteria criteria = session.createCriteria(Event.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			event = (Event) criteria.uniqueResult();

		}
                		event.setHistorydate(eventform.getHistorydate());
		event.setContents(eventform.getContents());


		
		StringFullfiller.fullfil(event);
                		Criteria criteria2 = session.createCriteria(Accident.class);
		criteria2.add(Restrictions.idEq(accidentInt));
		Accident accident = (Accident) criteria2.uniqueResult();
		event.setAccident(accident);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(event);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostEventDetail.do", event.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Events.do", event.getId().toString());
		return null;

		
	}
	
	
}