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


public class PostJobCategoryDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		JobCategory jobcategory = new JobCategoryImpl();
		JobCategoryForm jobcategoryform = new JobCategoryForm();
		Criteria criteria = session.createCriteria(JobCategory.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			jobcategory = (JobCategory) criteria.uniqueResult();
			new CopyProperties(jobcategory,jobcategoryform);
		} else if(req.getAttribute("form")!=null){
                        jobcategoryform = (JobCategoryForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(jobcategoryform.getId()));
			jobcategory = (JobCategory) criteria.uniqueResult();
		}
		

		req.setAttribute("model",jobcategory);
		req.setAttribute("form",jobcategoryform);


                   
		
		return mapping.findForward("success");
	}
	
	
}