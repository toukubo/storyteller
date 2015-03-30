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


public class ImprovementReportOfNewCarProfitsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ImprovementReportOfNewCarProfit.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			ImprovementReportOfNewCarProfit improvementReportOfNewCarProfit = (ImprovementReportOfNewCarProfit) iter.next();
			vector.add(improvementReportOfNewCarProfit);
		}
		ImprovementReportOfNewCarProfit improvementReportOfNewCarProfit = new ImprovementReportOfNewCarProfitImpl();
		ImprovementReportOfNewCarProfitForm improvementReportOfNewCarProfitform = new ImprovementReportOfNewCarProfitForm();
		criteria = session.createCriteria(ImprovementReportOfNewCarProfit.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			improvementReportOfNewCarProfit = (ImprovementReportOfNewCarProfit) criteria.uniqueResult();
			new CopyProperties(improvementReportOfNewCarProfit,improvementReportOfNewCarProfitform);
		} else if(req.getAttribute("form")!=null){
                        improvementReportOfNewCarProfitform = (ImprovementReportOfNewCarProfitForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(improvementReportOfNewCarProfitform.getId()));
			improvementReportOfNewCarProfit = (ImprovementReportOfNewCarProfit) criteria.uniqueResult();
		}
		

		req.setAttribute("model",improvementReportOfNewCarProfit);
		req.setAttribute("form",improvementReportOfNewCarProfitform);
		
		
		req.setAttribute("improvementReportOfNewCarProfits",vector);


                  Criteria criteriaBase= session.createCriteria(Base.class);
			req.setAttribute("Bases", criteriaBase.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}