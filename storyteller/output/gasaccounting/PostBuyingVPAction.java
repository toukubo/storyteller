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


public class PostBuyingVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Buying buying = new BuyingImpl();
		BuyingForm buyingform = (BuyingForm) form;

                String error = "";


                		Integer intraUserInt = buyingform.getIntraUser();
		buyingform.setIntraUser(null);
		Integer jobInt = buyingform.getJob();
		buyingform.setJob(null);
		Integer accountTitleInt = buyingform.getAccountTitle();
		buyingform.setAccountTitle(null);
		Integer organizationInt = buyingform.getOrganization();
		buyingform.setOrganization(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(buyingform.getId() == null || buyingform.getId().intValue() == 0){
			buying.setId(null);
			buyingform.setId(null);
		}else{
			buying.setId(buyingform.getId());
			Criteria criteria = session.createCriteria(Buying.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			buying = (Buying) criteria.uniqueResult();

		}
                		buying.setDeliverydate(buyingform.getDeliverydate());
		buying.setOrderdate(buyingform.getOrderdate());
		buying.setDepartment(buyingform.getDepartment());
		buying.setSupplyinginf(buyingform.getSupplyinginf());
		buying.setPurchaseorderno(buyingform.getPurchaseorderno());
		buying.setPaymentmethods(buyingform.getPaymentmethods());
		buying.setPaymentdate(buyingform.getPaymentdate());
		buying.setPretaxamount(buyingform.getPretaxamount());
		buying.setHandpickedamount(buyingform.getHandpickedamount());
		buying.setPaymentamount(buyingform.getPaymentamount());
		buying.setPurchasingcontent(buyingform.getPurchasingcontent());
		buying.setLedgeracccode(buyingform.getLedgeracccode());
		buying.setAccountname(buyingform.getAccountname());
		buying.setQty(buyingform.getQty());
		buying.setBids(buyingform.getBids());
		buying.setTaxamount(buyingform.getTaxamount());
		buying.setConsumptiontax(buyingform.getConsumptiontax());
		buying.setRemark(buyingform.getRemark());
		buying.setSupplierinf(buyingform.getSupplierinf());


		
		StringFullfiller.fullfil(buying);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		buying.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Job.class);
		criteria2.add(Restrictions.idEq(jobInt));
		Job job = (Job) criteria2.uniqueResult();
		buying.setJob(job);
		criteria2 = session.createCriteria(AccountTitle.class);
		criteria2.add(Restrictions.idEq(accountTitleInt));
		AccountTitle accounttitle = (AccountTitle) criteria2.uniqueResult();
		buying.setAccountTitle(accounttitle);
		criteria2 = session.createCriteria(Organization.class);
		criteria2.add(Restrictions.idEq(organizationInt));
		Organization organization = (Organization) criteria2.uniqueResult();
		buying.setOrganization(organization);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(buying);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBuyingDetail.do", buying.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Buyings.do", buying.getId().toString());
		return null;

		
	}
	
	
}