package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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
		Integer jobInt = taskform.getJob();
		taskform.setJob(null);
		Integer taskCategoryInt = taskform.getTaskCategory();
		taskform.setTaskCategory(null);

		
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
                		task.setHour(taskform.getHour());
		task.setName(taskform.getName());
		task.setDate(taskform.getDate());
		task.setProcessed(taskform.isProcessed());
		task.setIcaluid(taskform.getIcaluid());


		
		StringFullfiller.fullfil(task);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		task.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Job.class);
		criteria2.add(Restrictions.idEq(jobInt));
		Job job = (Job) criteria2.uniqueResult();
		task.setJob(job);
		criteria2 = session.createCriteria(TaskCategory.class);
		criteria2.add(Restrictions.idEq(taskCategoryInt));
		TaskCategory taskcategory = (TaskCategory) criteria2.uniqueResult();
		task.setTaskCategory(taskcategory);


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

		
		new HTTPGetRedirection(req, res, "Tasks.do", task.getId().toString());
		return null;

		
	}
	
	
}