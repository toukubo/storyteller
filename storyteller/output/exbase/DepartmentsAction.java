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


public class DepartmentsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="DepartmentsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Department.class);
                
		req.setAttribute("departments",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Department department = (Department) iter.next();
//			vector.add(department);
//		}
		Department department = new DepartmentImpl();
		DepartmentForm departmentform = new DepartmentForm();
		criteria = session.createCriteria(Department.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			department = (Department) criteria.uniqueResult();
			new CopyProperties(department,departmentform);
		} else if(req.getAttribute("form")!=null){
                        departmentform = (DepartmentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(departmentform.getId()));
			department = (Department) criteria.uniqueResult();
		}
		

		req.setAttribute("model",department);
		req.setAttribute("form",departmentform);
		
		
//</snippet>

                   

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportDepartmentsAction csvExportDepartmentsAction 
//                               = new CsvExportDepartmentsAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}