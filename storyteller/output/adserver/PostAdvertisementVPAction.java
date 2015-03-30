package net.adserver.web.app;

import net.adserver.model.*;
import net.adserver.beans.*;

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


public class PostAdvertisementVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Advertisement advertisement = new AdvertisementImpl();
		AdvertisementForm advertisementform = (AdvertisementForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(advertisementform.getId() == null || advertisementform.getId().intValue() == 0){
			advertisement.setId(null);
			advertisementform.setId(null);
		}else{
			advertisement.setId(advertisementform.getId());
			Criteria criteria = session.createCriteria(Advertisement.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			advertisement = (Advertisement) criteria.uniqueResult();

		}
                		advertisement.setUrl(advertisementform.getUrl());
		advertisement.setStartdate(advertisementform.getStartdate());
		advertisement.setEnddate(advertisementform.getEnddate());
		advertisement.setClientname(advertisementform.getClientname());


		
		StringFullfiller.fullfil(advertisement);
                
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(advertisement);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAdvertisementDetail.do", advertisement.getId().toString(),"success=true");
		return null;

		
	}
	
	
}