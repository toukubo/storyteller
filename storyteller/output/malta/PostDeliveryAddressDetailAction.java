package net.malta.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.malta.model.*;
import net.malta.beans.*;


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


public class PostDeliveryAddressDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		DeliveryAddress deliveryAddress = new DeliveryAddressImpl();
		DeliveryAddressForm deliveryAddressform = new DeliveryAddressForm();
		Criteria criteria = session.createCriteria(DeliveryAddress.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			deliveryAddress = (DeliveryAddress) criteria.uniqueResult();
			new CopyProperties(deliveryAddress,deliveryAddressform);
		} else if(req.getAttribute("form")!=null){
                        deliveryAddressform = (DeliveryAddressForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(deliveryAddressform.getId()));
			deliveryAddress = (DeliveryAddress) criteria.uniqueResult();
		}
		

		req.setAttribute("model",deliveryAddress);
		req.setAttribute("form",deliveryAddressform);


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

Criteria criteriaGiftCard= session.createCriteria(GiftCard.class);
			req.setAttribute("GiftCards", criteriaGiftCard.list());

 
		
		return mapping.findForward("success");
	}
	
	
}