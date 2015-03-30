package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class AjaxDisplayTaskTemplatesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(TaskTemplate.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			TaskTemplate taskTemplate = (TaskTemplate) iter.next();
			vector.add(taskTemplate);
		}
		TaskTemplate taskTemplate = new TaskTemplateImpl();
		TaskTemplateForm taskTemplateform = new TaskTemplateForm();
		criteria = session.createCriteria(TaskTemplate.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			taskTemplate = (TaskTemplate) criteria.uniqueResult();
			new CopyProperties(taskTemplate,taskTemplateform);
		} else if(req.getAttribute("form")!=null){
                        taskTemplateform = (TaskTemplateForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(taskTemplateform.getId()));
			taskTemplate = (TaskTemplate) criteria.uniqueResult();
		}
		

		req.setAttribute("model",taskTemplate);
		req.setAttribute("form",taskTemplateform);
		
		
		req.setAttribute("taskTemplates",vector);


                  Criteria criteriaRole= session.createCriteria(Role.class);
			req.setAttribute("Roles", criteriaRole.list());

Criteria criteriaStorytellerRole= session.createCriteria(StorytellerRole.class);
			req.setAttribute("StorytellerRoles", criteriaStorytellerRole.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}