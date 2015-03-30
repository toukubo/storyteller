package net.startbahn.web;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;

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

public class BettingVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Betting betting = new BettingImpl();
		BettingForm bettingform = (BettingForm) form;
		
                		Integer auctionInt = bettingform.getAuction();
		bettingform.setAuction(null);

		
		BeanUtils.copyProperties(betting,bettingform);
		StringFullfiller.fullfil(betting);
		if(bettingform.getId() == null || bettingform.getId().intValue() == 0){
			betting.setId(null);
		}else{
			betting.setId(bettingform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Auction.class);
		criteria2.add(Restrictions.idEq(auctionInt));
		Auction auction = (Auction) criteria2.uniqueResult();
		betting.setAuction(auction);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(betting);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "BettingDetail.do", betting.getId().toString());
		return null;

		
	}
	
	
}