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


public class ValueOfActionSalessAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ValueOfActionSales.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			ValueOfActionSales valueOfActionSales = (ValueOfActionSales) iter.next();
			vector.add(valueOfActionSales);
		}
		ValueOfActionSales valueOfActionSales = new ValueOfActionSalesImpl();
		ValueOfActionSalesForm valueOfActionSalesform = new ValueOfActionSalesForm();
		criteria = session.createCriteria(ValueOfActionSales.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			valueOfActionSales = (ValueOfActionSales) criteria.uniqueResult();
			new CopyProperties(valueOfActionSales,valueOfActionSalesform);
		} else if(req.getAttribute("form")!=null){
                        valueOfActionSalesform = (ValueOfActionSalesForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(valueOfActionSalesform.getId()));
			valueOfActionSales = (ValueOfActionSales) criteria.uniqueResult();
		}
		

		req.setAttribute("model",valueOfActionSales);
		req.setAttribute("form",valueOfActionSalesform);
		
		
		req.setAttribute("valueOfActionSaless",vector);


                  Criteria criteriaProfitReportOfNewCar= session.createCriteria(ProfitReportOfNewCar.class);
			req.setAttribute("ProfitReportOfNewCars", criteriaProfitReportOfNewCar.list());

Criteria criteriaActionForSales= session.createCriteria(ActionForSales.class);
			req.setAttribute("ActionForSaless", criteriaActionForSales.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}