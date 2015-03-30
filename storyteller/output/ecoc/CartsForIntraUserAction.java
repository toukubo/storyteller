package net.ecoc.web.app;

import net.ecoc.model.*;
import net.ecoc.beans.*;

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


public class CartsForIntraUserAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Cart.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Cart cart = (Cart) iter.next();
			vector.add(cart);
		}
		Cart cart = new CartImpl();
		CartForm cartform = new CartForm();
		criteria = session.createCriteria(Cart.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			cart = (Cart) criteria.uniqueResult();
			new CopyProperties(cart,cartform);
		} else if(req.getAttribute("form")!=null){
                        cartform = (CartForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(cartform.getId()));
			cart = (Cart) criteria.uniqueResult();
		}
		

		req.setAttribute("model",cart);
		req.setAttribute("form",cartform);
		
		
		req.setAttribute("carts",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}