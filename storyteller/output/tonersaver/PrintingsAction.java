package net.tonersaver.web.app;

import net.tonersaver.model.*;
import net.tonersaver.beans.*;

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


public class PrintingsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="PrintingsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Printing.class);
                

		if(StringUtils.isNotBlank(req.getParameter("user"))) {
			Criteria criteria2 = session.createCriteria(User.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("user"))));
			User user = (User) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("user", user));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("department"))) {
			Criteria criteria2 = session.createCriteria(Department.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("department"))));
			Department department = (Department) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("department", department));
		}
 






if(StringUtils.isNotBlank(req.getParameter("oneside"))){   if(req.getParameter("oneside").equals("true")){
      criteria.add(Restrictions.eq("oneside",true));
   }else{
      criteria.add(Restrictions.eq("oneside",false));
   }
}

if(StringUtils.isNotBlank(req.getParameter("color"))){   if(req.getParameter("color").equals("true")){
      criteria.add(Restrictions.eq("color",true));
   }else{
      criteria.add(Restrictions.eq("color",false));
   }
}


		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("printings",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Printing printing = (Printing) iter.next();
//			vector.add(printing);
//		}
		Printing printing = new PrintingImpl();
		PrintingForm printingform = new PrintingForm();
		criteria = session.createCriteria(Printing.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			printing = (Printing) criteria.uniqueResult();
			new CopyProperties(printing,printingform);
		} else if(req.getAttribute("form")!=null){
                        printingform = (PrintingForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(printingform.getId()));
			printing = (Printing) criteria.uniqueResult();
		}
		

		req.setAttribute("model",printing);
		req.setAttribute("form",printingform);
		
		
//</snippet>

                  Criteria criteriaUser= session.createCriteria(User.class);
			req.setAttribute("Users", criteriaUser.list());

Criteria criteriaDepartment= session.createCriteria(Department.class);
			req.setAttribute("Departments", criteriaDepartment.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}