package net.tonersaver.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.tonersaver.model.*;
import net.tonersaver.beans.*;


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


public class PostPolicyPrinterDetailForModificationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		PolicyPrinter policyPrinter = new PolicyPrinterImpl();
		PolicyPrinterForm policyPrinterform = new PolicyPrinterForm();
		Criteria criteria = session.createCriteria(PolicyPrinter.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			policyPrinter = (PolicyPrinter) criteria.uniqueResult();
			new CopyProperties(policyPrinter,policyPrinterform);
		} else if(req.getAttribute("form")!=null){
                        policyPrinterform = (PolicyPrinterForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(policyPrinterform.getId()));
			policyPrinter = (PolicyPrinter) criteria.uniqueResult();
		}
		

		req.setAttribute("model",policyPrinter);
		req.setAttribute("form",policyPrinterform);


                  Criteria criteriaPolicy= session.createCriteria(Policy.class);
			req.setAttribute("Policys", criteriaPolicy.list());

 
		
		return mapping.findForward("success");
	}
	
	
}