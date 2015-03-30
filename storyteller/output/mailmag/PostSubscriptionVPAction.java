package net.mailmag.web.app;

import net.mailmag.model.*;
import net.mailmag.beans.*;

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


public class PostSubscriptionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Subscription subscription = new SubscriptionImpl();
		SubscriptionForm subscriptionform = (SubscriptionForm) form;

                String error = "";


                		Integer siteInt = subscriptionform.getSite();
		subscriptionform.setSite(null);
		Integer publicUserInt = subscriptionform.getPublicUser();
		subscriptionform.setPublicUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(subscriptionform.getId() == null || subscriptionform.getId().intValue() == 0){
			subscription.setId(null);
			subscriptionform.setId(null);
		}else{
			subscription.setId(subscriptionform.getId());
			Criteria criteria = session.createCriteria(Subscription.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			subscription = (Subscription) criteria.uniqueResult();

		}
                		subscription.setDate(subscriptionform.getDate());


		
		StringFullfiller.fullfil(subscription);
                		Criteria criteria2 = session.createCriteria(Site.class);
		criteria2.add(Restrictions.idEq(siteInt));
		Site site = (Site) criteria2.uniqueResult();
		subscription.setSite(site);
		criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		subscription.setPublicUser(publicuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(subscription);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostSubscriptionDetail.do", subscription.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Subscriptions.do", subscription.getId().toString());
		return null;

		
	}
	
	
}