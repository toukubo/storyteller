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


public class PostWorkflowVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Workflow workflow = new WorkflowImpl();
		WorkflowForm workflowform = (WorkflowForm) form;

                String error = "";
if(StringUtils.isBlank(workflowform.getName())){
   error += "名称は空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",workflowform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(workflowform.getId() == null || workflowform.getId().intValue() == 0){
			workflow.setId(null);
			workflowform.setId(null);
		}else{
			workflow.setId(workflowform.getId());
			Criteria criteria = session.createCriteria(Workflow.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			workflow = (Workflow) criteria.uniqueResult();

		}
                		workflow.setName(workflowform.getName());


		
		StringFullfiller.fullfil(workflow);
                
		session.saveOrUpdate(workflow);
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostWorkflowDetail.do", workflow.getId().toString());
		return null;

		
	}
	
	
}