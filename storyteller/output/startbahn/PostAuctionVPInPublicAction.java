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


public class PostAuctionVPInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Auction auction = new AuctionImpl();
		AuctionForm auctionform = (AuctionForm) form;

                String error = "";


                		Integer workInt = auctionform.getWork();
		auctionform.setWork(null);
		Integer purchaseInt = auctionform.getPurchase();
		auctionform.setPurchase(null);
		Integer collectorInt = auctionform.getCollector();
		auctionform.setCollector(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(auctionform.getId() == null || auctionform.getId().intValue() == 0){
			auction.setId(null);
			auctionform.setId(null);
		}else{
			auction.setId(auctionform.getId());
			Criteria criteria = session.createCriteria(Auction.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			auction = (Auction) criteria.uniqueResult();

		}
                		auction.setDescription(auctionform.getDescription());
		auction.setDate(auctionform.getDate());


		
		StringFullfiller.fullfil(auction);
                		Criteria criteria2 = session.createCriteria(Work.class);
		criteria2.add(Restrictions.idEq(workInt));
		Work work = (Work) criteria2.uniqueResult();
		auction.setWork(work);
		criteria2 = session.createCriteria(Purchase.class);
		criteria2.add(Restrictions.idEq(purchaseInt));
		Purchase purchase = (Purchase) criteria2.uniqueResult();
		auction.setPurchase(purchase);
		criteria2 = session.createCriteria(Collector.class);
		criteria2.add(Restrictions.idEq(collectorInt));
		Collector collector = (Collector) criteria2.uniqueResult();
		auction.setCollector(collector);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(auction);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostAuctionDetail.do", auction.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Auctions.do", auction.getId().toString());
		return null;

		
	}
	
	
}