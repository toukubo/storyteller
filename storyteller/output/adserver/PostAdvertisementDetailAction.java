package net.adserver.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.adserver.model.*;
import net.adserver.beans.*;


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


public class PostAdvertisementDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Advertisement advertisement = new AdvertisementImpl();
		AdvertisementForm advertisementform = new AdvertisementForm();
		Criteria criteria = session.createCriteria(Advertisement.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			advertisement = (Advertisement) criteria.uniqueResult();
			new CopyProperties(advertisement,advertisementform);
		} else if(req.getAttribute("form")!=null){
                        advertisementform = (AdvertisementForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(advertisementform.getId()));
			advertisement = (Advertisement) criteria.uniqueResult();
		}
		

		req.setAttribute("model",advertisement);
		req.setAttribute("form",advertisementform);


                   
		
		return mapping.findForward("success");
	}
	
	
}