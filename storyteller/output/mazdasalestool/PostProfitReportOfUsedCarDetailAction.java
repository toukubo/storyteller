package net.mazdasalestool.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;


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


public class PostProfitReportOfUsedCarDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ProfitReportOfUsedCar profitReportOfUsedCar = new ProfitReportOfUsedCarImpl();
		ProfitReportOfUsedCarForm profitReportOfUsedCarform = new ProfitReportOfUsedCarForm();
		Criteria criteria = session.createCriteria(ProfitReportOfUsedCar.class);

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


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaImprovementReportOfUsedCarProfit= session.createCriteria(ImprovementReportOfUsedCarProfit.class);
			req.setAttribute("ImprovementReportOfUsedCarProfits", criteriaImprovementReportOfUsedCarProfit.list());

 
		
		return mapping.findForward("success");
	}
	
	
}