package net.mazdasalestool.web;

import net.mazdasalestool.model.*;
import net.mazdasalestool.model.crud.*;

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

public class ActionForSalesVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ActionForSales actionForSales = new ActionForSalesImpl();
		ActionForSalesForm actionForSalesform = (ActionForSalesForm) form;
		
                
		
		BeanUtils.copyProperties(actionForSales,actionForSalesform);
		StringFullfiller.fullfil(actionForSales);
		if(actionForSalesform.getId() == null || actionForSalesform.getId().intValue() == 0){
			actionForSales.setId(null);
		}else{
			actionForSales.setId(actionForSalesform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(actionForSales);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ActionForSalesDetail.do", actionForSales.getId().toString());
		return null;

		
	}
	
	
}