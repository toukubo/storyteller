package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

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


public class ExhibitionReportCarsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ExhibitionReportCar.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			ExhibitionReportCar exhibitionReportCar = (ExhibitionReportCar) iter.next();
			vector.add(exhibitionReportCar);
		}
		ExhibitionReportCar exhibitionReportCar = new ExhibitionReportCarImpl();
		ExhibitionReportCarForm exhibitionReportCarform = new ExhibitionReportCarForm();
		criteria = session.createCriteria(ExhibitionReportCar.class);


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
		
		
		req.setAttribute("exhibitionReportCars",vector);


                  Criteria criteriaExhibitionReport= session.createCriteria(ExhibitionReport.class);
			req.setAttribute("ExhibitionReports", criteriaExhibitionReport.list());

Criteria criteriaCar= session.createCriteria(Car.class);
			req.setAttribute("Cars", criteriaCar.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}