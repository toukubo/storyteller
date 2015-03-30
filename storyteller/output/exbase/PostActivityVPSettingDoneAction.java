package net.exbase.web.app;

import net.exbase.model.*;
import net.exbase.beans.*;

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


public class PostActivityVPSettingDoneAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Activity activity = new ActivityImpl();
		ActivityForm activityform = (ActivityForm) form;

                String error = "";


                		Integer activityTemplateInt = activityform.getActivityTemplate();
		activityform.setActivityTemplate(null);
		Integer workflowInt = activityform.getWorkflow();
		activityform.setWorkflow(null);
		Integer excelInt = activityform.getExcel();
		activityform.setExcel(null);
		Integer confirmationInt = activityform.getConfirmation();
		activityform.setConfirmation(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(activityform.getId() == null || activityform.getId().intValue() == 0){
			activity.setId(null);
			activityform.setId(null);
		}else{
			activity.setId(activityform.getId());
			Criteria criteria = session.createCriteria(Activity.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			activity = (Activity) criteria.uniqueResult();

		}
                		activity.setUpdatedate(activityform.getUpdatedate());
		activity.setNotified(activityform.getNotified());
		activity.setDone(activityform.getDone());


		
		StringFullfiller.fullfil(activity);
                		Criteria criteria2 = session.createCriteria(ActivityTemplate.class);
		criteria2.add(Restrictions.idEq(activityTemplateInt));
		ActivityTemplate activitytemplate = (ActivityTemplate) criteria2.uniqueResult();
		activity.setActivityTemplate(activitytemplate);
		criteria2 = session.createCriteria(Workflow.class);
		criteria2.add(Restrictions.idEq(workflowInt));
		Workflow workflow = (Workflow) criteria2.uniqueResult();
		activity.setWorkflow(workflow);
		criteria2 = session.createCriteria(Excel.class);
		criteria2.add(Restrictions.idEq(excelInt));
		Excel excel = (Excel) criteria2.uniqueResult();
		activity.setExcel(excel);
		criteria2 = session.createCriteria(Confirmation.class);
		criteria2.add(Restrictions.idEq(confirmationInt));
		Confirmation confirmation = (Confirmation) criteria2.uniqueResult();
		activity.setConfirmation(confirmation);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(activity);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostActivityDetail.do", activity.getId().toString());
		return null;

		
	}
	
	
}