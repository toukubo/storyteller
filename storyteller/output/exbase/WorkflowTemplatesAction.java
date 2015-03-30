package net.exbase.web.app;

import net.exbase.model.*;
import net.exbase.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class WorkflowTemplatesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="WorkflowTemplatesAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(WorkflowTemplate.class);
                
		req.setAttribute("workflowTemplates",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			WorkflowTemplate workflowTemplate = (WorkflowTemplate) iter.next();
//			vector.add(workflowTemplate);
//		}
		WorkflowTemplate workflowTemplate = new WorkflowTemplateImpl();
		WorkflowTemplateForm workflowTemplateform = new WorkflowTemplateForm();
		criteria = session.createCriteria(WorkflowTemplate.class);


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
		
		
//</snippet>

                  Criteria criteriaUser= session.createCriteria(User.class);
			req.setAttribute("Users", criteriaUser.list());

 

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportWorkflowTemplatesAction csvExportWorkflowTemplatesAction 
//                               = new CsvExportWorkflowTemplatesAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}