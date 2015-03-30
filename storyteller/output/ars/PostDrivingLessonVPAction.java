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


public class PostDrivingLessonVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		DrivingLesson drivingLesson = new DrivingLessonImpl();
		DrivingLessonForm drivingLessonform = (DrivingLessonForm) form;

                String error = "";


                		Integer accidentInt = drivingLessonform.getAccident();
		drivingLessonform.setAccident(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(drivingLessonform.getId() == null || drivingLessonform.getId().intValue() == 0){
			drivingLesson.setId(null);
			drivingLessonform.setId(null);
		}else{
			drivingLesson.setId(drivingLessonform.getId());
			Criteria criteria = session.createCriteria(DrivingLesson.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			drivingLesson = (DrivingLesson) criteria.uniqueResult();

		}
                		drivingLesson.setLessondate(drivingLessonform.getLessondate());
		drivingLesson.setLessonplace(drivingLessonform.getLessonplace());
		drivingLesson.setLessoncontent(drivingLessonform.getLessoncontent());


		
		StringFullfiller.fullfil(drivingLesson);
                		Criteria criteria2 = session.createCriteria(Accident.class);
		criteria2.add(Restrictions.idEq(accidentInt));
		Accident accident = (Accident) criteria2.uniqueResult();
		drivingLesson.setAccident(accident);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(drivingLesson);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostDrivingLessonDetail.do", drivingLesson.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "DrivingLessons.do", drivingLesson.getId().toString());
		return null;

		
	}
	
	
}