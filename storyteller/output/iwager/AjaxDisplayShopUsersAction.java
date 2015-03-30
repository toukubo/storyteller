package net.iwager.web.app;

import net.iwager.model.*;
import net.iwager.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class AjaxDisplayShopUsersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ShopUser.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			ShopUser shopUser = (ShopUser) iter.next();
			vector.add(shopUser);
		}
		ShopUser shopUser = new ShopUserImpl();
		ShopUserForm shopUserform = new ShopUserForm();
		criteria = session.createCriteria(ShopUser.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			shopUser = (ShopUser) criteria.uniqueResult();
			new CopyProperties(shopUser,shopUserform);
		} else if(req.getAttribute("form")!=null){
                        shopUserform = (ShopUserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(shopUserform.getId()));
			shopUser = (ShopUser) criteria.uniqueResult();
		}
		

		req.setAttribute("model",shopUser);
		req.setAttribute("form",shopUserform);
		
		
		req.setAttribute("shopUsers",vector);


                  Criteria criteriaShop= session.createCriteria(Shop.class);
			req.setAttribute("Shops", criteriaShop.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}