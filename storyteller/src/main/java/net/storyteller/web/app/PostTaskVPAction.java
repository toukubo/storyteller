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


public class PostTaskVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Task task = new TaskImpl();
		TaskForm taskform = (TaskForm) form;

                String error = "";


                		Integer intraUserInt = taskform.getIntraUser();
		taskform.setIntraUser(null);
		Integer j2eeStoryInt = taskform.getJ2eeStory();
		taskform.setJ2eeStory(null);
		Integer taskTemplateInt = taskform.getTaskTemplate();
		taskform.setTaskTemplate(null);

		
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
		task.setDone(taskform.isDone());
		task.setStartdate(taskform.getStartdate());
		task.setEnddate(taskform.getEnddate());
		task.setHour(taskform.getHour());
		task.setAcknowledged(taskform.isAcknowledged());
		task.setAssigned(taskform.isAssigned());
		task.setSummery(taskform.getSummery());
		task.setOrdernum(taskform.getOrdernum());


		
		StringFullfiller.fullfil(task);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		task.setIntraUser(intrauser);
		criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(j2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		task.setJ2eeStory(j2eestory);
		criteria2 = session.createCriteria(TaskTemplate.class);
		criteria2.add(Restrictions.idEq(taskTemplateInt));
		TaskTemplate tasktemplate = (TaskTemplate) criteria2.uniqueResult();
		task.setTaskTemplate(tasktemplate);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(task);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTaskDetail.do", task.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "AjaxDisplayTasks.do", null);
		return null;

		
	}
	
	
}