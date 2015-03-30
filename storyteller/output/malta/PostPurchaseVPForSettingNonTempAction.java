package net.malta.web.app;

import net.malta.model.*;
import net.malta.beans.*;

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


public class PostPurchaseVPForSettingNonTempAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Purchase purchase = new PurchaseImpl();
		PurchaseForm purchaseform = (PurchaseForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",purchaseform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(purchaseform.getId() == null || purchaseform.getId().intValue() == 0){
			purchase.setId(null);
			purchaseform.setId(null);
		}else{
			purchase.setId(purchaseform.getId());
			Criteria criteria = session.createCriteria(Purchase.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			purchase = (Purchase) criteria.uniqueResult();

		}
                		purchase.setTemp(purchaseform.isTemp());


		
		StringFullfiller.fullfil(purchase);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(purchase);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPurchaseDetail.do", purchase.getId().toString());
		return null;

		
	}
	
	
}