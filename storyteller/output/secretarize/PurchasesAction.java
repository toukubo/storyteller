package net.secretarize.web.app;

import net.secretarize.model.*;
import net.secretarize.beans.*;

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
                
		if(StringUtils.isNotBlank(req.getParameter("publicUser"))) {
			Criteria criteria2 = session.createCriteria(PublicUser.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("publicUser"))));
			PublicUser publicUser = (PublicUser) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("publicUser", publicUser));
		}
 


if(StringUtils.isNotBlank(req.getParameter("shipped"))){   if(req.getParameter("shipped").equals("true")){
      criteria.add(Restrictions.eq("shipped",true));
   }else{
      criteria.add(Restrictions.eq("shipped",false));
   }
}


if(StringUtils.isNotBlank(req.getParameter("invoiced"))){   if(req.getParameter("invoiced").equals("true")){
      criteria.add(Restrictions.eq("invoiced",true));
   }else{
      criteria.add(Restrictions.eq("invoiced",false));
   }
}

if(StringUtils.isNotBlank(req.getParameter("paid"))){   if(req.getParameter("paid").equals("true")){
      criteria.add(Restrictions.eq("paid",true));
   }else{
      criteria.add(Restrictions.eq("paid",false));
   }
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
		
		


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}