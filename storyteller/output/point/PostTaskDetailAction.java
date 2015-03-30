package net.point.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.point.model.*;
import net.point.beans.*;


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


public class PostTaskDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Task task = new TaskImpl();
		TaskForm taskform = new TaskForm();
		Criteria criteria = session.createCriteria(Task.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			task = (Task) criteria.uniqueResult();
			new CopyProperties(task,taskform);
		} else if(req.getAttribute("form")!=null){
                        taskform = (TaskForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(taskform.getId()));
			task = (Task) criteria.uniqueResult();
		}
		

		req.setAttribute("model",task);
		req.setAttribute("form",taskform);


                   
		
		return mapping.findForward("success");
	}
	
	
}