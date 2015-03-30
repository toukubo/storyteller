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


public class PostContractDetailVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ContractDetail contractDetail = new ContractDetailImpl();
		ContractDetailForm contractDetailform = (ContractDetailForm) form;

                String error = "";
if(StringUtils.isBlank(contractdetailform.getNarrator())){
   error += "出演者は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("price"))){
    error += "金額には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(contractdetailform.getPrice())){
   error += "金額は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("tax"))){
    error += "消費税には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(contractdetailform.getTax())){
   error += "消費税は空にはできません。<br />"; 
}

if(StringUtils.isBlank(contractdetailform.getTotal())){
   error += "合計は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("total"))){
    error += "合計には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(contractdetailform.getMemo())){
   error += "メモは空にはできません。<br />"; 
}

if(StringUtils.isBlank(contractdetailform.getTitle())){
   error += "タイトルは空にはできません。<br />"; 
}

if(StringUtils.isBlank(contractdetailform.getAppearancedate())){
   error += "出演日は空にはできません。<br />"; 
}

if(!contractdetailform.isappearancedateIsValid()){
   error += "出演日 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",contractDetailform);
	return mapping.findForward("error");
}


                		Integer narratorInt = contractDetailform.getNarrator();
		contractDetailform.setNarrator(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(contractDetailform.getId() == null || contractDetailform.getId().intValue() == 0){
			contractDetail.setId(null);
			contractDetailform.setId(null);
		}else{
			contractDetail.setId(contractDetailform.getId());
			Criteria criteria = session.createCriteria(ContractDetail.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			contractDetail = (ContractDetail) criteria.uniqueResult();

		}
                		contractDetail.setPrice(contractDetailform.getPrice());
		contractDetail.setTax(contractDetailform.getTax());
		contractDetail.setTotal(contractDetailform.getTotal());
		contractDetail.setMemo(contractDetailform.getMemo());
		contractDetail.setTitle(contractDetailform.getTitle());
		contractDetail.setAppearancedate(contractDetailform.getAppearancedate());


		
		StringFullfiller.fullfil(contractDetail);
                		Criteria criteria2 = session.createCriteria(Narrator.class);
		criteria2.add(Restrictions.idEq(narratorInt));
		Narrator narrator = (Narrator) criteria2.uniqueResult();
		contractDetail.setNarrator(narrator);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(contractDetail);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostContractDetailDetail.do", contractDetail.getId().toString());
		return null;

		
	}
	
	
}