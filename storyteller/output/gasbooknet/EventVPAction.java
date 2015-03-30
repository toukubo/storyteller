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

public class EventVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Event event = new EventImpl();
		EventForm eventform = (EventForm) form;
		
                		Integer spaceInt = eventform.getSpace();
		eventform.setSpace(null);

		
		BeanUtils.copyProperties(event,eventform);
		StringFullfiller.fullfil(event);
		if(eventform.getId() == null || eventform.getId().intValue() == 0){
			event.setId(null);
		}else{
			event.setId(eventform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Space.class);
		criteria2.add(Restrictions.idEq(spaceInt));
		Space space = (Space) criteria2.uniqueResult();
		event.setSpace(space);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(event);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "EventDetail.do", event.getId().toString());
		return null;

		
	}
	
	
}