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


public class PostNarratorVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Narrator narrator = new NarratorImpl();
		NarratorForm narratorform = (NarratorForm) form;

                String error = "";
if(StringUtils.isBlank(narratorform.getMail())){
   error += "メールは空にはできません。<br />"; 
}

        if(!productform.getTypename().matches("[a-zA-Z0-9&/-]*")){
      	   error += "メールは半角英数字及び記号(/&-)のみです。";
        }

        if(!productform.getTypename().matches("[a-zA-Z0-9&/-]*")){
      	   error += "電話番号は半角英数字及び記号(/&-)のみです。";
        }

if(StringUtils.isBlank(narratorform.getPhone())){
   error += "電話番号は空にはできません。<br />"; 
}

if(StringUtils.isBlank(narratorform.getMobilephone())){
   error += "携帯電話番号は空にはできません。<br />"; 
}

        if(!productform.getTypename().matches("[a-zA-Z0-9&/-]*")){
      	   error += "携帯電話番号は半角英数字及び記号(/&-)のみです。";
        }

if(StringUtils.isBlank(narratorform.getPaymentbank())){
   error += "入金先銀行は空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",narratorform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(narratorform.getId() == null || narratorform.getId().intValue() == 0){
			narrator.setId(null);
			narratorform.setId(null);
		}else{
			narrator.setId(narratorform.getId());
			Criteria criteria = session.createCriteria(Narrator.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			narrator = (Narrator) criteria.uniqueResult();

		}
                		narrator.setMail(narratorform.getMail());
		narrator.setZipfour(narratorform.getZipfour());
		narrator.setZipthree(narratorform.getZipthree());
		narrator.setPhone(narratorform.getPhone());
		narrator.setPrice(narratorform.getPrice());
		narrator.setMale(narratorform.isMale());
		narrator.setMobilephone(narratorform.getMobilephone());
		narrator.setContractfee(narratorform.getContractfee());
		narrator.setPaywithtax(narratorform.isPaywithtax());
		narrator.setManagementfee(narratorform.getManagementfee());
		narrator.setKana(narratorform.getKana());
		narrator.setMemo(narratorform.getMemo());
		narrator.setPaymentbank(narratorform.getPaymentbank());
		narrator.setCorporation(narratorform.isCorporation());
		narrator.setName(narratorform.getName());
		narrator.setAddress(narratorform.getAddress());
		narrator.setDeleted(narratorform.isDeleted());


		
		StringFullfiller.fullfil(narrator);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(narrator);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostNarratorDetail.do", narrator.getId().toString());
		return null;

		
	}
	
	
}