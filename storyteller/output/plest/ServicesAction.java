package net.plest.web.app;

import net.plest.model.*;
import net.plest.beans.*;

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


public class ServicesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="ServicesAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Service.class);
                
		req.setAttribute("services",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Service service = (Service) iter.next();
//			vector.add(service);
//		}
		Service service = new ServiceImpl();
		ServiceForm serviceform = new ServiceForm();
		criteria = session.createCriteria(Service.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			service = (Service) criteria.uniqueResult();
			new CopyProperties(service,serviceform);
		} else if(req.getAttribute("form")!=null){
                        serviceform = (ServiceForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(serviceform.getId()));
			service = (Service) criteria.uniqueResult();
		}
		

		req.setAttribute("model",service);
		req.setAttribute("form",serviceform);
		
		
//</snippet>

                   

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportServicesAction csvExportServicesAction 
//                               = new CsvExportServicesAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}