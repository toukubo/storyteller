package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class PostBusinessCostVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		BusinessCost businessCost = new BusinessCostImpl();
		BusinessCostForm businessCostform = (BusinessCostForm) form;

                String error = "";


                		Integer j2eeStoryInt = businessCostform.getJ2eeStory();
		businessCostform.setJ2eeStory(null);
		Integer intraUserInt = businessCostform.getIntraUser();
		businessCostform.setIntraUser(null);
//		Integer roleInt = businessCostform.getRole();
//		businessCostform.setRole(null);
		Integer storytellerRoleInt = businessCostform.getStorytellerRole();
		businessCostform.setStorytellerRole(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(businessCostform.getId() == null || businessCostform.getId().intValue() == 0){
			businessCost.setId(null);
			businessCostform.setId(null);
		}else{
			businessCost.setId(businessCostform.getId());
			Criteria criteria = session.createCriteria(BusinessCost.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			businessCost = (BusinessCost) criteria.uniqueResult();

		}
                		businessCost.setCostperhour(businessCostform.getCostperhour());
		businessCost.setValue(businessCostform.getValue());
		businessCost.setHour(businessCostform.getHour());


		
		StringFullfiller.fullfil(businessCost);
                		Criteria criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(j2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		businessCost.setJ2eeStory(j2eestory);
		criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		businessCost.setIntraUser(intrauser);
		criteria2 = session.createCriteria(StorytellerRole.class);
		criteria2.add(Restrictions.idEq(storytellerRoleInt));
		StorytellerRole storytellerrole = (StorytellerRole) criteria2.uniqueResult();
		businessCost.setStorytellerRole(storytellerrole);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(businessCost);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBusinessCostDetail.do", businessCost.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "AjaxDisplayBusinessCosts.do", null);
		return null;

		
	}
	
	
}