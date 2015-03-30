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


public class PostContractVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Contract contract = new ContractImpl();
		ContractForm contractform = (ContractForm) form;

                String error = "";
if(StringUtils.isBlank(contractform.getProgramname())){
   error += "番組名は空にはできません。<br />"; 
}

if(StringUtils.isBlank(contractform.getInvoiceno())){
   error += "請求ナンバーは空にはできません。<br />"; 
}

if(!contractform.isinvoicedateIsValid()){
   error += "請求日 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isBlank(contractform.getInvoicedate())){
   error += "請求日は空にはできません。<br />"; 
}

if(!contractform.isreceivedateIsValid()){
   error += "入金日 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isBlank(contractform.getReceivedate())){
   error += "入金日は空にはできません。<br />"; 
}

if(!contractform.iscontractdateIsValid()){
   error += "契約日 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isBlank(contractform.getContractdate())){
   error += "契約日は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("price"))){
    error += "金額には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("total"))){
    error += "合計請求額には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("tax"))){
    error += "消費税には数値のみを入れてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",contractform);
	return mapping.findForward("error");
}


                
		
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
                		contract.setProgramname(contractform.getProgramname());
		contract.setInvoiceno(contractform.getInvoiceno());
		contract.setInvoicedate(contractform.getInvoicedate());
		contract.setReceivedate(contractform.getReceivedate());
		contract.setContractdate(contractform.getContractdate());
		contract.setPrice(contractform.getPrice());
		contract.setTotal(contractform.getTotal());
		contract.setTax(contractform.getTax());


		
		StringFullfiller.fullfil(contract);
                

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