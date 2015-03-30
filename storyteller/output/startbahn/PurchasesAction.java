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


public class PurchasesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Purchase.class);
                




if(StringUtils.isNotBlank(req.getParameter("shipped"))){   if(req.getParameter("shipped").equals("true")){
      criteria.add(Restrictions.eq("shipped",true));
   }else{
      criteria.add(Restrictions.eq("shipped",false));
   }
}

		if(StringUtils.isNotBlank(req.getParameter("collector"))) {
			Criteria criteria2 = session.createCriteria(Collector.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("collector"))));
			Collector collector = (Collector) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("collector", collector));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("auction"))) {
			Criteria criteria2 = session.createCriteria(Auction.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("auction"))));
			Auction auction = (Auction) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("auction", auction));
		}
 

		req.setAttribute("purchases",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Purchase purchase = (Purchase) iter.next();
//			vector.add(purchase);
//		}
		Purchase purchase = new PurchaseImpl();
		PurchaseForm purchaseform = new PurchaseForm();
		criteria = session.createCriteria(Purchase.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			purchase = (Purchase) criteria.uniqueResult();
			new CopyProperties(purchase,purchaseform);
		} else if(req.getAttribute("form")!=null){
                        purchaseform = (PurchaseForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(purchaseform.getId()));
			purchase = (Purchase) criteria.uniqueResult();
		}
		

		req.setAttribute("model",purchase);
		req.setAttribute("form",purchaseform);
		
		


                  Criteria criteriaCollector= session.createCriteria(Collector.class);
			req.setAttribute("Collectors", criteriaCollector.list());

Criteria criteriaAuction= session.createCriteria(Auction.class);
			req.setAttribute("Auctions", criteriaAuction.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}