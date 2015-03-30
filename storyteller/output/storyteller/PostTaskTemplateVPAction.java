package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class PostTaskTemplateVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		TaskTemplate taskTemplate = new TaskTemplateImpl();
		TaskTemplateForm taskTemplateform = (TaskTemplateForm) form;

                String error = "";


                		Integer roleInt = taskTemplateform.getRole();
		taskTemplateform.setRole(null);
		Integer storytellerRoleInt = taskTemplateform.getStorytellerRole();
		taskTemplateform.setStorytellerRole(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(taskTemplateform.getId() == null || taskTemplateform.getId().intValue() == 0){
			taskTemplate.setId(null);
			taskTemplateform.setId(null);
		}else{
			taskTemplate.setId(taskTemplateform.getId());
			Criteria criteria = session.createCriteria(TaskTemplate.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			taskTemplate = (TaskTemplate) criteria.uniqueResult();

		}
                		taskTemplate.setName(taskTemplateform.getName());
		taskTemplate.setCyclic(taskTemplateform.isCyclic());
		taskTemplate.setOrdernum(taskTemplateform.getOrdernum());


		
		StringFullfiller.fullfil(taskTemplate);
                		Criteria criteria2 = session.createCriteria(Role.class);
		criteria2.add(Restrictions.idEq(roleInt));
		Role role = (Role) criteria2.uniqueResult();
		taskTemplate.setRole(role);
		criteria2 = session.createCriteria(StorytellerRole.class);
		criteria2.add(Restrictions.idEq(storytellerRoleInt));
		StorytellerRole storytellerrole = (StorytellerRole) criteria2.uniqueResult();
		taskTemplate.setStorytellerRole(storytellerrole);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(taskTemplate);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTaskTemplateDetail.do", taskTemplate.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "TaskTemplates.do", taskTemplate.getId().toString());
		return null;

		
	}
	
	
}