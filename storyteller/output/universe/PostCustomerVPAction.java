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


public class PostCustomerVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Customer customer = new CustomerImpl();
		CustomerForm customerform = (CustomerForm) form;

                String error = "";
if(StringUtils.isBlank(customerform.getMail())){
   error += "メールは空にはできません。<br />"; 
}

if(StringUtils.isBlank(customerform.getKana())){
   error += "担当者名前(カナ)は空にはできません。<br />"; 
}

        if(!customerform.getPhone().matches("\p{Alnum}*")){
   error += "電話番号は半角英数字のみです。";
}
if(StringUtils.isBlank(customerform.getPhone())){
   error += "電話番号は空にはできません。<br />"; 
}

if(StringUtils.isBlank(customerform.getCode())){
   error += "顧客コードは空にはできません。<br />"; 
}

if(StringUtils.isBlank(customerform.getMobilephone())){
   error += "携帯電話番号は空にはできません。<br />"; 
}

if(StringUtils.isBlank(customerform.getCategory())){
   error += "顧客分類は空にはできません。<br />"; 
}

if(StringUtils.isBlank(customerform.getMemo())){
   error += "メモは空にはできません。<br />"; 
}

if(StringUtils.isBlank(customerform.getDealingsbank())){
   error += "取引銀行は空にはできません。<br />"; 
}

if(!customerform.isstartupdateIsValid()){
   error += "取引開始日 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isBlank(customerform.getStartupdate())){
   error += "取引開始日は空にはできません。<br />"; 
}

if(!customerform.isstartupdateIsValid()){
   error += "取引開始日 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isBlank(customerform.getCompany())){
   error += "会社名は空にはできません。<br />"; 
}

if(StringUtils.isBlank(customerform.getContracts())){
   error += "契約は空にはできません。<br />"; 
}

if(StringUtils.isBlank(customerform.getOfficialposition())){
   error += "担当者役職は空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",customerform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(customerform.getId() == null || customerform.getId().intValue() == 0){
			customer.setId(null);
			customerform.setId(null);
		}else{
			customer.setId(customerform.getId());
			Criteria criteria = session.createCriteria(Customer.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			customer = (Customer) criteria.uniqueResult();

		}
                		customer.setMail(customerform.getMail());
		customer.setKana(customerform.getKana());
		customer.setPhone(customerform.getPhone());
		customer.setCode(customerform.getCode());
		customer.setMobilephone(customerform.getMobilephone());
		customer.setCategory(customerform.getCategory());
		customer.setAddresno(customerform.getAddresno());
		customer.setMemo(customerform.getMemo());
		customer.setDealingsbank(customerform.getDealingsbank());
		customer.setStartupdate(customerform.getStartupdate());
		customer.setCompany(customerform.getCompany());
		customer.setOfficialposition(customerform.getOfficialposition());
		customer.setName(customerform.getName());
		customer.setPrintout(customerform.isPrintout());
		customer.setDeleted(customerform.isDeleted());


		
		StringFullfiller.fullfil(customer);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(customer);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCustomerDetail.do", customer.getId().toString());
		return null;

		
	}
	
	
}