package net.mailmag.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mailmag.model.*;
import net.mailmag.beans.*;


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


public class PostSubscriptionDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Subscription subscription = new SubscriptionImpl();
		SubscriptionForm subscriptionform = new SubscriptionForm();
		Criteria criteria = session.createCriteria(Subscription.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			subscription = (Subscription) criteria.uniqueResult();
			new CopyProperties(subscription,subscriptionform);
		} else if(req.getAttribute("form")!=null){
                        subscriptionform = (SubscriptionForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(subscriptionform.getId()));
			subscription = (Subscription) criteria.uniqueResult();
		}
		

		req.setAttribute("model",subscription);
		req.setAttribute("form",subscriptionform);


                  Criteria criteriaSite= session.createCriteria(Site.class);
			req.setAttribute("Sites", criteriaSite.list());

Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

 
		
		return mapping.findForward("success");
	}
	
	
}