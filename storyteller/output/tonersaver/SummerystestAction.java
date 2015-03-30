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


public class SummerystestAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="SummerystestAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Summery.class);
                
		req.setAttribute("summerys",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Summery summery = (Summery) iter.next();
//			vector.add(summery);
//		}
		Summery summery = new SummeryImpl();
		SummeryForm summeryform = new SummeryForm();
		criteria = session.createCriteria(Summery.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			summery = (Summery) criteria.uniqueResult();
			new CopyProperties(summery,summeryform);
		} else if(req.getAttribute("form")!=null){
                        summeryform = (SummeryForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(summeryform.getId()));
			summery = (Summery) criteria.uniqueResult();
		}
		

		req.setAttribute("model",summery);
		req.setAttribute("form",summeryform);
		
		
//</snippet>

                  Criteria criteriaUser= session.createCriteria(User.class);
			req.setAttribute("Users", criteriaUser.list());

Criteria criteriaDepartment= session.createCriteria(Department.class);
			req.setAttribute("Departments", criteriaDepartment.list());

 

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportSummerystestAction csvExportSummerystestAction 
//                               = new CsvExportSummerystestAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}