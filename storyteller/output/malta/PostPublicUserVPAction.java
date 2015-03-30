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


public class PostPublicUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		PublicUser publicUser = new PublicUserImpl();
		PublicUserForm publicUserform = (PublicUserForm) form;

                String error = "";
if(StringUtils.isBlank(publicuserform.getName())){
   error += "名前は空にはできません。<br />"; 
}

if(StringUtils.isBlank(publicuserform.getKana())){
   error += "カナは空にはできません。<br />"; 
}

if(StringUtils.isBlank(publicuserform.getZipthree())){
   error += "郵便番号3桁は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("zipthree"))){
    error += "郵便番号3桁には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(publicuserform.getZipfour())){
   error += "郵便番号4桁は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("zipfour"))){
    error += "郵便番号4桁には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(publicuserform.getMail())){
   error += "メールは空にはできません。<br />"; 
}

if(StringUtils.isBlank(publicuserform.getAddress())){
   error += "アドレスは空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("fax"))){
    error += "faxには数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(publicuserform.getPhone())){
   error += "電話番号は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("phone"))){
    error += "電話番号には数値のみを入れてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",publicUserform);
	return mapping.findForward("error");
}


                		Integer prefectureInt = publicUserform.getPrefecture();
		publicUserform.setPrefecture(null);
		Integer giftCardInt = publicUserform.getGiftCard();
		publicUserform.setGiftCard(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(publicUserform.getId() == null || publicUserform.getId().intValue() == 0){
			publicUser.setId(null);
			publicUserform.setId(null);
		}else{
			publicUser.setId(publicUserform.getId());
			Criteria criteria = session.createCriteria(PublicUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			publicUser = (PublicUser) criteria.uniqueResult();

		}
                		publicUser.setName(publicUserform.getName());
		publicUser.setKana(publicUserform.getKana());
		publicUser.setZipthree(publicUserform.getZipthree());
		publicUser.setZipfour(publicUserform.getZipfour());
		publicUser.setMailforconfirm(publicUserform.getMailforconfirm());
		publicUser.setMail(publicUserform.getMail());
		publicUser.setAddress(publicUserform.getAddress());
		publicUser.setBuildingname(publicUserform.getBuildingname());
		publicUser.setRegisted(publicUserform.isRegisted());
		publicUser.setFax(publicUserform.getFax());
		publicUser.setPhone(publicUserform.getPhone());
		publicUser.setHasgiftcard(publicUserform.isHasgiftcard());


		
		StringFullfiller.fullfil(publicUser);
                		Criteria criteria2 = session.createCriteria(Prefecture.class);
		criteria2.add(Restrictions.idEq(prefectureInt));
		Prefecture prefecture = (Prefecture) criteria2.uniqueResult();
		publicUser.setPrefecture(prefecture);
		criteria2 = session.createCriteria(GiftCard.class);
		criteria2.add(Restrictions.idEq(giftCardInt));
		GiftCard giftcard = (GiftCard) criteria2.uniqueResult();
		publicUser.setGiftCard(giftcard);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(publicUser);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPublicUserDetail.do", publicUser.getId().toString());
		return null;

		
	}
	
	
}