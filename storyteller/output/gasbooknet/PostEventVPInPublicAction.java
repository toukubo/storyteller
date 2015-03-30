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


public class PostEventVPInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Event event = new EventImpl();
		EventForm eventform = (EventForm) form;

                String error = "";


                		Integer spaceInt = eventform.getSpace();
		eventform.setSpace(null);

		
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
                		event.setName(eventform.getName());
		event.setDate(eventform.getDate());
		event.setDescription(eventform.getDescription());
		event.setRecentlyadded(eventform.isRecentlyadded());
		event.setPoplular(eventform.isPoplular());


		
		StringFullfiller.fullfil(event);
                		Criteria criteria2 = session.createCriteria(Space.class);
		criteria2.add(Restrictions.idEq(spaceInt));
		Space space = (Space) criteria2.uniqueResult();
		event.setSpace(space);


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