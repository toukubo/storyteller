package net.inspire.web.app;

import net.inspire.model.*;
import net.inspire.beans.*;

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
import org.hibernate.criterion.Restrictions;


public class PostAttendVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Attend attend = new AttendImpl();
		AttendForm attendform = (AttendForm) form;

                String error = "";


                		Integer eventInt = attendform.getEvent();
		attendform.setEvent(null);
		Integer userInt = attendform.getUser();
		attendform.setUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(attendform.getId() == null || attendform.getId().intValue() == 0){
			attend.setId(null);
			attendform.setId(null);
		}else{
			attend.setId(attendform.getId());
			Criteria criteria = session.createCriteria(Attend.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			attend = (Attend) criteria.uniqueResult();

		}
                		attend.setPublish(attendform.getPublish());
		attend.setDate(attendform.getDate());


		
		StringFullfiller.fullfil(attend);
                		Criteria criteria2 = session.createCriteria(Event.class);
		criteria2.add(Restrictions.idEq(eventInt));
		Event event = (Event) criteria2.uniqueResult();
		attend.setEvent(event);
		criteria2 = session.createCriteria(User.class);
		criteria2.add(Restrictions.idEq(userInt));
		User user = (User) criteria2.uniqueResult();
		attend.setUser(user);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(attend);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAttendDetail.do", attend.getId().toString(),"success=true");
		return null;

		
	}
	
	
}