package net.ars.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ars.model.*;
import net.ars.beans.*;


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


public class PostDrivingLessonDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		DrivingLesson drivingLesson = new DrivingLessonImpl();
		DrivingLessonForm drivingLessonform = new DrivingLessonForm();
		Criteria criteria = session.createCriteria(DrivingLesson.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			drivingLesson = (DrivingLesson) criteria.uniqueResult();
			new CopyProperties(drivingLesson,drivingLessonform);
		} else if(req.getAttribute("form")!=null){
                        drivingLessonform = (DrivingLessonForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(drivingLessonform.getId()));
			drivingLesson = (DrivingLesson) criteria.uniqueResult();
		}
		

		req.setAttribute("model",drivingLesson);
		req.setAttribute("form",drivingLessonform);


                  Criteria criteriaAccident= session.createCriteria(Accident.class);
			req.setAttribute("Accidents", criteriaAccident.list());

 
		
		return mapping.findForward("success");
	}
	
	
}