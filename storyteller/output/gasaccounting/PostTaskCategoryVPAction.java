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


public class PostTaskCategoryVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		TaskCategory taskcategory = new TaskCategoryImpl();
		TaskCategoryForm taskcategoryform = (TaskCategoryForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(taskcategoryform.getId() == null || taskcategoryform.getId().intValue() == 0){
			taskcategory.setId(null);
			taskcategoryform.setId(null);
		}else{
			taskcategory.setId(taskcategoryform.getId());
			Criteria criteria = session.createCriteria(TaskCategory.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			taskcategory = (TaskCategory) criteria.uniqueResult();

		}
                		taskcategory.setName(taskcategoryform.getName());


		
		StringFullfiller.fullfil(taskcategory);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(taskcategory);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTaskCategoryDetail.do", taskcategory.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "TaskCategorys.do", taskcategory.getId().toString());
		return null;

		
	}
	
	
}