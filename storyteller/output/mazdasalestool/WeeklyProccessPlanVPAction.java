package net.mazdasalestool.web;

import net.mazdasalestool.model.*;
import net.mazdasalestool.model.crud.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class WeeklyProccessPlanVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		WeeklyProccessPlan weeklyProccessPlan = new WeeklyProccessPlanImpl();
		WeeklyProccessPlanForm weeklyProccessPlanform = (WeeklyProccessPlanForm) form;
		
                		Integer intraUserInt = weeklyProccessPlanform.getIntraUser();
		weeklyProccessPlanform.setIntraUser(null);
		Integer baseInt = weeklyProccessPlanform.getBase();
		weeklyProccessPlanform.setBase(null);

		
		BeanUtils.copyProperties(weeklyProccessPlan,weeklyProccessPlanform);
		StringFullfiller.fullfil(weeklyProccessPlan);
		if(weeklyProccessPlanform.getId() == null || weeklyProccessPlanform.getId().intValue() == 0){
			weeklyProccessPlan.setId(null);
		}else{
			weeklyProccessPlan.setId(weeklyProccessPlanform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		weeklyProccessPlan.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Base.class);
		criteria2.add(Restrictions.idEq(baseInt));
		Base base = (Base) criteria2.uniqueResult();
		weeklyProccessPlan.setBase(base);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(weeklyProccessPlan);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "WeeklyProccessPlanDetail.do", weeklyProccessPlan.getId().toString());
		return null;

		
	}
	
	
}