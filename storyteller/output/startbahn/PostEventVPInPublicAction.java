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


public class PostEventVPInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Event event = new EventImpl();
		EventForm eventform = (EventForm) form;

                String error = "";
if(StringUtils.isBlank(eventform.getStartdate())){
   error += "開始日時は空にはできません。<br />"; 
}

if(!eventform.isstartdateIsValid()){
   error += "開始日時 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isBlank(eventform.getName())){
   error += "名前は空にはできません。<br />"; 
}

if(StringUtils.isBlank(eventform.getEnddate())){
   error += "終了日時は空にはできません。<br />"; 
}

if(!eventform.isenddateIsValid()){
   error += "終了日時 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isBlank(eventform.getAuction())){
   error += "は空にはできません。<br />"; 
}

if(StringUtils.isBlank(eventform.getAuction())){
   error += "は空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",eventform);
	return mapping.findForward("error");
}


                		Integer auctionInt = eventform.getAuction();
		eventform.setAuction(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(eventform.getId() == null || eventform.getId().intValue() == 0){
			event.setId(null);
			eventform.setId(null);
		}else{
			event.setId(eventform.getId());
			Criteria criteria = session.createCriteria(Event.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			event = (Event) criteria.uniqueResult();

		}
                		event.setStartdate(eventform.getStartdate());
		event.setName(eventform.getName());
		event.setEnddate(eventform.getEnddate());
		event.setRelatedwithauction(eventform.isRelatedwithauction());


		
		StringFullfiller.fullfil(event);
                		Criteria criteria2 = session.createCriteria(Auction.class);
		criteria2.add(Restrictions.idEq(auctionInt));
		Auction auction = (Auction) criteria2.uniqueResult();
		event.setAuction(auction);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(event);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostEventDetail.do", event.getId().toString());
		return null;

		
	}
	
	
}