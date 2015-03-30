package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class CompanyOfCreditsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(CompanyOfCredit.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			CompanyOfCredit companyOfCredit = (CompanyOfCredit) iter.next();
			vector.add(companyOfCredit);
		}
		CompanyOfCredit companyOfCredit = new CompanyOfCreditImpl();
		CompanyOfCreditForm companyOfCreditform = new CompanyOfCreditForm();
		criteria = session.createCriteria(CompanyOfCredit.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			companyOfCredit = (CompanyOfCredit) criteria.uniqueResult();
			new CopyProperties(companyOfCredit,companyOfCreditform);
		} else if(req.getAttribute("form")!=null){
                        companyOfCreditform = (CompanyOfCreditForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(companyOfCreditform.getId()));
			companyOfCredit = (CompanyOfCredit) criteria.uniqueResult();
		}
		

		req.setAttribute("model",companyOfCredit);
		req.setAttribute("form",companyOfCreditform);
		
		
		req.setAttribute("companyOfCredits",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}