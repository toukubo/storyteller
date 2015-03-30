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


public class PostUpdateKeyChoiseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		UpdateKeyChoise updateKeyChoise = new UpdateKeyChoiseImpl();
		UpdateKeyChoiseForm updateKeyChoiseform = (UpdateKeyChoiseForm) form;

                String error = "";


                		Integer excelTemplateInt = updateKeyChoiseform.getExcelTemplate();
		updateKeyChoiseform.setExcelTemplate(null);
		Integer columnDefinitionInt = updateKeyChoiseform.getColumnDefinition();
		updateKeyChoiseform.setColumnDefinition(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(updateKeyChoiseform.getId() == null || updateKeyChoiseform.getId().intValue() == 0){
			updateKeyChoise.setId(null);
			updateKeyChoiseform.setId(null);
		}else{
			updateKeyChoise.setId(updateKeyChoiseform.getId());
			Criteria criteria = session.createCriteria(UpdateKeyChoise.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			updateKeyChoise = (UpdateKeyChoise) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(updateKeyChoise);
                		Criteria criteria2 = session.createCriteria(ExcelTemplate.class);
		criteria2.add(Restrictions.idEq(excelTemplateInt));
		ExcelTemplate exceltemplate = (ExcelTemplate) criteria2.uniqueResult();
		updateKeyChoise.setExcelTemplate(exceltemplate);
		criteria2 = session.createCriteria(ColumnDefinition.class);
		criteria2.add(Restrictions.idEq(columnDefinitionInt));
		ColumnDefinition columndefinition = (ColumnDefinition) criteria2.uniqueResult();
		updateKeyChoise.setColumnDefinition(columndefinition);

		session.saveOrUpdate(updateKeyChoise);
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostUpdateKeyChoiseDetail.do", updateKeyChoise.getId().toString(),"success=true");
		return null;

		
	}
	
	
}