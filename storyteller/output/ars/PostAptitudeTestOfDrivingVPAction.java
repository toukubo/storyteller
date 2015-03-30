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


public class PostAptitudeTestOfDrivingVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		AptitudeTestOfDriving aptitudeTestOfDriving = new AptitudeTestOfDrivingImpl();
		AptitudeTestOfDrivingForm aptitudeTestOfDrivingform = (AptitudeTestOfDrivingForm) form;

                String error = "";


                		Integer accidentInt = aptitudeTestOfDrivingform.getAccident();
		aptitudeTestOfDrivingform.setAccident(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(aptitudeTestOfDrivingform.getId() == null || aptitudeTestOfDrivingform.getId().intValue() == 0){
			aptitudeTestOfDriving.setId(null);
			aptitudeTestOfDrivingform.setId(null);
		}else{
			aptitudeTestOfDriving.setId(aptitudeTestOfDrivingform.getId());
			Criteria criteria = session.createCriteria(AptitudeTestOfDriving.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			aptitudeTestOfDriving = (AptitudeTestOfDriving) criteria.uniqueResult();

		}
                		aptitudeTestOfDriving.setTestdate(aptitudeTestOfDrivingform.getTestdate());
		aptitudeTestOfDriving.setTestplace(aptitudeTestOfDrivingform.getTestplace());
		aptitudeTestOfDriving.setIndividualguidance(aptitudeTestOfDrivingform.getIndividualguidance());


		
		StringFullfiller.fullfil(aptitudeTestOfDriving);
                		Criteria criteria2 = session.createCriteria(Accident.class);
		criteria2.add(Restrictions.idEq(accidentInt));
		Accident accident = (Accident) criteria2.uniqueResult();
		aptitudeTestOfDriving.setAccident(accident);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(aptitudeTestOfDriving);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostAptitudeTestOfDrivingDetail.do", aptitudeTestOfDriving.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "AptitudeTestOfDrivings.do", aptitudeTestOfDriving.getId().toString());
		return null;

		
	}
	
	
}