package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

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


public class PostWeeklyProccessPlanVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		WeeklyProccessPlan weeklyProccessPlan = new WeeklyProccessPlanImpl();
		WeeklyProccessPlanForm weeklyProccessPlanform = (WeeklyProccessPlanForm) form;

                String error = "";


                		Integer intraUserInt = weeklyProccessPlanform.getIntraUser();
		weeklyProccessPlanform.setIntraUser(null);
		Integer baseInt = weeklyProccessPlanform.getBase();
		weeklyProccessPlanform.setBase(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(weeklyProccessPlanform.getId() == null || weeklyProccessPlanform.getId().intValue() == 0){
			weeklyProccessPlan.setId(null);
			weeklyProccessPlanform.setId(null);
		}else{
			weeklyProccessPlan.setId(weeklyProccessPlanform.getId());
			Criteria criteria = session.createCriteria(WeeklyProccessPlan.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			weeklyProccessPlan = (WeeklyProccessPlan) criteria.uniqueResult();

		}
                		weeklyProccessPlan.setLeavetime(weeklyProccessPlanform.getLeavetime());
		weeklyProccessPlan.setDate(weeklyProccessPlanform.getDate());
		weeklyProccessPlan.setActual(weeklyProccessPlanform.getActual());
		weeklyProccessPlan.setPromotionalcars(weeklyProccessPlanform.getPromotionalcars());
		weeklyProccessPlan.setInspectiontarget(weeklyProccessPlanform.getInspectiontarget());
		weeklyProccessPlan.setInspectiontc(weeklyProccessPlanform.getInspectiontc());
		weeklyProccessPlan.setInspectionmail(weeklyProccessPlanform.getInspectionmail());
		weeklyProccessPlan.setInspectionvisitaffirmation(weeklyProccessPlanform.getInspectionvisitaffirmation());
		weeklyProccessPlan.setInspectionslc(weeklyProccessPlanform.getInspectionslc());
		weeklyProccessPlan.setInspectionproposal(weeklyProccessPlanform.getInspectionproposal());
		weeklyProccessPlan.setInspectionstorefront(weeklyProccessPlanform.getInspectionstorefront());
		weeklyProccessPlan.setInspectionbc(weeklyProccessPlanform.getInspectionbc());
		weeklyProccessPlan.setInspectiondemo(weeklyProccessPlanform.getInspectiondemo());
		weeklyProccessPlan.setInspectionappraisal(weeklyProccessPlanform.getInspectionappraisal());
		weeklyProccessPlan.setInspectionabhot(weeklyProccessPlanform.getInspectionabhot());
		weeklyProccessPlan.setPrioritytarget(weeklyProccessPlanform.getPrioritytarget());
		weeklyProccessPlan.setPrioritydm(weeklyProccessPlanform.getPrioritydm());
		weeklyProccessPlan.setPrioritytc(weeklyProccessPlanform.getPrioritytc());
		weeklyProccessPlan.setPrioritymail(weeklyProccessPlanform.getPrioritymail());
		weeklyProccessPlan.setPriorityvisitaffirmation(weeklyProccessPlanform.getPriorityvisitaffirmation());
		weeklyProccessPlan.setPriorityslc(weeklyProccessPlanform.getPriorityslc());
		weeklyProccessPlan.setPriorityproposal(weeklyProccessPlanform.getPriorityproposal());
		weeklyProccessPlan.setPrioritystorefront(weeklyProccessPlanform.getPrioritystorefront());
		weeklyProccessPlan.setPrioritybc(weeklyProccessPlanform.getPrioritybc());
		weeklyProccessPlan.setPrioritydemo(weeklyProccessPlanform.getPrioritydemo());
		weeklyProccessPlan.setPriorityappraisal(weeklyProccessPlanform.getPriorityappraisal());
		weeklyProccessPlan.setPriorityabhot(weeklyProccessPlanform.getPriorityabhot());
		weeklyProccessPlan.setNewclientscars(weeklyProccessPlanform.getNewclientscars());
		weeklyProccessPlan.setNewclientsintroductionpostcard(weeklyProccessPlanform.getNewclientsintroductionpostcard());
		weeklyProccessPlan.setNewclientsintroductionoffer(weeklyProccessPlanform.getNewclientsintroductionoffer());
		weeklyProccessPlan.setNewclientsintroduction(weeklyProccessPlanform.getNewclientsintroduction());
		weeklyProccessPlan.setNewclientsstockstorefront(weeklyProccessPlanform.getNewclientsstockstorefront());
		weeklyProccessPlan.setNewclientsstockexhibition(weeklyProccessPlanform.getNewclientsstockexhibition());
		weeklyProccessPlan.setNewclientsstockothers(weeklyProccessPlanform.getNewclientsstockothers());
		weeklyProccessPlan.setNewclientsstock(weeklyProccessPlanform.getNewclientsstock());
		weeklyProccessPlan.setNewclientsdm(weeklyProccessPlanform.getNewclientsdm());
		weeklyProccessPlan.setNewclientstc(weeklyProccessPlanform.getNewclientstc());
		weeklyProccessPlan.setNewclientsmail(weeklyProccessPlanform.getNewclientsmail());
		weeklyProccessPlan.setNewclientsvisitaffirmation(weeklyProccessPlanform.getNewclientsvisitaffirmation());
		weeklyProccessPlan.setNewclientsslc(weeklyProccessPlanform.getNewclientsslc());
		weeklyProccessPlan.setNewclientsstorefront(weeklyProccessPlanform.getNewclientsstorefront());
		weeklyProccessPlan.setNewclientsbc(weeklyProccessPlanform.getNewclientsbc());
		weeklyProccessPlan.setNewclientsdemo(weeklyProccessPlanform.getNewclientsdemo());
		weeklyProccessPlan.setNewclientsappraisal(weeklyProccessPlanform.getNewclientsappraisal());
		weeklyProccessPlan.setNewclientsabhot(weeklyProccessPlanform.getNewclientsabhot());
		weeklyProccessPlan.setCometime(weeklyProccessPlanform.getCometime());
		weeklyProccessPlan.setInspectiondm(weeklyProccessPlanform.getInspectiondm());
		weeklyProccessPlan.setEngenderabhotcustomer(weeklyProccessPlanform.getEngenderabhotcustomer());
		weeklyProccessPlan.setEngenderabhotstock(weeklyProccessPlanform.getEngenderabhotstock());
		weeklyProccessPlan.setEngenderabhotfree(weeklyProccessPlanform.getEngenderabhotfree());
		weeklyProccessPlan.setVip(weeklyProccessPlanform.getVip());
		weeklyProccessPlan.setOthercars(weeklyProccessPlanform.getOthercars());
		weeklyProccessPlan.setClientab(weeklyProccessPlanform.getClientab());
		weeklyProccessPlan.setClientnonabcustomer(weeklyProccessPlanform.getClientnonabcustomer());
		weeklyProccessPlan.setClientnonabstock(weeklyProccessPlanform.getClientnonabstock());
		weeklyProccessPlan.setClientnonabfree(weeklyProccessPlanform.getClientnonabfree());
		weeklyProccessPlan.setOrdercarsabcustomer(weeklyProccessPlanform.getOrdercarsabcustomer());
		weeklyProccessPlan.setOrdercarsabnewother(weeklyProccessPlanform.getOrdercarsabnewother());
		weeklyProccessPlan.setOrdercarsnonabcustomer(weeklyProccessPlanform.getOrdercarsnonabcustomer());
		weeklyProccessPlan.setOrdercarsnonabstock(weeklyProccessPlanform.getOrdercarsnonabstock());
		weeklyProccessPlan.setOrdercarsnonabfree(weeklyProccessPlanform.getOrdercarsnonabfree());


		
		StringFullfiller.fullfil(weeklyProccessPlan);
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
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostWeeklyProccessPlanDetail.do", weeklyProccessPlan.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "WeeklyProccessPlans.do", weeklyProccessPlan.getId().toString());
		return null;

		
	}
	
	
}