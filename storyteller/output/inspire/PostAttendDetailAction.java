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


public class PostAttendDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Attend attend = new AttendImpl();
		AttendForm attendform = new AttendForm();
		Criteria criteria = session.createCriteria(Attend.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			attend = (Attend) criteria.uniqueResult();
			new CopyProperties(attend,attendform);
		} else if(req.getAttribute("form")!=null){
                        attendform = (AttendForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(attendform.getId()));
			attend = (Attend) criteria.uniqueResult();
		}
		

		req.setAttribute("model",attend);
		req.setAttribute("form",attendform);


                  Criteria criteriaEvent= session.createCriteria(Event.class);
			req.setAttribute("Events", criteriaEvent.list());

Criteria criteriaUser= session.createCriteria(User.class);
			req.setAttribute("Users", criteriaUser.list());

 
		
		return mapping.findForward("success");
	}
	
	
}