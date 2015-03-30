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


public class UpdateTaskFromFromTaskTemplatesAction extends Action{
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
                   
                execute(task,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateTaskFromFromTaskTemplatesAction action = new UpdateTaskFromFromTaskTemplatesAction();
				Criteria criteria = session.createCriteria(Task.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Task task = (Task) criteria.uniqueResult();
				action.execute(task, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void execute(Task task,Session session){
		
	}

}