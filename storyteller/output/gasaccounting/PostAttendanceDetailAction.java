package net.gasaccounting.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

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


public class PostAttendanceDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Attendance attendance = new AttendanceImpl();
		AttendanceForm attendanceform = new AttendanceForm();
		Criteria criteria = session.createCriteria(Attendance.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			attendance = (Attendance) criteria.uniqueResult();
			new CopyProperties(attendance,attendanceform);
		} else if(req.getAttribute("form")!=null){
                        attendanceform = (AttendanceForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(attendanceform.getId()));
			attendance = (Attendance) criteria.uniqueResult();
		}
		

		req.setAttribute("model",attendance);
		req.setAttribute("form",attendanceform);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

 
		
		return mapping.findForward("success");
	}
	
	
}