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


public class PostInvoiceVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Invoice invoice = new InvoiceImpl();
		InvoiceForm invoiceform = (InvoiceForm) form;

                String error = "";


                		Integer intraUserInt = invoiceform.getIntraUser();
		invoiceform.setIntraUser(null);
		Integer jobInt = invoiceform.getJob();
		invoiceform.setJob(null);
		Integer organizationInt = invoiceform.getOrganization();
		invoiceform.setOrganization(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(invoiceform.getId() == null || invoiceform.getId().intValue() == 0){
			invoice.setId(null);
			invoiceform.setId(null);
		}else{
			invoice.setId(invoiceform.getId());
			Criteria criteria = session.createCriteria(Invoice.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			invoice = (Invoice) criteria.uniqueResult();

		}
                		invoice.setCurrency(invoiceform.getCurrency());
		invoice.setTotal(invoiceform.getTotal());
		invoice.setProductname(invoiceform.getProductname());
		invoice.setCost(invoiceform.getCost());
		invoice.setPayment(invoiceform.getPayment());
		invoice.setQty(invoiceform.getQty());
		invoice.setRemark(invoiceform.getRemark());
		invoice.setCode(invoiceform.getCode());
		invoice.setSubject(invoiceform.getSubject());
		invoice.setBillingdate(invoiceform.getBillingdate());
		invoice.setDuedate(invoiceform.getDuedate());
		invoice.setTaxbeforecharges(invoiceform.getTaxbeforecharges());
		invoice.setTotconsumptiontax(invoiceform.getTotconsumptiontax());
		invoice.setMargin(invoiceform.getMargin());
		invoice.setMarginrate(invoiceform.getMarginrate());
		invoice.setPartno(invoiceform.getPartno());
		invoice.setPurchaseprice(invoiceform.getPurchaseprice());
		invoice.setOverseas(invoiceform.getOverseas());
		invoice.setRate(invoiceform.getRate());
		invoice.setRetailprice(invoiceform.getRetailprice());
		invoice.setWholesaleprice(invoiceform.getWholesaleprice());
		invoice.setSalestax(invoiceform.getSalestax());
		invoice.setTax(invoiceform.getTax());
		invoice.setTaxinternorextern(invoiceform.getTaxinternorextern());
		invoice.setPretaxsales(invoiceform.getPretaxsales());
		invoice.setRackrate(invoiceform.getRackrate());
		invoice.setInfotransfer(invoiceform.getInfotransfer());


		
		StringFullfiller.fullfil(invoice);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		invoice.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Job.class);
		criteria2.add(Restrictions.idEq(jobInt));
		Job job = (Job) criteria2.uniqueResult();
		invoice.setJob(job);
		criteria2 = session.createCriteria(Organization.class);
		criteria2.add(Restrictions.idEq(organizationInt));
		Organization organization = (Organization) criteria2.uniqueResult();
		invoice.setOrganization(organization);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(invoice);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostInvoiceDetail.do", invoice.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Invoices.do", invoice.getId().toString());
		return null;

		
	}
	
	
}