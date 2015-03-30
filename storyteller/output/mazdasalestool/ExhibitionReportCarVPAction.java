package net.mazdasalestool.web;

import net.mazdasalestool.model.*;
import net.mazdasalestool.model.crud.*;

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

public class ExhibitionReportCarVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExhibitionReportCar exhibitionReportCar = new ExhibitionReportCarImpl();
		ExhibitionReportCarForm exhibitionReportCarform = (ExhibitionReportCarForm) form;
		
                		Integer exhibitionReportInt = exhibitionReportCarform.getExhibitionReport();
		exhibitionReportCarform.setExhibitionReport(null);
		Integer carInt = exhibitionReportCarform.getCar();
		exhibitionReportCarform.setCar(null);

		
		BeanUtils.copyProperties(exhibitionReportCar,exhibitionReportCarform);
		StringFullfiller.fullfil(exhibitionReportCar);
		if(exhibitionReportCarform.getId() == null || exhibitionReportCarform.getId().intValue() == 0){
			exhibitionReportCar.setId(null);
		}else{
			exhibitionReportCar.setId(exhibitionReportCarform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(ExhibitionReport.class);
		criteria2.add(Restrictions.idEq(exhibitionReportInt));
		ExhibitionReport exhibitionreport = (ExhibitionReport) criteria2.uniqueResult();
		exhibitionReportCar.setExhibitionReport(exhibitionreport);
		criteria2 = session.createCriteria(Car.class);
		criteria2.add(Restrictions.idEq(carInt));
		Car car = (Car) criteria2.uniqueResult();
		exhibitionReportCar.setCar(car);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(exhibitionReportCar);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ExhibitionReportCarDetail.do", exhibitionReportCar.getId().toString());
		return null;

		
	}
	
	
}