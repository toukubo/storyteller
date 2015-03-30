package net.mazdaestimate.web.app;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;

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


public class PostShopVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Shop shop = new ShopImpl();
		ShopForm shopform = (ShopForm) form;

                String error = "";


                		Integer prefectureInt = shopform.getPrefecture();
		shopform.setPrefecture(null);
		Integer blockInt = shopform.getBlock();
		shopform.setBlock(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(shopform.getId() == null || shopform.getId().intValue() == 0){
			shop.setId(null);
			shopform.setId(null);
		}else{
			shop.setId(shopform.getId());
			Criteria criteria = session.createCriteria(Shop.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			shop = (Shop) criteria.uniqueResult();

		}
                		shop.setPassword(shopform.getPassword());
		shop.setAccount(shopform.getAccount());
		shop.setFamilyname(shopform.getFamilyname());
		shop.setFirstname(shopform.getFirstname());


		
		StringFullfiller.fullfil(shop);
                		Criteria criteria2 = session.createCriteria(Prefecture.class);
		criteria2.add(Restrictions.idEq(prefectureInt));
		Prefecture prefecture = (Prefecture) criteria2.uniqueResult();
		shop.setPrefecture(prefecture);
		criteria2 = session.createCriteria(Block.class);
		criteria2.add(Restrictions.idEq(blockInt));
		Block block = (Block) criteria2.uniqueResult();
		shop.setBlock(block);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(shop);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostShopDetail.do", shop.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Shops.do", shop.getId().toString());
		return null;

		
	}
	
	
}