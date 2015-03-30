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
import org.hibernate.criterion.Restrictions;


public class PostWorkflowTemplateVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		WorkflowTemplate workflowTemplate = new WorkflowTemplateImpl();
		WorkflowTemplateForm workflowTemplateform = (WorkflowTemplateForm) form;

                String error = "";
if(StringUtils.isBlank(workflowtemplateform.getName())){
   error += "ワークフロールール名は空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",workflowTemplateform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(workflowTemplateform.getId() == null || workflowTemplateform.getId().intValue() == 0){
			workflowTemplate.setId(null);
			workflowTemplateform.setId(null);
		}else{
			workflowTemplate.setId(workflowTemplateform.getId());
			Criteria criteria = session.createCriteria(WorkflowTemplate.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			workflowTemplate = (WorkflowTemplate) criteria.uniqueResult();

		}
                		workflowTemplate.setName(workflowTemplateform.getName());


		
		StringFullfiller.fullfil(workflowTemplate);
                
		session.saveOrUpdate(workflowTemplate);
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostWorkflowTemplateDetail.do", workflowTemplate.getId().toString());
		return null;

		
	}
	
	
}