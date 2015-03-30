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

public class ColumnChioseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ColumnChiose columnChiose = new ColumnChioseImpl();
		ColumnChioseForm columnChioseform = (ColumnChioseForm) form;
		
                		Integer excelTemplateInt = columnChioseform.getExcelTemplate();
		columnChioseform.setExcelTemplate(null);
		Integer columnDefinitionInt = columnChioseform.getColumnDefinition();
		columnChioseform.setColumnDefinition(null);

		
		BeanUtils.copyProperties(columnChiose,columnChioseform);
		StringFullfiller.fullfil(columnChiose);
		if(columnChioseform.getId() == null || columnChioseform.getId().intValue() == 0){
			columnChiose.setId(null);
		}else{
			columnChiose.setId(columnChioseform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(ExcelTemplate.class);
		criteria2.add(Restrictions.idEq(excelTemplateInt));
		ExcelTemplate exceltemplate = (ExcelTemplate) criteria2.uniqueResult();
		columnChiose.setExcelTemplate(exceltemplate);
		criteria2 = session.createCriteria(ColumnDefinition.class);
		criteria2.add(Restrictions.idEq(columnDefinitionInt));
		ColumnDefinition columndefinition = (ColumnDefinition) criteria2.uniqueResult();
		columnChiose.setColumnDefinition(columndefinition);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(columnChiose);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ColumnChioseDetail.do", columnChiose.getId().toString());
		return null;

		
	}
	
	
}