package net.malta.web.app;

import net.malta.model.*;
import net.malta.beans.*;

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


public class PostDeliveryAddressVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		DeliveryAddress deliveryAddress = new DeliveryAddressImpl();
		DeliveryAddressForm deliveryAddressform = (DeliveryAddressForm) form;

                String error = "";
if(StringUtils.isBlank(deliveryaddressform.getName())){
   error += "名前は空にはできません。<br />"; 
}

if(StringUtils.isBlank(deliveryaddressform.getKana())){
   error += "カナは空にはできません。<br />"; 
}

if(StringUtils.isBlank(deliveryaddressform.getZipthree())){
   error += "郵便番号3桁は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("zipthree"))){
    error += "郵便番号3桁には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(deliveryaddressform.getZipfour())){
   error += "郵便番号4桁は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("zipfour"))){
    error += "郵便番号4桁には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(deliveryaddressform.getPref())){
   error += "県は空にはできません。<br />"; 
}

if(StringUtils.isBlank(deliveryaddressform.getPhone())){
   error += "電話番号は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("phone"))){
    error += "電話番号には数値のみを入れてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",deliveryAddressform);
	return mapping.findForward("error");
}


                		Integer publicUserInt = deliveryAddressform.getPublicUser();
		deliveryAddressform.setPublicUser(null);
		Integer giftCardInt = deliveryAddressform.getGiftCard();
		deliveryAddressform.setGiftCard(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(deliveryAddressform.getId() == null || deliveryAddressform.getId().intValue() == 0){
			deliveryAddress.setId(null);
			deliveryAddressform.setId(null);
		}else{
			deliveryAddress.setId(deliveryAddressform.getId());
			Criteria criteria = session.createCriteria(DeliveryAddress.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			deliveryAddress = (DeliveryAddress) criteria.uniqueResult();

		}
                		deliveryAddress.setName(deliveryAddressform.getName());
		deliveryAddress.setKana(deliveryAddressform.getKana());
		deliveryAddress.setZipthree(deliveryAddressform.getZipthree());
		deliveryAddress.setZipfour(deliveryAddressform.getZipfour());
		deliveryAddress.setPref(deliveryAddressform.getPref());
		deliveryAddress.setBuildingname(deliveryAddressform.getBuildingname());
		deliveryAddress.setPhone(deliveryAddressform.getPhone());
		deliveryAddress.setPreferreddate(deliveryAddressform.getPreferreddate());
		deliveryAddress.setPreferredtime(deliveryAddressform.getPreferredtime());
		deliveryAddress.setHasgiftcard(deliveryAddressform.isHasgiftcard());
		deliveryAddress.setAddress(deliveryAddressform.getAddress());


		
		StringFullfiller.fullfil(deliveryAddress);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		deliveryAddress.setPublicUser(publicuser);
		criteria2 = session.createCriteria(GiftCard.class);
		criteria2.add(Restrictions.idEq(giftCardInt));
		GiftCard giftcard = (GiftCard) criteria2.uniqueResult();
		deliveryAddress.setGiftCard(giftcard);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(deliveryAddress);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostDeliveryAddressDetail.do", deliveryAddress.getId().toString());
		return null;

		
	}
	
	
}