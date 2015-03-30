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


public class PostAuctionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Auction auction = new AuctionImpl();
		AuctionForm auctionform = (AuctionForm) form;

                String error = "";
if(StringUtils.isBlank(auctionform.getWork())){
   error += "作品は空にはできません。<br />"; 
}

if(StringUtils.isBlank(auctionform.getPreferedprice())){
   error += "は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("preferedprice"))){
    error += "には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(auctionform.getMinimumprice())){
   error += "は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("minimumprice"))){
    error += "には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(auctionform.getAuctionenddate())){
   error += "は空にはできません。<br />"; 
}

if(!auctionform.isauctionenddateIsValid()){
   error += " はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",auctionform);
	return mapping.findForward("error");
}


                		Integer workInt = auctionform.getWork();
		auctionform.setWork(null);

		
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
                		auction.setPreferedprice(auctionform.getPreferedprice());
		auction.setMinimumprice(auctionform.getMinimumprice());
		auction.setAuctionenddate(auctionform.getAuctionenddate());


		
		StringFullfiller.fullfil(auction);
                		Criteria criteria2 = session.createCriteria(Work.class);
		criteria2.add(Restrictions.idEq(workInt));
		Work work = (Work) criteria2.uniqueResult();
		auction.setWork(work);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(auction);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAuctionDetail.do", auction.getId().toString());
		return null;

		
	}
	
	
}