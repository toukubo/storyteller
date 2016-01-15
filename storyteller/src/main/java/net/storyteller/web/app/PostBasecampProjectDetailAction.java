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


public class PostBasecampProjectDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		BasecampProject basecampProject = new BasecampProjectImpl();
		BasecampProjectForm basecampProjectform = new BasecampProjectForm();
		Criteria criteria = session.createCriteria(BasecampProject.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			basecampProject = (BasecampProject) criteria.uniqueResult();
			new CopyProperties(basecampProject,basecampProjectform);
		} else if(req.getAttribute("form")!=null){
                        basecampProjectform = (BasecampProjectForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(basecampProjectform.getId()));
			basecampProject = (BasecampProject) criteria.uniqueResult();
		}
		

		req.setAttribute("model",basecampProject);
		req.setAttribute("form",basecampProjectform);


                  Criteria criteriaBasecampAccount= session.createCriteria(BasecampAccount.class);
			req.setAttribute("BasecampAccounts", criteriaBasecampAccount.list());

Criteria criteriaJ2eeStory= session.createCriteria(J2eeStory.class);
			req.setAttribute("J2eeStorys", criteriaJ2eeStory.list());

 
		
		return mapping.findForward("success");
	}
	
	
}