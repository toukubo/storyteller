package net.crm.web.app;

import net.crm.model.*;
import net.crm.beans.*;

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


public class CampaignsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Campaign.class);
                
		if(StringUtils.isNotBlank(req.getParameter("mailmag"))) {
			Criteria criteria2 = session.createCriteria(Mailmag.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("mailmag"))));
			Mailmag mailmag = (Mailmag) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("mailmag", mailmag));
		}
 


		if(StringUtils.isNotBlank(req.getParameter("intraUser"))) {
			Criteria criteria2 = session.createCriteria(IntraUser.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("intraUser"))));
			IntraUser intraUser = (IntraUser) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("intraUser", intraUser));
		}
 

		if(StringUtils.isNotBlank(req.getParameter("campaignType"))) {
			Criteria criteria2 = session.createCriteria(CampaignType.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("campaignType"))));
			CampaignType campaignType = (CampaignType) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("campaignType", campaignType));
		}
 

		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("campaigns",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Campaign campaign = (Campaign) iter.next();
//			vector.add(campaign);
//		}
		Campaign campaign = new CampaignImpl();
		CampaignForm campaignform = new CampaignForm();
		criteria = session.createCriteria(Campaign.class);


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

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}