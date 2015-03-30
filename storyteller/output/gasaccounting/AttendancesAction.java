package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class AttendancesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Attendance.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Attendance attendance = (Attendance) iter.next();
			vector.add(attendance);
		}
		Attendance attendance = new AttendanceImpl();
		AttendanceForm attendanceform = new AttendanceForm();
		criteria = session.createCriteria(Attendance.class);


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
		
		
		req.setAttribute("attendances",vector);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}