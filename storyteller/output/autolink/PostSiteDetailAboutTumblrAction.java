package net.autolink.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.autolink.model.*;
import net.autolink.beans.*;


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


public class PostSiteDetailAboutTumblrAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Site site = new SiteImpl();
		SiteForm siteform = new SiteForm();
		Criteria criteria = session.createCriteria(Site.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			site = (Site) criteria.uniqueResult();
			new CopyProperties(site,siteform);
		} else if(req.getAttribute("form")!=null){
                        siteform = (SiteForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(siteform.getId()));
			site = (Site) criteria.uniqueResult();
		}
		

		req.setAttribute("model",site);
		req.setAttribute("form",siteform);


                  Criteria criteriaService= session.createCriteria(Service.class);
			req.setAttribute("Services", criteriaService.list());

Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

 
		
		return mapping.findForward("success");
	}
	
	
}