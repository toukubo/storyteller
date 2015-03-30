package net.mazdaestimate.web.app;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;

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
if(!StringUtils.isNumeric(req.getParameter("newclientsvisit"))){
    error += "新規来店確約数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsstock"))){
    error += "新規総ストック保有件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientstc"))){
    error += "新規TC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsstockothers"))){
    error += "新規ストックその他には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsstockexhibition"))){
    error += "新規出張・職域展示会ストックには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsstockstorefront"))){
    error += "新規店頭来店ストックには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsstockincrement"))){
    error += "新規ソトック増加件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsintroductionoffer"))){
    error += "新規紹介以来件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsintroductionpostcard"))){
    error += "新規紹介ハガキ発送件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsintroduction"))){
    error += "新規紹介発生には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("priorityabhot"))){
    error += "重点ターゲットABホット発生件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("priorityappraisal"))){
    error += "重点ターゲットご提案書件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsabhot"))){
    error += "新規ABホット発生件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsappraisal"))){
    error += "新規ご提案書件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsbc"))){
    error += "新規BC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsdemo"))){
    error += "新規デモ件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsstorefront"))){
    error += "新規店頭接客件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsmail"))){
    error += "新規メール件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsdm"))){
    error += "新規dm件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientsslc"))){
    error += "新規SLC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("prioritydemo"))){
    error += "重点ターゲットデモ件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("prioritydm"))){
    error += "重点ターゲットdm件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("prioritystorefront"))){
    error += "重点ターゲット店頭接客件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("prioritybc"))){
    error += "重点ターゲットBC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("prioritymail"))){
    error += "重点ターゲットメール件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("priorityslc"))){
    error += "重点ターゲットSLC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("priorityproposal"))){
    error += "重点ターゲットご提案書件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("priorityvisit"))){
    error += "重点ターゲット来店確約数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("prioritytc"))){
    error += "重点ターゲットTC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("oldabhot"))){
    error += "低年式ターゲットABホット発生件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("prioritytarget"))){
    error += "重点ターゲットには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("oldappraisal"))){
    error += "低年式ターゲットご提案書件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("olddemo"))){
    error += "低年式ターゲットデモ件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("oldbc"))){
    error += "低年式ターゲットBC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("oldproposal"))){
    error += "重点ターゲットご提案書件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("oldstorefront"))){
    error += "低年式ターゲット店頭接客件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("oldvisit"))){
    error += "低年式ターゲット来店確約数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("oldslc"))){
    error += "低年式ターゲットSLC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("oldtarget"))){
    error += "重点ターゲットには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectionmail"))){
    error += "車検先行ターゲットメール件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectionvisit"))){
    error += "車検先行ターゲット来店確約数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectionslc"))){
    error += "車検先行ターゲットSLC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectiontc"))){
    error += "車検先行ターゲットTC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectiondm"))){
    error += "車検先行ターゲットdm件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectionabhot"))){
    error += "車検先行ターゲットABホット発生件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("oldmail"))){
    error += "低年式ターゲットメール件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectiondemo"))){
    error += "車検先行ターゲットデモ件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectionappraisal"))){
    error += "車検先行ターゲットご提案書件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectionbc"))){
    error += "車検先行ターゲットBC件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectionstorefront"))){
    error += "車検先行ターゲット店頭接客件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectiontarget"))){
    error += "車検先行ターゲットには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("inspectionproposal"))){
    error += "車検先行ターゲットご提案書件数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("newclientscars"))){
    error += "新規受注台数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("promotionalcars"))){
    error += "促進活動受注台数には数値のみを入れてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",weeklyProccessPlanform);
	return mapping.findForward("error");
}


                
		
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
                		weeklyProccessPlan.setNewclientsvisit(weeklyProccessPlanform.getNewclientsvisit());
		weeklyProccessPlan.setNewclientsstock(weeklyProccessPlanform.getNewclientsstock());
		weeklyProccessPlan.setNewclientstc(weeklyProccessPlanform.getNewclientstc());
		weeklyProccessPlan.setNewclientsstockothers(weeklyProccessPlanform.getNewclientsstockothers());
		weeklyProccessPlan.setNewclientsstockexhibition(weeklyProccessPlanform.getNewclientsstockexhibition());
		weeklyProccessPlan.setNewclientsstockstorefront(weeklyProccessPlanform.getNewclientsstockstorefront());
		weeklyProccessPlan.setNewclientsstockincrement(weeklyProccessPlanform.getNewclientsstockincrement());
		weeklyProccessPlan.setNewclientsintroductionoffer(weeklyProccessPlanform.getNewclientsintroductionoffer());
		weeklyProccessPlan.setNewclientsintroductionpostcard(weeklyProccessPlanform.getNewclientsintroductionpostcard());
		weeklyProccessPlan.setNewclientsintroduction(weeklyProccessPlanform.getNewclientsintroduction());
		weeklyProccessPlan.setPriorityabhot(weeklyProccessPlanform.getPriorityabhot());
		weeklyProccessPlan.setPriorityappraisal(weeklyProccessPlanform.getPriorityappraisal());
		weeklyProccessPlan.setNewclientsabhot(weeklyProccessPlanform.getNewclientsabhot());
		weeklyProccessPlan.setNewclientsappraisal(weeklyProccessPlanform.getNewclientsappraisal());
		weeklyProccessPlan.setNewclientsbc(weeklyProccessPlanform.getNewclientsbc());
		weeklyProccessPlan.setNewclientsdemo(weeklyProccessPlanform.getNewclientsdemo());
		weeklyProccessPlan.setNewclientsstorefront(weeklyProccessPlanform.getNewclientsstorefront());
		weeklyProccessPlan.setNewclientsmail(weeklyProccessPlanform.getNewclientsmail());
		weeklyProccessPlan.setNewclientsdm(weeklyProccessPlanform.getNewclientsdm());
		weeklyProccessPlan.setNewclientsslc(weeklyProccessPlanform.getNewclientsslc());
		weeklyProccessPlan.setPrioritydemo(weeklyProccessPlanform.getPrioritydemo());
		weeklyProccessPlan.setPrioritydm(weeklyProccessPlanform.getPrioritydm());
		weeklyProccessPlan.setPrioritystorefront(weeklyProccessPlanform.getPrioritystorefront());
		weeklyProccessPlan.setPrioritybc(weeklyProccessPlanform.getPrioritybc());
		weeklyProccessPlan.setPrioritymail(weeklyProccessPlanform.getPrioritymail());
		weeklyProccessPlan.setPriorityslc(weeklyProccessPlanform.getPriorityslc());
		weeklyProccessPlan.setPriorityproposal(weeklyProccessPlanform.getPriorityproposal());
		weeklyProccessPlan.setPriorityvisit(weeklyProccessPlanform.getPriorityvisit());
		weeklyProccessPlan.setPrioritytc(weeklyProccessPlanform.getPrioritytc());
		weeklyProccessPlan.setOldabhot(weeklyProccessPlanform.getOldabhot());
		weeklyProccessPlan.setPrioritytarget(weeklyProccessPlanform.getPrioritytarget());
		weeklyProccessPlan.setOldappraisal(weeklyProccessPlanform.getOldappraisal());
		weeklyProccessPlan.setOlddemo(weeklyProccessPlanform.getOlddemo());
		weeklyProccessPlan.setOldbc(weeklyProccessPlanform.getOldbc());
		weeklyProccessPlan.setOldproposal(weeklyProccessPlanform.getOldproposal());
		weeklyProccessPlan.setOldstorefront(weeklyProccessPlanform.getOldstorefront());
		weeklyProccessPlan.setOldvisit(weeklyProccessPlanform.getOldvisit());
		weeklyProccessPlan.setOldtc(weeklyProccessPlanform.getOldtc());
		weeklyProccessPlan.setOlddm(weeklyProccessPlanform.getOlddm());
		weeklyProccessPlan.setOldslc(weeklyProccessPlanform.getOldslc());
		weeklyProccessPlan.setOldtarget(weeklyProccessPlanform.getOldtarget());
		weeklyProccessPlan.setInspectionmail(weeklyProccessPlanform.getInspectionmail());
		weeklyProccessPlan.setInspectionvisit(weeklyProccessPlanform.getInspectionvisit());
		weeklyProccessPlan.setInspectionslc(weeklyProccessPlanform.getInspectionslc());
		weeklyProccessPlan.setInspectiontc(weeklyProccessPlanform.getInspectiontc());
		weeklyProccessPlan.setInspectiondm(weeklyProccessPlanform.getInspectiondm());
		weeklyProccessPlan.setInspectionabhot(weeklyProccessPlanform.getInspectionabhot());
		weeklyProccessPlan.setOldmail(weeklyProccessPlanform.getOldmail());
		weeklyProccessPlan.setInspectiondemo(weeklyProccessPlanform.getInspectiondemo());
		weeklyProccessPlan.setInspectionappraisal(weeklyProccessPlanform.getInspectionappraisal());
		weeklyProccessPlan.setInspectionbc(weeklyProccessPlanform.getInspectionbc());
		weeklyProccessPlan.setInspectionstorefront(weeklyProccessPlanform.getInspectionstorefront());
		weeklyProccessPlan.setInspectiontarget(weeklyProccessPlanform.getInspectiontarget());
		weeklyProccessPlan.setInspectionproposal(weeklyProccessPlanform.getInspectionproposal());
		weeklyProccessPlan.setNewclientscars(weeklyProccessPlanform.getNewclientscars());
		weeklyProccessPlan.setPromotionalcars(weeklyProccessPlanform.getPromotionalcars());
		weeklyProccessPlan.setType(weeklyProccessPlanform.getType());
		weeklyProccessPlan.setMonth(weeklyProccessPlanform.getMonth());
		weeklyProccessPlan.setYear(weeklyProccessPlanform.getYear());
		weeklyProccessPlan.setWeek(weeklyProccessPlanform.getWeek());


		
		StringFullfiller.fullfil(weeklyProccessPlan);
                

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