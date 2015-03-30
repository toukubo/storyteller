package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

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


public class PostTicketPurchaseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		TicketPurchase ticketPurchase = new TicketPurchaseImpl();
		TicketPurchaseForm ticketPurchaseform = (TicketPurchaseForm) form;

                String error = "";


                		Integer publicUserInt = ticketPurchaseform.getPublicUser();
		ticketPurchaseform.setPublicUser(null);
		Integer liveInt = ticketPurchaseform.getLive();
		ticketPurchaseform.setLive(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(ticketPurchaseform.getId() == null || ticketPurchaseform.getId().intValue() == 0){
			ticketPurchase.setId(null);
			ticketPurchaseform.setId(null);
		}else{
			ticketPurchase.setId(ticketPurchaseform.getId());
			Criteria criteria = session.createCriteria(TicketPurchase.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			ticketPurchase = (TicketPurchase) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(ticketPurchase);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		ticketPurchase.setPublicUser(publicuser);
		criteria2 = session.createCriteria(Live.class);
		criteria2.add(Restrictions.idEq(liveInt));
		Live live = (Live) criteria2.uniqueResult();
		ticketPurchase.setLive(live);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(ticketPurchase);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTicketPurchaseDetail.do", ticketPurchase.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "TicketPurchases.do", ticketPurchase.getId().toString());
		return null;

		
	}
	
	
}