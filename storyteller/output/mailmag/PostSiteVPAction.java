package net.mailmag.web.app;

import net.mailmag.model.*;
import net.mailmag.beans.*;

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


public class PostSiteVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Site site = new SiteImpl();
		SiteForm siteform = (SiteForm) form;

                String error = "";


                
		
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
                		site.setHeader(siteform.getHeader());
		site.setUrl(siteform.getUrl());
		site.setFooter(siteform.getFooter());
		site.setMobileurl(siteform.getMobileurl());
		site.setSpecialtemplateusing(siteform.isSpecialtemplateusing());
		site.setUserexporturl(siteform.getUserexporturl());
		site.setHash(siteform.getHash());


		
		StringFullfiller.fullfil(site);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(site);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostSiteDetail.do", site.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Sites.do", site.getId().toString());
		return null;

		
	}
	
	
}