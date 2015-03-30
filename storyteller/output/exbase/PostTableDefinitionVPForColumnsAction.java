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


public class PostTableDefinitionVPForColumnsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		TableDefinition tableDefinition = new TableDefinitionImpl();
		TableDefinitionForm tableDefinitionform = (TableDefinitionForm) form;

                String error = "";


                		Integer excelTemplateInt = tableDefinitionform.getExcelTemplate();
		tableDefinitionform.setExcelTemplate(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(tableDefinitionform.getId() == null || tableDefinitionform.getId().intValue() == 0){
			tableDefinition.setId(null);
			tableDefinitionform.setId(null);
		}else{
			tableDefinition.setId(tableDefinitionform.getId());
			Criteria criteria = session.createCriteria(TableDefinition.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			tableDefinition = (TableDefinition) criteria.uniqueResult();

		}
                		tableDefinition.setSheetname(tableDefinitionform.getSheetname());
		tableDefinition.setName(tableDefinitionform.getName());
		tableDefinition.setMaster(tableDefinitionform.isMaster());


		
		StringFullfiller.fullfil(tableDefinition);
                		Criteria criteria2 = session.createCriteria(ExcelTemplate.class);
		criteria2.add(Restrictions.idEq(excelTemplateInt));
		ExcelTemplate exceltemplate = (ExcelTemplate) criteria2.uniqueResult();
		tableDefinition.setExcelTemplate(exceltemplate);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(tableDefinition);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostTableDefinitionDetail.do", tableDefinition.getId().toString(),"success=true");
		return null;

		
	}
	
	
}