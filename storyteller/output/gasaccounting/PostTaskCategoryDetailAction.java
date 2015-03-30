package net.gasaccounting.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

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


public class PostTaskCategoryDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		TaskCategory taskcategory = new TaskCategoryImpl();
		TaskCategoryForm taskcategoryform = new TaskCategoryForm();
		Criteria criteria = session.createCriteria(TaskCategory.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			taskcategory = (TaskCategory) criteria.uniqueResult();
			new CopyProperties(taskcategory,taskcategoryform);
		} else if(req.getAttribute("form")!=null){
                        taskcategoryform = (TaskCategoryForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(taskcategoryform.getId()));
			taskcategory = (TaskCategory) criteria.uniqueResult();
		}
		

		req.setAttribute("model",taskcategory);
		req.setAttribute("form",taskcategoryform);


                   
		
		return mapping.findForward("success");
	}
	
	
}