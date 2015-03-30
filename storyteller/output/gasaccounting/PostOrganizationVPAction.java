package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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


public class PostOrganizationVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Organization organization = new OrganizationImpl();
		OrganizationForm organizationform = (OrganizationForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(organizationform.getId() == null || organizationform.getId().intValue() == 0){
			organization.setId(null);
			organizationform.setId(null);
		}else{
			organization.setId(organizationform.getId());
			Criteria criteria = session.createCriteria(Organization.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			organization = (Organization) criteria.uniqueResult();

		}
                		organization.setName(organizationform.getName());
		organization.setAddress(organizationform.getAddress());
		organization.setPhonenum(organizationform.getPhonenum());
		organization.setCompanyname(organizationform.getCompanyname());
		organization.setFurigana(organizationform.getFurigana());
		organization.setCompanyaddress(organizationform.getCompanyaddress());
		organization.setPostcode(organizationform.getPostcode());
		organization.setFaxnum(organizationform.getFaxnum());
		organization.setPresident(organizationform.getPresident());
		organization.setStorename(organizationform.getStorename());
		organization.setCreationdate(organizationform.getCreationdate());
		organization.setCapital(organizationform.getCapital());
		organization.setAnnualsales(organizationform.getAnnualsales());
		organization.setEmployeenum(organizationform.getEmployeenum());
		organization.setBusinessdesc(organizationform.getBusinessdesc());
		organization.setMajortradpartner1(organizationform.getMajortradpartner1());
		organization.setMajortradpartner2(organizationform.getMajortradpartner2());
		organization.setMajortradpartner3(organizationform.getMajortradpartner3());
		organization.setBankers(organizationform.getBankers());
		organization.setPaymentsite(organizationform.getPaymentsite());
		organization.setSupplier(organizationform.isSupplier());
		organization.setCustomer(organizationform.isCustomer());


		
		StringFullfiller.fullfil(organization);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(organization);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostOrganizationDetail.do", organization.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Organizations.do", organization.getId().toString());
		return null;

		
	}
	
	
}