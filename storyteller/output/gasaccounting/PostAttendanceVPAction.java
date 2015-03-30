package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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


public class PostAttendanceVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Attendance attendance = new AttendanceImpl();
		AttendanceForm attendanceform = (AttendanceForm) form;

                String error = "";


                		Integer intraUserInt = attendanceform.getIntraUser();
		attendanceform.setIntraUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(attendanceform.getId() == null || attendanceform.getId().intValue() == 0){
			attendance.setId(null);
			attendanceform.setId(null);
		}else{
			attendance.setId(attendanceform.getId());
			Criteria criteria = session.createCriteria(Attendance.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			attendance = (Attendance) criteria.uniqueResult();

		}
                		attendance.setStarthour(attendanceform.getStarthour());
		attendance.setStartminuite(attendanceform.getStartminuite());
		attendance.setEndhour(attendanceform.getEndhour());
		attendance.setEndminute(attendanceform.getEndminute());
		attendance.setIntervalhours(attendanceform.getIntervalhours());
		attendance.setTotalworkhour(attendanceform.getTotalworkhour());
		attendance.setLate(attendanceform.isLate());
		attendance.setLeaveearly(attendanceform.isLeaveearly());
		attendance.setAwl(attendanceform.isAwl());
		attendance.setDate(attendanceform.getDate());


		
		StringFullfiller.fullfil(attendance);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		attendance.setIntraUser(intrauser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(attendance);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostAttendanceDetail.do", attendance.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Attendances.do", attendance.getId().toString());
		return null;

		
	}
	
	
}