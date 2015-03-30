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


public class PostTableDefinitionDetailForColumnsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		TableDefinition tableDefinition = new TableDefinitionImpl();
		TableDefinitionForm tableDefinitionform = new TableDefinitionForm();
		Criteria criteria = session.createCriteria(TableDefinition.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			tableDefinition = (TableDefinition) criteria.uniqueResult();
			new CopyProperties(tableDefinition,tableDefinitionform);
		} else if(req.getAttribute("form")!=null){
                        tableDefinitionform = (TableDefinitionForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(tableDefinitionform.getId()));
			tableDefinition = (TableDefinition) criteria.uniqueResult();
		}
		

		req.setAttribute("model",tableDefinition);
		req.setAttribute("form",tableDefinitionform);


                  Criteria criteriaExcelTemplate= session.createCriteria(ExcelTemplate.class);
			req.setAttribute("ExcelTemplates", criteriaExcelTemplate.list());

 
		
		return mapping.findForward("success");
	}
	
	
}