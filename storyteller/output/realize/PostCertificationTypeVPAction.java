package net.realize.web.app;

import net.realize.model.*;
import net.realize.beans.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class PostCertificationTypeVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CertificationType certificationType = new CertificationTypeImpl();
		CertificationTypeForm certificationTypeform = (CertificationTypeForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(certificationTypeform.getId() == null || certificationTypeform.getId().intValue() == 0){
			certificationType.setId(null);
			certificationTypeform.setId(null);
		}else{
			certificationType.setId(certificationTypeform.getId());
			Criteria criteria = session.createCriteria(CertificationType.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			certificationType = (CertificationType) criteria.uniqueResult();

		}
                		certificationType.setName(certificationTypeform.getName());


		
		StringFullfiller.fullfil(certificationType);
                
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(certificationType);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCertificationTypeDetail.do", certificationType.getId().toString(),"success=true");
		return null;

		
	}
	
	
}