package net.exbase.web.app;

import net.exbase.model.*;
import net.exbase.beans.*;

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
import org.hibernate.criterion.Restrictions;


public class PostCategoryVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Category category = new CategoryImpl();
		CategoryForm categoryform = (CategoryForm) form;

                String error = "";
if(StringUtils.isBlank(categoryform.getName())){
   error += "名前は空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",categoryform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(categoryform.getId() == null || categoryform.getId().intValue() == 0){
			category.setId(null);
			categoryform.setId(null);
		}else{
			category.setId(categoryform.getId());
			Criteria criteria = session.createCriteria(Category.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			category = (Category) criteria.uniqueResult();

		}
                		category.setName(categoryform.getName());


		
		StringFullfiller.fullfil(category);
                
		session.saveOrUpdate(category);
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCategoryDetail.do", category.getId().toString());
		return null;

		
	}
	
	
}