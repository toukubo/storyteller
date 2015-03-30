package net.mazdaestimate.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;


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


public class PostShopDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Shop shop = new ShopImpl();
		ShopForm shopform = new ShopForm();
		Criteria criteria = session.createCriteria(Shop.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			shop = (Shop) criteria.uniqueResult();
			new CopyProperties(shop,shopform);
		} else if(req.getAttribute("form")!=null){
                        shopform = (ShopForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(shopform.getId()));
			shop = (Shop) criteria.uniqueResult();
		}
		

		req.setAttribute("model",shop);
		req.setAttribute("form",shopform);


                  Criteria criteriaPrefecture= session.createCriteria(Prefecture.class);
			req.setAttribute("Prefectures", criteriaPrefecture.list());

Criteria criteriaBlock= session.createCriteria(Block.class);
			req.setAttribute("Blocks", criteriaBlock.list());

 
		
		return mapping.findForward("success");
	}
	
	
}