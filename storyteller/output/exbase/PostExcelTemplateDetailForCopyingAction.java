package net.exbase.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.exbase.model.*;
import net.exbase.beans.*;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class PostExcelTemplateDetailForCopyingAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ExcelTemplate excelTemplate = new ExcelTemplateImpl();
		ExcelTemplateForm excelTemplateform = new ExcelTemplateForm();
		Criteria criteria = session.createCriteria(ExcelTemplate.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			excelTemplate = (ExcelTemplate) criteria.uniqueResult();
			new CopyProperties(excelTemplate,excelTemplateform);
		} else if(req.getAttribute("form")!=null){
                        excelTemplateform = (ExcelTemplateForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(excelTemplateform.getId()));
			excelTemplate = (ExcelTemplate) criteria.uniqueResult();
		}
		

		req.setAttribute("model",excelTemplate);
		req.setAttribute("form",excelTemplateform);


                  Criteria criteriaCategory= session.createCriteria(Category.class);
			req.setAttribute("Categorys", criteriaCategory.list());

Criteria criteriaAttachment= session.createCriteria(Attachment.class);
			req.setAttribute("Attachments", criteriaAttachment.list());

 
		
		return mapping.findForward("success");
	}
	
	
}