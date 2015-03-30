package net.startbahn.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.beans.*;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class PostAuctionDetailInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Auction auction = new AuctionImpl();
		AuctionForm auctionform = new AuctionForm();
		Criteria criteria = session.createCriteria(Auction.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			auction = (Auction) criteria.uniqueResult();
			new CopyProperties(auction,auctionform);
		} else if(req.getAttribute("form")!=null){
                        auctionform = (AuctionForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(auctionform.getId()));
			auction = (Auction) criteria.uniqueResult();
		}
		

		req.setAttribute("model",auction);
		req.setAttribute("form",auctionform);


                  Criteria criteriaWork= session.createCriteria(Work.class);
			req.setAttribute("Works", criteriaWork.list());

Criteria criteriaPurchase= session.createCriteria(Purchase.class);
			req.setAttribute("Purchases", criteriaPurchase.list());

Criteria criteriaCollector= session.createCriteria(Collector.class);
			req.setAttribute("Collectors", criteriaCollector.list());

 
		
		return mapping.findForward("success");
	}
	
	
}