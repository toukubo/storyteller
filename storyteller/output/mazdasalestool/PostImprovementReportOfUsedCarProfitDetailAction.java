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


public class PostImprovementReportOfUsedCarProfitDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ImprovementReportOfUsedCarProfit improvementReportOfUsedCarProfit = new ImprovementReportOfUsedCarProfitImpl();
		ImprovementReportOfUsedCarProfitForm improvementReportOfUsedCarProfitform = new ImprovementReportOfUsedCarProfitForm();
		Criteria criteria = session.createCriteria(ImprovementReportOfUsedCarProfit.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			improvementReportOfUsedCarProfit = (ImprovementReportOfUsedCarProfit) criteria.uniqueResult();
			new CopyProperties(improvementReportOfUsedCarProfit,improvementReportOfUsedCarProfitform);
		} else if(req.getAttribute("form")!=null){
                        improvementReportOfUsedCarProfitform = (ImprovementReportOfUsedCarProfitForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(improvementReportOfUsedCarProfitform.getId()));
			improvementReportOfUsedCarProfit = (ImprovementReportOfUsedCarProfit) criteria.uniqueResult();
		}
		

		req.setAttribute("model",improvementReportOfUsedCarProfit);
		req.setAttribute("form",improvementReportOfUsedCarProfitform);


                  Criteria criteriaProfitReportOfUsedCar= session.createCriteria(ProfitReportOfUsedCar.class);
			req.setAttribute("ProfitReportOfUsedCars", criteriaProfitReportOfUsedCar.list());

Criteria criteriaBase= session.createCriteria(Base.class);
			req.setAttribute("Bases", criteriaBase.list());

 
		
		return mapping.findForward("success");
	}
	
	
}