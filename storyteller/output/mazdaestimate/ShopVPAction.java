package net.mazdaestimate.web;

import net.mazdaestimate.model.*;
import net.mazdaestimate.model.crud.*;

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

public class ShopVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Shop shop = new ShopImpl();
		ShopForm shopform = (ShopForm) form;
		
                		Integer prefectureInt = shopform.getPrefecture();
		shopform.setPrefecture(null);
		Integer blockInt = shopform.getBlock();
		shopform.setBlock(null);

		
		BeanUtils.copyProperties(shop,shopform);
		StringFullfiller.fullfil(shop);
		if(shopform.getId() == null || shopform.getId().intValue() == 0){
			shop.setId(null);
		}else{
			shop.setId(shopform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
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
		
		new HTTPGetRedirection(req, res, "ShopDetail.do", shop.getId().toString());
		return null;

		
	}
	
	
}