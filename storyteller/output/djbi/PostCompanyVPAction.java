package net.djbi.web.app;

import net.djbi.model.*;
import net.djbi.beans.*;

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


public class PostCompanyVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Company company = new CompanyImpl();
		CompanyForm companyform = (CompanyForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(companyform.getId() == null || companyform.getId().intValue() == 0){
			company.setId(null);
			companyform.setId(null);
		}else{
			company.setId(companyform.getId());
			Criteria criteria = session.createCriteria(Company.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			company = (Company) criteria.uniqueResult();

		}
                		company.setName(companyform.getName());
		company.setCode(companyform.getCode());


		
		StringFullfiller.fullfil(company);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(company);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCompanyDetail.do", company.getId().toString());
		return null;

		
	}
	
	
}