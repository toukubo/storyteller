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


public class PostCampaignTypeDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		CampaignType campaignType = new CampaignTypeImpl();
		CampaignTypeForm campaignTypeform = new CampaignTypeForm();
		Criteria criteria = session.createCriteria(CampaignType.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			campaignType = (CampaignType) criteria.uniqueResult();
			new CopyProperties(campaignType,campaignTypeform);
		} else if(req.getAttribute("form")!=null){
                        campaignTypeform = (CampaignTypeForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(campaignTypeform.getId()));
			campaignType = (CampaignType) criteria.uniqueResult();
		}
		

		req.setAttribute("model",campaignType);
		req.setAttribute("form",campaignTypeform);


                   
		
		return mapping.findForward("success");
	}
	
	
}