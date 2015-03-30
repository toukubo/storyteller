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


public class PostExcelTemplateVPForSettingPretruncateAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExcelTemplate excelTemplate = new ExcelTemplateImpl();
		ExcelTemplateForm excelTemplateform = (ExcelTemplateForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",excelTemplateform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(excelTemplateform.getId() == null || excelTemplateform.getId().intValue() == 0){
			excelTemplate.setId(null);
			excelTemplateform.setId(null);
		}else{
			excelTemplate.setId(excelTemplateform.getId());
			Criteria criteria = session.createCriteria(ExcelTemplate.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			excelTemplate = (ExcelTemplate) criteria.uniqueResult();

		}
                		excelTemplate.setPretruncate(excelTemplateform.isPretruncate());


		
		StringFullfiller.fullfil(excelTemplate);
                
		session.saveOrUpdate(excelTemplate);
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostExcelTemplateDetail.do", excelTemplate.getId().toString(),"success=true");
		return null;

		
	}
	
	
}