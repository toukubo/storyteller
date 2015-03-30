package net.exbase.web.app;

import net.exbase.model.*;
import net.exbase.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class ExcelsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="ExcelsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Excel.class);
                
		req.setAttribute("excels",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Excel excel = (Excel) iter.next();
//			vector.add(excel);
//		}
		Excel excel = new ExcelImpl();
		ExcelForm excelform = new ExcelForm();
		criteria = session.createCriteria(Excel.class);


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
		
		
//</snippet>

                  Criteria criteriaExcelTemplate= session.createCriteria(ExcelTemplate.class);
			req.setAttribute("ExcelTemplates", criteriaExcelTemplate.list());

Criteria criteriaActivity= session.createCriteria(Activity.class);
			req.setAttribute("Activitys", criteriaActivity.list());

 

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportExcelsAction csvExportExcelsAction 
//                               = new CsvExportExcelsAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}