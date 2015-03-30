package net.point.web.app;

import net.point.model.*;
import net.point.beans.*;

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


public class PostTaskVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Task task = new TaskImpl();
		TaskForm taskform = (TaskForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(taskform.getId() == null || taskform.getId().intValue() == 0){
			task.setId(null);
			taskform.setId(null);
		}else{
			task.setId(taskform.getId());
			Criteria criteria = session.createCriteria(Task.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			task = (Task) criteria.uniqueResult();

		}
                		task.setName(taskform.getName());
		task.setValue(taskform.getValue());
		task.setDone(taskform.isDone());
		task.setDate(taskform.getDate());
		task.setTemplate(taskform.isTemplate());
		task.setDuration(taskform.getDuration());


		
		StringFullfiller.fullfil(task);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(task);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostTaskDetail.do", task.getId().toString());
		return null;

		
	}
	
	
}