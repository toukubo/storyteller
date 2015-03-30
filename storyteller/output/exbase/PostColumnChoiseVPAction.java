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
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostColumnChoiseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ColumnChoise columnChoise = new ColumnChoiseImpl();
		ColumnChoiseForm columnChoiseform = (ColumnChoiseForm) form;

                String error = "";


                		Integer excelTemplateInt = columnChoiseform.getExcelTemplate();
		columnChoiseform.setExcelTemplate(null);
		Integer columnDefinitionInt = columnChoiseform.getColumnDefinition();
		columnChoiseform.setColumnDefinition(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(columnChoiseform.getId() == null || columnChoiseform.getId().intValue() == 0){
			columnChoise.setId(null);
			columnChoiseform.setId(null);
		}else{
			columnChoise.setId(columnChoiseform.getId());
			Criteria criteria = session.createCriteria(ColumnChoise.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			columnChoise = (ColumnChoise) criteria.uniqueResult();

		}
                		columnChoise.setMaxlength(columnChoiseform.getMaxlength());
		columnChoise.setDisplayed(columnChoiseform.isDisplayed());
		columnChoise.setExcelsheetnum(columnChoiseform.getExcelsheetnum());
		columnChoise.setExcelrownum(columnChoiseform.getExcelrownum());
		columnChoise.setExcelcolumnnum(columnChoiseform.getExcelcolumnnum());
		columnChoise.setDirection(columnChoiseform.getDirection());


		
		StringFullfiller.fullfil(columnChoise);
                		Criteria criteria2 = session.createCriteria(ExcelTemplate.class);
		criteria2.add(Restrictions.idEq(excelTemplateInt));
		ExcelTemplate exceltemplate = (ExcelTemplate) criteria2.uniqueResult();
		columnChoise.setExcelTemplate(exceltemplate);
		criteria2 = session.createCriteria(ColumnDefinition.class);
		criteria2.add(Restrictions.idEq(columnDefinitionInt));
		ColumnDefinition columndefinition = (ColumnDefinition) criteria2.uniqueResult();
		columnChoise.setColumnDefinition(columndefinition);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(columnChoise);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostColumnChoiseDetail.do", columnChoise.getId().toString());
		return null;

		
	}
	
	
}