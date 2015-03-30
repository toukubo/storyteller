package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostPurchaseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Purchase purchase = new PurchaseImpl();
		PurchaseForm purchaseform = (PurchaseForm) form;

                String error = "";


                		Integer collectorInt = purchaseform.getCollector();
		purchaseform.setCollector(null);
		Integer auctionInt = purchaseform.getAuction();
		purchaseform.setAuction(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(purchaseform.getId() == null || purchaseform.getId().intValue() == 0){
			purchase.setId(null);
			purchaseform.setId(null);
		}else{
			purchase.setId(purchaseform.getId());
			Criteria criteria = session.createCriteria(Purchase.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			purchase = (Purchase) criteria.uniqueResult();

		}
                		purchase.setTotal(purchaseform.getTotal());
		purchase.setCarriage(purchaseform.getCarriage());
		purchase.setSubtotal(purchaseform.getSubtotal());
		purchase.setTotalordernum(purchaseform.getTotalordernum());
		purchase.setShipped(purchaseform.isShipped());


		
		StringFullfiller.fullfil(purchase);
                		Criteria criteria2 = session.createCriteria(Collector.class);
		criteria2.add(Restrictions.idEq(collectorInt));
		Collector collector = (Collector) criteria2.uniqueResult();
		purchase.setCollector(collector);
		criteria2 = session.createCriteria(Auction.class);
		criteria2.add(Restrictions.idEq(auctionInt));
		Auction auction = (Auction) criteria2.uniqueResult();
		purchase.setAuction(auction);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(purchase);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostPurchaseDetail.do", purchase.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Purchases.do", purchase.getId().toString());
		return null;

		
	}
	
	
}