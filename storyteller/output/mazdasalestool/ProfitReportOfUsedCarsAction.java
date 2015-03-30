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


public class ProfitReportOfUsedCarsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ProfitReportOfUsedCar.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			ProfitReportOfUsedCar profitReportOfUsedCar = (ProfitReportOfUsedCar) iter.next();
			vector.add(profitReportOfUsedCar);
		}
		ProfitReportOfUsedCar profitReportOfUsedCar = new ProfitReportOfUsedCarImpl();
		ProfitReportOfUsedCarForm profitReportOfUsedCarform = new ProfitReportOfUsedCarForm();
		criteria = session.createCriteria(ProfitReportOfUsedCar.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			profitReportOfUsedCar = (ProfitReportOfUsedCar) criteria.uniqueResult();
			new CopyProperties(profitReportOfUsedCar,profitReportOfUsedCarform);
		} else if(req.getAttribute("form")!=null){
                        profitReportOfUsedCarform = (ProfitReportOfUsedCarForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(profitReportOfUsedCarform.getId()));
			profitReportOfUsedCar = (ProfitReportOfUsedCar) criteria.uniqueResult();
		}
		

		req.setAttribute("model",profitReportOfUsedCar);
		req.setAttribute("form",profitReportOfUsedCarform);
		
		
		req.setAttribute("profitReportOfUsedCars",vector);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaImprovementReportOfUsedCarProfit= session.createCriteria(ImprovementReportOfUsedCarProfit.class);
			req.setAttribute("ImprovementReportOfUsedCarProfits", criteriaImprovementReportOfUsedCarProfit.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}