package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class AjaxDisplayStorytellerRolesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(StorytellerRole.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			StorytellerRole storytellerRole = (StorytellerRole) iter.next();
			vector.add(storytellerRole);
		}
		StorytellerRole storytellerRole = new StorytellerRoleImpl();
		StorytellerRoleForm storytellerRoleform = new StorytellerRoleForm();
		criteria = session.createCriteria(StorytellerRole.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			storytellerRole = (StorytellerRole) criteria.uniqueResult();
			new CopyProperties(storytellerRole,storytellerRoleform);
		} else if(req.getAttribute("form")!=null){
                        storytellerRoleform = (StorytellerRoleForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(storytellerRoleform.getId()));
			storytellerRole = (StorytellerRole) criteria.uniqueResult();
		}
		

		req.setAttribute("model",storytellerRole);
		req.setAttribute("form",storytellerRoleform);
		
		
		req.setAttribute("storytellerRoles",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}