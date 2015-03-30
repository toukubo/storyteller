package net.crm.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.crm.model.*;
import net.crm.beans.*;


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


public class PostCampaignDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Campaign campaign = new CampaignImpl();
		CampaignForm campaignform = new CampaignForm();
		Criteria criteria = session.createCriteria(Campaign.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			campaign = (Campaign) criteria.uniqueResult();
			new CopyProperties(campaign,campaignform);
		} else if(req.getAttribute("form")!=null){
                        campaignform = (CampaignForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(campaignform.getId()));
			campaign = (Campaign) criteria.uniqueResult();
		}
		

		req.setAttribute("model",campaign);
		req.setAttribute("form",campaignform);


                  Criteria criteriaMailmag= session.createCriteria(Mailmag.class);
			req.setAttribute("Mailmags", criteriaMailmag.list());

Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaCampaignType= session.createCriteria(CampaignType.class);
			req.setAttribute("CampaignTypes", criteriaCampaignType.list());

 
		
		return mapping.findForward("success");
	}
	
	
}