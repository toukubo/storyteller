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


public class ShopsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Shop.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Shop shop = (Shop) iter.next();
			vector.add(shop);
		}
		Shop shop = new ShopImpl();
		ShopForm shopform = new ShopForm();
		criteria = session.createCriteria(Shop.class);


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
		
		
		req.setAttribute("shops",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}