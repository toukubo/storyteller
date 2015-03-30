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


public class PostCampaignTypeVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CampaignType campaignType = new CampaignTypeImpl();
		CampaignTypeForm campaignTypeform = (CampaignTypeForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(campaignTypeform.getId() == null || campaignTypeform.getId().intValue() == 0){
			campaignType.setId(null);
			campaignTypeform.setId(null);
		}else{
			campaignType.setId(campaignTypeform.getId());
			Criteria criteria = session.createCriteria(CampaignType.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			campaignType = (CampaignType) criteria.uniqueResult();

		}
                		campaignType.setName(campaignTypeform.getName());


		
		StringFullfiller.fullfil(campaignType);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(campaignType);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCampaignTypeDetail.do", campaignType.getId().toString());
		return null;

		
	}
	
	
}