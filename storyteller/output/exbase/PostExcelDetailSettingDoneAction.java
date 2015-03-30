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


public class PostExcelDetailSettingDoneAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Excel excel = new ExcelImpl();
		ExcelForm excelform = new ExcelForm();
		Criteria criteria = session.createCriteria(Excel.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			excel = (Excel) criteria.uniqueResult();
			new CopyProperties(excel,excelform);
		} else if(req.getAttribute("form")!=null){
                        excelform = (ExcelForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(excelform.getId()));
			excel = (Excel) criteria.uniqueResult();
		}
		

		req.setAttribute("model",excel);
		req.setAttribute("form",excelform);


                   
		
		return mapping.findForward("success");
	}
	
	
}