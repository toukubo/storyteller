package net.universe.web.app;

import net.universe.model.*;
import net.universe.beans.*;

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


public class PostContractVPForSettingRecievedAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Contract contract = new ContractImpl();
		ContractForm contractform = (ContractForm) form;

                String error = "";


                		Integer customerInt = contractform.getCustomer();
		contractform.setCustomer(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(contractform.getId() == null || contractform.getId().intValue() == 0){
			contract.setId(null);
			contractform.setId(null);
		}else{
			contract.setId(contractform.getId());
			Criteria criteria = session.createCriteria(Contract.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			contract = (Contract) criteria.uniqueResult();

		}
                		contract.setAppearancedate(contractform.getAppearancedate());
		contract.setTotalprice(contractform.getTotalprice());
		contract.setPrice(contractform.getPrice());
		contract.setTotal(contractform.getTotal());
		contract.setTax(contractform.getTax());
		contract.setProgramname(contractform.getProgramname());
		contract.setInvoiceno(contractform.getInvoiceno());
		contract.setInvoicedate(contractform.getInvoicedate());
		contract.setReceivedate(contractform.getReceivedate());
		contract.setTotalreceiveprice(contractform.getTotalreceiveprice());
		contract.setContractdate(contractform.getContractdate());
		contract.setInvoiced(contractform.isInvoiced());
		contract.setReceived(contractform.isReceived());


		
		StringFullfiller.fullfil(contract);
                		Criteria criteria2 = session.createCriteria(Customer.class);
		criteria2.add(Restrictions.idEq(customerInt));
		Customer customer = (Customer) criteria2.uniqueResult();
		contract.setCustomer(customer);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(contract);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostContractDetail.do", contract.getId().toString());
		return null;

		
	}
	
	
}