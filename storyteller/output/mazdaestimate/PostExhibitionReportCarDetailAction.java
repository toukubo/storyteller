package net.mazdaestimate.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;


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


public class PostExhibitionReportCarDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ExhibitionReportCar exhibitionReportCar = new ExhibitionReportCarImpl();
		ExhibitionReportCarForm exhibitionReportCarform = new ExhibitionReportCarForm();
		Criteria criteria = session.createCriteria(ExhibitionReportCar.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			exhibitionReportCar = (ExhibitionReportCar) criteria.uniqueResult();
			new CopyProperties(exhibitionReportCar,exhibitionReportCarform);
		} else if(req.getAttribute("form")!=null){
                        exhibitionReportCarform = (ExhibitionReportCarForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(exhibitionReportCarform.getId()));
			exhibitionReportCar = (ExhibitionReportCar) criteria.uniqueResult();
		}
		

		req.setAttribute("model",exhibitionReportCar);
		req.setAttribute("form",exhibitionReportCarform);


                  Criteria criteriaExhibitionReport= session.createCriteria(ExhibitionReport.class);
			req.setAttribute("ExhibitionReports", criteriaExhibitionReport.list());

Criteria criteriaCar= session.createCriteria(Car.class);
			req.setAttribute("Cars", criteriaCar.list());

 
		
		return mapping.findForward("success");
	}
	
	
}