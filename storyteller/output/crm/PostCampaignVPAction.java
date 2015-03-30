package net.crm.web.app;

import net.crm.model.*;
import net.crm.beans.*;

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


public class PostCampaignVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Campaign campaign = new CampaignImpl();
		CampaignForm campaignform = (CampaignForm) form;

                String error = "";


                		Integer mailmagInt = campaignform.getMailmag();
		campaignform.setMailmag(null);
		Integer intraUserInt = campaignform.getIntraUser();
		campaignform.setIntraUser(null);
		Integer campaignTypeInt = campaignform.getCampaignType();
		campaignform.setCampaignType(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(campaignform.getId() == null || campaignform.getId().intValue() == 0){
			campaign.setId(null);
			campaignform.setId(null);
		}else{
			campaign.setId(campaignform.getId());
			Criteria criteria = session.createCriteria(Campaign.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			campaign = (Campaign) criteria.uniqueResult();

		}
                		campaign.setCode(campaignform.getCode());
		campaign.setRoi(campaignform.getRoi());
		campaign.setName(campaignform.getName());
		campaign.setDate(campaignform.getDate());


		
		StringFullfiller.fullfil(campaign);
                		Criteria criteria2 = session.createCriteria(Mailmag.class);
		criteria2.add(Restrictions.idEq(mailmagInt));
		Mailmag mailmag = (Mailmag) criteria2.uniqueResult();
		campaign.setMailmag(mailmag);
		criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		campaign.setIntraUser(intrauser);
		criteria2 = session.createCriteria(CampaignType.class);
		criteria2.add(Restrictions.idEq(campaignTypeInt));
		CampaignType campaigntype = (CampaignType) criteria2.uniqueResult();
		campaign.setCampaignType(campaigntype);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(campaign);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCampaignDetail.do", campaign.getId().toString());
		return null;

		
	}
	
	
}