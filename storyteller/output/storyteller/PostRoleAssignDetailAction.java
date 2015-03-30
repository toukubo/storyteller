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


public class PostRoleAssignDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		RoleAssign roleAssign = new RoleAssignImpl();
		RoleAssignForm roleAssignform = new RoleAssignForm();
		Criteria criteria = session.createCriteria(RoleAssign.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			roleAssign = (RoleAssign) criteria.uniqueResult();
			new CopyProperties(roleAssign,roleAssignform);
		} else if(req.getAttribute("form")!=null){
                        roleAssignform = (RoleAssignForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(roleAssignform.getId()));
			roleAssign = (RoleAssign) criteria.uniqueResult();
		}
		

		req.setAttribute("model",roleAssign);
		req.setAttribute("form",roleAssignform);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaStorytellerRole= session.createCriteria(StorytellerRole.class);
			req.setAttribute("StorytellerRoles", criteriaStorytellerRole.list());

 
		
		return mapping.findForward("success");
	}
	
	
}