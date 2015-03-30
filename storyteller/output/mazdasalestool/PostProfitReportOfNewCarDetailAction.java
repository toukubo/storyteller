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


public class PostProfitReportOfNewCarDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ProfitReportOfNewCar profitReportOfNewCar = new ProfitReportOfNewCarImpl();
		ProfitReportOfNewCarForm profitReportOfNewCarform = new ProfitReportOfNewCarForm();
		Criteria criteria = session.createCriteria(ProfitReportOfNewCar.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			profitReportOfNewCar = (ProfitReportOfNewCar) criteria.uniqueResult();
			new CopyProperties(profitReportOfNewCar,profitReportOfNewCarform);
		} else if(req.getAttribute("form")!=null){
                        profitReportOfNewCarform = (ProfitReportOfNewCarForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(profitReportOfNewCarform.getId()));
			profitReportOfNewCar = (ProfitReportOfNewCar) criteria.uniqueResult();
		}
		

		req.setAttribute("model",profitReportOfNewCar);
		req.setAttribute("form",profitReportOfNewCarform);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaCar= session.createCriteria(Car.class);
			req.setAttribute("Cars", criteriaCar.list());

Criteria criteriaNavigation= session.createCriteria(Navigation.class);
			req.setAttribute("Navigations", criteriaNavigation.list());

Criteria criteriaCompanyOfCredit= session.createCriteria(CompanyOfCredit.class);
			req.setAttribute("CompanyOfCredits", criteriaCompanyOfCredit.list());

Criteria criteriaPolice= session.createCriteria(Police.class);
			req.setAttribute("Polices", criteriaPolice.list());

Criteria criteriaImprovementReportOfNewCarProfit= session.createCriteria(ImprovementReportOfNewCarProfit.class);
			req.setAttribute("ImprovementReportOfNewCarProfits", criteriaImprovementReportOfNewCarProfit.list());

 
		
		return mapping.findForward("success");
	}
	
	
}