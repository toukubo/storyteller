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


public class PostExcelVersionDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ExcelVersion excelVersion = new ExcelVersionImpl();
		ExcelVersionForm excelVersionform = new ExcelVersionForm();
		Criteria criteria = session.createCriteria(ExcelVersion.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			excelVersion = (ExcelVersion) criteria.uniqueResult();
			new CopyProperties(excelVersion,excelVersionform);
		} else if(req.getAttribute("form")!=null){
                        excelVersionform = (ExcelVersionForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(excelVersionform.getId()));
			excelVersion = (ExcelVersion) criteria.uniqueResult();
		}
		

		req.setAttribute("model",excelVersion);
		req.setAttribute("form",excelVersionform);


                  Criteria criteriaExcel= session.createCriteria(Excel.class);
			req.setAttribute("Excels", criteriaExcel.list());

 
		
		return mapping.findForward("success");
	}
	
	
}