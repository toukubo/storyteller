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


public class PostVariableChoiseDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		VariableChoise variableChoise = new VariableChoiseImpl();
		VariableChoiseForm variableChoiseform = new VariableChoiseForm();
		Criteria criteria = session.createCriteria(VariableChoise.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			variableChoise = (VariableChoise) criteria.uniqueResult();
			new CopyProperties(variableChoise,variableChoiseform);
		} else if(req.getAttribute("form")!=null){
                        variableChoiseform = (VariableChoiseForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(variableChoiseform.getId()));
			variableChoise = (VariableChoise) criteria.uniqueResult();
		}
		

		req.setAttribute("model",variableChoise);
		req.setAttribute("form",variableChoiseform);


                  Criteria criteriaExcelTemplate= session.createCriteria(ExcelTemplate.class);
			req.setAttribute("ExcelTemplates", criteriaExcelTemplate.list());

 
		
		return mapping.findForward("success");
	}
	
	
}