package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.beans.*;


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


public class PostBusinessCostDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		BusinessCost businessCost = new BusinessCostImpl();
		BusinessCostForm businessCostform = new BusinessCostForm();
		Criteria criteria = session.createCriteria(BusinessCost.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			businessCost = (BusinessCost) criteria.uniqueResult();
			new CopyProperties(businessCost,businessCostform);
		} else if(req.getAttribute("form")!=null){
                        businessCostform = (BusinessCostForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(businessCostform.getId()));
			businessCost = (BusinessCost) criteria.uniqueResult();
		}
		

		req.setAttribute("model",businessCost);
		req.setAttribute("form",businessCostform);


                  Criteria criteriaJ2eeStory= session.createCriteria(J2eeStory.class);
			req.setAttribute("J2eeStorys", criteriaJ2eeStory.list());

Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaRole= session.createCriteria(Role.class);
			req.setAttribute("Roles", criteriaRole.list());

Criteria criteriaStorytellerRole= session.createCriteria(StorytellerRole.class);
			req.setAttribute("StorytellerRoles", criteriaStorytellerRole.list());

 
		
		return mapping.findForward("success");
	}
	
	
}