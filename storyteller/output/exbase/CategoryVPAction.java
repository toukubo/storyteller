package net.exbase.web;

import net.exbase.model.*;
import net.exbase.model.crud.*;

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

public class CategoryVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Category category = new CategoryImpl();
		CategoryForm categoryform = (CategoryForm) form;
		
                		Integer excelTemplateInt = categoryform.getExcelTemplate();
		categoryform.setExcelTemplate(null);

		
		BeanUtils.copyProperties(category,categoryform);
		StringFullfiller.fullfil(category);
		if(categoryform.getId() == null || categoryform.getId().intValue() == 0){
			category.setId(null);
		}else{
			category.setId(categoryform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(ExcelTemplate.class);
		criteria2.add(Restrictions.idEq(excelTemplateInt));
		ExcelTemplate exceltemplate = (ExcelTemplate) criteria2.uniqueResult();
		category.setExcelTemplate(exceltemplate);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(category);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "CategoryDetail.do", category.getId().toString());
		return null;

		
	}
	
	
}