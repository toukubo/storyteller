package net.exbase.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.exbase.model.*;
import net.exbase.beans.*;


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


public class PostActivityTemplateDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ActivityTemplate activityTemplate = new ActivityTemplateImpl();
		ActivityTemplateForm activityTemplateform = new ActivityTemplateForm();
		Criteria criteria = session.createCriteria(ActivityTemplate.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			activityTemplate = (ActivityTemplate) criteria.uniqueResult();
			new CopyProperties(activityTemplate,activityTemplateform);
		} else if(req.getAttribute("form")!=null){
                        activityTemplateform = (ActivityTemplateForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(activityTemplateform.getId()));
			activityTemplate = (ActivityTemplate) criteria.uniqueResult();
		}
		

		req.setAttribute("model",activityTemplate);
		req.setAttribute("form",activityTemplateform);


                  Criteria criteriaUser= session.createCriteria(User.class);
			req.setAttribute("Users", criteriaUser.list());

Criteria criteriaExcelTemplate= session.createCriteria(ExcelTemplate.class);
			req.setAttribute("ExcelTemplates", criteriaExcelTemplate.list());

Criteria criteriaWorkflowTemplate= session.createCriteria(WorkflowTemplate.class);
			req.setAttribute("WorkflowTemplates", criteriaWorkflowTemplate.list());

 
		
		return mapping.findForward("success");
	}
	
	
}