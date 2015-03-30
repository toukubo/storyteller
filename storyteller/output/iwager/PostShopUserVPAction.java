package net.iwager.web.app;

import net.iwager.model.*;
import net.iwager.beans.*;

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


public class PostShopUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ShopUser shopUser = new ShopUserImpl();
		ShopUserForm shopUserform = (ShopUserForm) form;

                String error = "";


                		Integer shopInt = shopUserform.getShop();
		shopUserform.setShop(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(shopUserform.getId() == null || shopUserform.getId().intValue() == 0){
			shopUser.setId(null);
			shopUserform.setId(null);
		}else{
			shopUser.setId(shopUserform.getId());
			Criteria criteria = session.createCriteria(ShopUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			shopUser = (ShopUser) criteria.uniqueResult();

		}
                		shopUser.setPassword(shopUserform.getPassword());
		shopUser.setCostperhour(shopUserform.getCostperhour());
		shopUser.setCostperhourforovertime(shopUserform.getCostperhourforovertime());
		shopUser.setCostperhourforholliday(shopUserform.getCostperhourforholliday());
		shopUser.setCostperhourformidngith(shopUserform.getCostperhourformidngith());
		shopUser.setPhonenum(shopUserform.getPhonenum());
		shopUser.setCode(shopUserform.getCode());
		shopUser.setSex(shopUserform.getSex());
		shopUser.setFamilyname(shopUserform.getFamilyname());
		shopUser.setRoi(shopUserform.getRoi());
		shopUser.setNetincome(shopUserform.getNetincome());
		shopUser.setMail(shopUserform.getMail());
		shopUser.setAccount(shopUserform.getAccount());
		shopUser.setIcalurl(shopUserform.getIcalurl());
		shopUser.setIcalurlusing(shopUserform.isIcalurlusing());
		shopUser.setC2talkaccount(shopUserform.getC2talkaccount());
		shopUser.setC2talkpassword(shopUserform.getC2talkpassword());
		shopUser.setMonthlybasesalary(shopUserform.getMonthlybasesalary());
		shopUser.setFixedsalary(shopUserform.isFixedsalary());
		shopUser.setCurrenttransitbase(shopUserform.getCurrenttransitbase());
		shopUser.setWorkhours(shopUserform.getWorkhours());
		shopUser.setStarthour(shopUserform.getStarthour());
		shopUser.setRemoved(shopUserform.isRemoved());
		shopUser.setName(shopUserform.getName());
		shopUser.setFlag(shopUserform.getFlag());
		shopUser.setDate(shopUserform.getDate());
		shopUser.setAddress(shopUserform.getAddress());


		
		StringFullfiller.fullfil(shopUser);
                		Criteria criteria2 = session.createCriteria(Shop.class);
		criteria2.add(Restrictions.idEq(shopInt));
		Shop shop = (Shop) criteria2.uniqueResult();
		shopUser.setShop(shop);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(shopUser);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostShopUserDetail.do", shopUser.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ShopUsers.do", shopUser.getId().toString());
		return null;

		
	}
	
	
}