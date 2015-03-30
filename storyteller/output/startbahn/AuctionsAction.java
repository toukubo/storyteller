package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class AuctionsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Auction.class);
                
		if(StringUtils.isNotBlank(req.getParameter("work"))) {
			Criteria criteria2 = session.createCriteria(Work.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("work"))));
			Work work = (Work) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("work", work));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("purchase"))) {
			Criteria criteria2 = session.createCriteria(Purchase.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("purchase"))));
			Purchase purchase = (Purchase) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("purchase", purchase));
		}
 

		if(StringUtils.isNotBlank(req.getParameter("collector"))) {
			Criteria criteria2 = session.createCriteria(Collector.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("collector"))));
			Collector collector = (Collector) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("collector", collector));
		}
 

		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("auctions",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Auction auction = (Auction) iter.next();
//			vector.add(auction);
//		}
		Auction auction = new AuctionImpl();
		AuctionForm auctionform = new AuctionForm();
		criteria = session.createCriteria(Auction.class);


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

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}