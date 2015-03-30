package net.mazdaestimate.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mazdaestimate.model.*;
import net.mazdaestimate.model.crud.*;


import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;


import net.enclosing.util.HibernateSession;

public class CopyAShopFromAShopAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Shop.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Shop shop = (Shop) criteria.uniqueResult();
		Shop shop2 = new ShopImpl();
		BeanUtils.copyProperties(shop2,shop);
                shop2.setId(null);
		//shop2.setSomething(null);
		session.saveOrUpdate(shop2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", shop2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}