package net.djbi.web.app;

import net.djbi.model.*;
import net.djbi.beans.*;

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


public class DeliveryRatePerClientsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(DeliveryRatePerClient.class);
                

		if(StringUtils.isNotBlank(req.getParameter("client"))) {
			Criteria criteria2 = session.createCriteria(Client.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("client"))));
			Client client = (Client) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("client", client));
		}
 







		if(StringUtils.isNotBlank(req.getParameter("corporation"))) {
			Criteria criteria2 = session.createCriteria(Corporation.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("corporation"))));
			Corporation corporation = (Corporation) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("corporation", corporation));
		}
 

		req.setAttribute("deliveryRatePerClients",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			DeliveryRatePerClient deliveryRatePerClient = (DeliveryRatePerClient) iter.next();
//			vector.add(deliveryRatePerClient);
//		}
		DeliveryRatePerClient deliveryRatePerClient = new DeliveryRatePerClientImpl();
		DeliveryRatePerClientForm deliveryRatePerClientform = new DeliveryRatePerClientForm();
		criteria = session.createCriteria(DeliveryRatePerClient.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			deliveryRatePerClient = (DeliveryRatePerClient) criteria.uniqueResult();
			new CopyProperties(deliveryRatePerClient,deliveryRatePerClientform);
		} else if(req.getAttribute("form")!=null){
                        deliveryRatePerClientform = (DeliveryRatePerClientForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(deliveryRatePerClientform.getId()));
			deliveryRatePerClient = (DeliveryRatePerClient) criteria.uniqueResult();
		}
		

		req.setAttribute("model",deliveryRatePerClient);
		req.setAttribute("form",deliveryRatePerClientform);
		
		


                  Criteria criteriaClient= session.createCriteria(Client.class);
			req.setAttribute("Clients", criteriaClient.list());

Criteria criteriaCorporation= session.createCriteria(Corporation.class);
			req.setAttribute("Corporations", criteriaCorporation.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}