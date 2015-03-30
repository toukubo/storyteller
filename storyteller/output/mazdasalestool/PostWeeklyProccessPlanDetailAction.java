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


public class PostWeeklyProccessPlanDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		WeeklyProccessPlan weeklyProccessPlan = new WeeklyProccessPlanImpl();
		WeeklyProccessPlanForm weeklyProccessPlanform = new WeeklyProccessPlanForm();
		Criteria criteria = session.createCriteria(WeeklyProccessPlan.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			weeklyProccessPlan = (WeeklyProccessPlan) criteria.uniqueResult();
			new CopyProperties(weeklyProccessPlan,weeklyProccessPlanform);
		} else if(req.getAttribute("form")!=null){
                        weeklyProccessPlanform = (WeeklyProccessPlanForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(weeklyProccessPlanform.getId()));
			weeklyProccessPlan = (WeeklyProccessPlan) criteria.uniqueResult();
		}
		

		req.setAttribute("model",weeklyProccessPlan);
		req.setAttribute("form",weeklyProccessPlanform);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaBase= session.createCriteria(Base.class);
			req.setAttribute("Bases", criteriaBase.list());

 
		
		return mapping.findForward("success");
	}
	
	
}