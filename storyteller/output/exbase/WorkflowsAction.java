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


public class WorkflowsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="WorkflowsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Workflow.class);
                
		req.setAttribute("workflows",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Workflow workflow = (Workflow) iter.next();
//			vector.add(workflow);
//		}
		Workflow workflow = new WorkflowImpl();
		WorkflowForm workflowform = new WorkflowForm();
		criteria = session.createCriteria(Workflow.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			workflow = (Workflow) criteria.uniqueResult();
			new CopyProperties(workflow,workflowform);
		} else if(req.getAttribute("form")!=null){
                        workflowform = (WorkflowForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(workflowform.getId()));
			workflow = (Workflow) criteria.uniqueResult();
		}
		

		req.setAttribute("model",workflow);
		req.setAttribute("form",workflowform);
		
		
//</snippet>

                  Criteria criteriaWorkflowTemplate= session.createCriteria(WorkflowTemplate.class);
			req.setAttribute("WorkflowTemplates", criteriaWorkflowTemplate.list());

 

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportWorkflowsAction csvExportWorkflowsAction 
//                               = new CsvExportWorkflowsAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}