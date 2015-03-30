package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

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
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostCompanyOfCreditVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CompanyOfCredit companyOfCredit = new CompanyOfCreditImpl();
		CompanyOfCreditForm companyOfCreditform = (CompanyOfCreditForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(companyOfCreditform.getId() == null || companyOfCreditform.getId().intValue() == 0){
			companyOfCredit.setId(null);
			companyOfCreditform.setId(null);
		}else{
			companyOfCredit.setId(companyOfCreditform.getId());
			Criteria criteria = session.createCriteria(CompanyOfCredit.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			companyOfCredit = (CompanyOfCredit) criteria.uniqueResult();

		}
                		companyOfCredit.setName(companyOfCreditform.getName());


		
		StringFullfiller.fullfil(companyOfCredit);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(companyOfCredit);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCompanyOfCreditDetail.do", companyOfCredit.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "CompanyOfCredits.do", companyOfCredit.getId().toString());
		return null;

		
	}
	
	
}