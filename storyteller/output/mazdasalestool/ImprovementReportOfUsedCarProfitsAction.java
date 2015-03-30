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


public class ImprovementReportOfUsedCarProfitsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ImprovementReportOfUsedCarProfit.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			ImprovementReportOfUsedCarProfit improvementReportOfUsedCarProfit = (ImprovementReportOfUsedCarProfit) iter.next();
			vector.add(improvementReportOfUsedCarProfit);
		}
		ImprovementReportOfUsedCarProfit improvementReportOfUsedCarProfit = new ImprovementReportOfUsedCarProfitImpl();
		ImprovementReportOfUsedCarProfitForm improvementReportOfUsedCarProfitform = new ImprovementReportOfUsedCarProfitForm();
		criteria = session.createCriteria(ImprovementReportOfUsedCarProfit.class);


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
		
		
		req.setAttribute("improvementReportOfUsedCarProfits",vector);


                  Criteria criteriaProfitReportOfUsedCar= session.createCriteria(ProfitReportOfUsedCar.class);
			req.setAttribute("ProfitReportOfUsedCars", criteriaProfitReportOfUsedCar.list());

Criteria criteriaBase= session.createCriteria(Base.class);
			req.setAttribute("Bases", criteriaBase.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}