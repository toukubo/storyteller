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


public class PostTargetValueByIntraUserDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		TargetValueByIntraUser targetValueByIntraUser = new TargetValueByIntraUserImpl();
		TargetValueByIntraUserForm targetValueByIntraUserform = new TargetValueByIntraUserForm();
		Criteria criteria = session.createCriteria(TargetValueByIntraUser.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			targetValueByIntraUser = (TargetValueByIntraUser) criteria.uniqueResult();
			new CopyProperties(targetValueByIntraUser,targetValueByIntraUserform);
		} else if(req.getAttribute("form")!=null){
                        targetValueByIntraUserform = (TargetValueByIntraUserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(targetValueByIntraUserform.getId()));
			targetValueByIntraUser = (TargetValueByIntraUser) criteria.uniqueResult();
		}
		

		req.setAttribute("model",targetValueByIntraUser);
		req.setAttribute("form",targetValueByIntraUserform);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaImprovementReportOfNewCarProfit= session.createCriteria(ImprovementReportOfNewCarProfit.class);
			req.setAttribute("ImprovementReportOfNewCarProfits", criteriaImprovementReportOfNewCarProfit.list());

 
		
		return mapping.findForward("success");
	}
	
	
}