package net.djbi.web.app;

import net.djbi.model.*;
import net.djbi.beans.*;

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


public class CompanysAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="CompanysAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Company.class);
                
		req.setAttribute("companys",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Company company = (Company) iter.next();
//			vector.add(company);
//		}
		Company company = new CompanyImpl();
		CompanyForm companyform = new CompanyForm();
		criteria = session.createCriteria(Company.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			company = (Company) criteria.uniqueResult();
			new CopyProperties(company,companyform);
		} else if(req.getAttribute("form")!=null){
                        companyform = (CompanyForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(companyform.getId()));
			company = (Company) criteria.uniqueResult();
		}
		

		req.setAttribute("model",company);
		req.setAttribute("form",companyform);
		
		
//</snippet>

                   

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportCompanysAction csvExportCompanysAction 
//                               = new CsvExportCompanysAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}