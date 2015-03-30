package net.gasbooknet.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;


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


public class PostBrandDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Brand brand = new BrandImpl();
		BrandForm brandform = new BrandForm();
		Criteria criteria = session.createCriteria(Brand.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			brand = (Brand) criteria.uniqueResult();
			new CopyProperties(brand,brandform);
		} else if(req.getAttribute("form")!=null){
                        brandform = (BrandForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(brandform.getId()));
			brand = (Brand) criteria.uniqueResult();
		}
		

		req.setAttribute("model",brand);
		req.setAttribute("form",brandform);


                   
		
		return mapping.findForward("success");
	}
	
	
}