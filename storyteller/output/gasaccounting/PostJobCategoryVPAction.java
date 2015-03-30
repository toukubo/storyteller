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


public class PostJobCategoryVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		JobCategory jobcategory = new JobCategoryImpl();
		JobCategoryForm jobcategoryform = (JobCategoryForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(jobcategoryform.getId() == null || jobcategoryform.getId().intValue() == 0){
			jobcategory.setId(null);
			jobcategoryform.setId(null);
		}else{
			jobcategory.setId(jobcategoryform.getId());
			Criteria criteria = session.createCriteria(JobCategory.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			jobcategory = (JobCategory) criteria.uniqueResult();

		}
                		jobcategory.setName(jobcategoryform.getName());


		
		StringFullfiller.fullfil(jobcategory);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(jobcategory);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostJobCategoryDetail.do", jobcategory.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "JobCategorys.do", jobcategory.getId().toString());
		return null;

		
	}
	
	
}