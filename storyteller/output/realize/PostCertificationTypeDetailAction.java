package net.realize.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.realize.model.*;
import net.realize.beans.*;


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


public class PostCertificationTypeDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		CertificationType certificationType = new CertificationTypeImpl();
		CertificationTypeForm certificationTypeform = new CertificationTypeForm();
		Criteria criteria = session.createCriteria(CertificationType.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			certificationType = (CertificationType) criteria.uniqueResult();
			new CopyProperties(certificationType,certificationTypeform);
		} else if(req.getAttribute("form")!=null){
                        certificationTypeform = (CertificationTypeForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(certificationTypeform.getId()));
			certificationType = (CertificationType) criteria.uniqueResult();
		}
		

		req.setAttribute("model",certificationType);
		req.setAttribute("form",certificationTypeform);


                   
		
		return mapping.findForward("success");
	}
	
	
}