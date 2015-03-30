package net.autolink.web.app;

import net.autolink.model.*;
import net.autolink.beans.*;

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
import org.hibernate.criterion.Restrictions;


public class PostSiteVPAboutTumblrAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Site site = new SiteImpl();
		SiteForm siteform = (SiteForm) form;

                String error = "";


                		Integer serviceInt = siteform.getService();
		siteform.setService(null);
		Integer publicUserInt = siteform.getPublicUser();
		siteform.setPublicUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(siteform.getId() == null || siteform.getId().intValue() == 0){
			site.setId(null);
			siteform.setId(null);
		}else{
			site.setId(siteform.getId());
			Criteria criteria = session.createCriteria(Site.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			site = (Site) criteria.uniqueResult();

		}
                		site.setBaseurl(siteform.getBaseurl());
		site.setXmlrpcurl(siteform.getXmlrpcurl());


		
		StringFullfiller.fullfil(site);
                		Criteria criteria2 = session.createCriteria(Service.class);
		criteria2.add(Restrictions.idEq(serviceInt));
		Service service = (Service) criteria2.uniqueResult();
		site.setService(service);
		criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		site.setPublicUser(publicuser);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(site);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostSiteDetail.do", site.getId().toString(),"success=true");
		return null;

		
	}
	
	
}