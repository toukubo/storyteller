package net.realize.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.realize.model.*;
import net.realize.beans.*;


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


public class PostAffiliateDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Affiliate affiliate = new AffiliateImpl();
		AffiliateForm affiliateform = new AffiliateForm();
		Criteria criteria = session.createCriteria(Affiliate.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			affiliate = (Affiliate) criteria.uniqueResult();
			new CopyProperties(affiliate,affiliateform);
		} else if(req.getAttribute("form")!=null){
                        affiliateform = (AffiliateForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(affiliateform.getId()));
			affiliate = (Affiliate) criteria.uniqueResult();
		}
		

		req.setAttribute("model",affiliate);
		req.setAttribute("form",affiliateform);


                   
		
		return mapping.findForward("success");
	}
	
	
}