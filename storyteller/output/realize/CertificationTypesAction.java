package net.realize.web.app;

import net.realize.model.*;
import net.realize.beans.*;

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


public class CertificationTypesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="CertificationTypesAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(CertificationType.class);
                
		req.setAttribute("certificationTypes",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			CertificationType certificationType = (CertificationType) iter.next();
//			vector.add(certificationType);
//		}
		CertificationType certificationType = new CertificationTypeImpl();
		CertificationTypeForm certificationTypeform = new CertificationTypeForm();
		criteria = session.createCriteria(CertificationType.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			certificationType = (CertificationType) criteria.uniqueResult();
			new CopyProperties(certificationType,certificationTypeform);
		} else if(req.getAttribute("form")!=null){
                        certificationTypeform = (CertificationTypeForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(certificationTypeform.getId()));
			certificationType = (CertificationType) criteria.uniqueResult();
		}
		

		req.setAttribute("model",certificationType);
		req.setAttribute("form",certificationTypeform);
		
		
//</snippet>

                   

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportCertificationTypesAction csvExportCertificationTypesAction 
//                               = new CsvExportCertificationTypesAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}