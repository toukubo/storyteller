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


public class PostUpdateKeyChoiseDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		UpdateKeyChoise updateKeyChoise = new UpdateKeyChoiseImpl();
		UpdateKeyChoiseForm updateKeyChoiseform = new UpdateKeyChoiseForm();
		Criteria criteria = session.createCriteria(UpdateKeyChoise.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			updateKeyChoise = (UpdateKeyChoise) criteria.uniqueResult();
			new CopyProperties(updateKeyChoise,updateKeyChoiseform);
		} else if(req.getAttribute("form")!=null){
                        updateKeyChoiseform = (UpdateKeyChoiseForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(updateKeyChoiseform.getId()));
			updateKeyChoise = (UpdateKeyChoise) criteria.uniqueResult();
		}
		

		req.setAttribute("model",updateKeyChoise);
		req.setAttribute("form",updateKeyChoiseform);


                  Criteria criteriaExcelTemplate= session.createCriteria(ExcelTemplate.class);
			req.setAttribute("ExcelTemplates", criteriaExcelTemplate.list());

Criteria criteriaColumnDefinition= session.createCriteria(ColumnDefinition.class);
			req.setAttribute("ColumnDefinitions", criteriaColumnDefinition.list());

 
		
		return mapping.findForward("success");
	}
	
	
}