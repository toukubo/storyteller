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


public class PostVariableChoiseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		VariableChoise variableChoise = new VariableChoiseImpl();
		VariableChoiseForm variableChoiseform = (VariableChoiseForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",variableChoiseform);
	return mapping.findForward("error");
}


                		Integer excelTemplateInt = variableChoiseform.getExcelTemplate();
		variableChoiseform.setExcelTemplate(null);
		Integer restrictedColumnDefinitionInt = variableChoiseform.getRestrictedColumnDefinition();
		variableChoiseform.setRestrictedColumnDefinition(null);
		Integer labelColumnDefinitionInt = variableChoiseform.getLabelColumnDefinition();
		variableChoiseform.setLabelColumnDefinition(null);
		Integer optionColumnDefinitionInt = variableChoiseform.getOptionColumnDefinition();
		variableChoiseform.setOptionColumnDefinition(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(variableChoiseform.getId() == null || variableChoiseform.getId().intValue() == 0){
			variableChoise.setId(null);
			variableChoiseform.setId(null);
		}else{
			variableChoise.setId(variableChoiseform.getId());
			Criteria criteria = session.createCriteria(VariableChoise.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			variableChoise = (VariableChoise) criteria.uniqueResult();

		}
                		variableChoise.setRestrictionOperator(variableChoiseform.getRestrictionOperator());
		variableChoise.setRestrictionValue(variableChoiseform.getRestrictionValue());


		
		StringFullfiller.fullfil(variableChoise);
                		Criteria criteria2 = session.createCriteria(ExcelTemplate.class);
		criteria2.add(Restrictions.idEq(excelTemplateInt));
		ExcelTemplate exceltemplate = (ExcelTemplate) criteria2.uniqueResult();
		variableChoise.setExcelTemplate(exceltemplate);
		criteria2 = session.createCriteria(RestrictedColumnDefinition.class);
		criteria2.add(Restrictions.idEq(restrictedColumnDefinitionInt));
		RestrictedColumnDefinition restrictedcolumndefinition = (RestrictedColumnDefinition) criteria2.uniqueResult();
		variableChoise.setRestrictedColumnDefinition(restrictedcolumndefinition);
		criteria2 = session.createCriteria(LabelColumnDefinition.class);
		criteria2.add(Restrictions.idEq(labelColumnDefinitionInt));
		LabelColumnDefinition labelcolumndefinition = (LabelColumnDefinition) criteria2.uniqueResult();
		variableChoise.setLabelColumnDefinition(labelcolumndefinition);
		criteria2 = session.createCriteria(OptionColumnDefinition.class);
		criteria2.add(Restrictions.idEq(optionColumnDefinitionInt));
		OptionColumnDefinition optioncolumndefinition = (OptionColumnDefinition) criteria2.uniqueResult();
		variableChoise.setOptionColumnDefinition(optioncolumndefinition);

		session.saveOrUpdate(variableChoise);
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostVariableChoiseDetail.do", variableChoise.getId().toString(),"success=true");
		return null;

		
	}
	
	
}