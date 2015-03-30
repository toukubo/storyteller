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


public class PostBettingVPInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Betting betting = new BettingImpl();
		BettingForm bettingform = (BettingForm) form;

                String error = "";


                		Integer collectorInt = bettingform.getCollector();
		bettingform.setCollector(null);
		Integer auctionInt = bettingform.getAuction();
		bettingform.setAuction(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(bettingform.getId() == null || bettingform.getId().intValue() == 0){
			betting.setId(null);
			bettingform.setId(null);
		}else{
			betting.setId(bettingform.getId());
			Criteria criteria = session.createCriteria(Betting.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			betting = (Betting) criteria.uniqueResult();

		}
                		betting.setPrice(bettingform.getPrice());


		
		StringFullfiller.fullfil(betting);
                		Criteria criteria2 = session.createCriteria(Collector.class);
		criteria2.add(Restrictions.idEq(collectorInt));
		Collector collector = (Collector) criteria2.uniqueResult();
		betting.setCollector(collector);
		criteria2 = session.createCriteria(Auction.class);
		criteria2.add(Restrictions.idEq(auctionInt));
		Auction auction = (Auction) criteria2.uniqueResult();
		betting.setAuction(auction);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(betting);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBettingDetail.do", betting.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Bettings.do", betting.getId().toString());
		return null;

		
	}
	
	
}