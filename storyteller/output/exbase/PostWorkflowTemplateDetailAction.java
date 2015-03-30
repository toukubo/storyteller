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


public class PostWorkflowTemplateDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		WorkflowTemplate workflowTemplate = new WorkflowTemplateImpl();
		WorkflowTemplateForm workflowTemplateform = new WorkflowTemplateForm();
		Criteria criteria = session.createCriteria(WorkflowTemplate.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			workflowTemplate = (WorkflowTemplate) criteria.uniqueResult();
			new CopyProperties(workflowTemplate,workflowTemplateform);
		} else if(req.getAttribute("form")!=null){
                        workflowTemplateform = (WorkflowTemplateForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(workflowTemplateform.getId()));
			workflowTemplate = (WorkflowTemplate) criteria.uniqueResult();
		}
		

		req.setAttribute("model",workflowTemplate);
		req.setAttribute("form",workflowTemplateform);


                   
		
		return mapping.findForward("success");
	}
	
	
}