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


public class PostActivityTemplateVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ActivityTemplate activityTemplate = new ActivityTemplateImpl();
		ActivityTemplateForm activityTemplateform = (ActivityTemplateForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",activityTemplateform);
	return mapping.findForward("error");
}


                		Integer userInt = activityTemplateform.getUser();
		activityTemplateform.setUser(null);
		Integer excelTemplateInt = activityTemplateform.getExcelTemplate();
		activityTemplateform.setExcelTemplate(null);
		Integer workflowTemplateInt = activityTemplateform.getWorkflowTemplate();
		activityTemplateform.setWorkflowTemplate(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(activityTemplateform.getId() == null || activityTemplateform.getId().intValue() == 0){
			activityTemplate.setId(null);
			activityTemplateform.setId(null);
		}else{
			activityTemplate.setId(activityTemplateform.getId());
			Criteria criteria = session.createCriteria(ActivityTemplate.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			activityTemplate = (ActivityTemplate) criteria.uniqueResult();

		}
                		activityTemplate.setTasktype(activityTemplateform.getTasktype());


		
		StringFullfiller.fullfil(activityTemplate);
                		Criteria criteria2 = session.createCriteria(User.class);
		criteria2.add(Restrictions.idEq(userInt));
		User user = (User) criteria2.uniqueResult();
		activityTemplate.setUser(user);
		criteria2 = session.createCriteria(ExcelTemplate.class);
		criteria2.add(Restrictions.idEq(excelTemplateInt));
		ExcelTemplate exceltemplate = (ExcelTemplate) criteria2.uniqueResult();
		activityTemplate.setExcelTemplate(exceltemplate);
		criteria2 = session.createCriteria(WorkflowTemplate.class);
		criteria2.add(Restrictions.idEq(workflowTemplateInt));
		WorkflowTemplate workflowtemplate = (WorkflowTemplate) criteria2.uniqueResult();
		activityTemplate.setWorkflowTemplate(workflowtemplate);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(activityTemplate);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostActivityTemplateDetail.do", activityTemplate.getId().toString());
		return null;

		
	}
	
	
}