package net.startbahn.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.beans.*;


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


public class PostRatingDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Rating rating = new RatingImpl();
		RatingForm ratingform = new RatingForm();
		Criteria criteria = session.createCriteria(Rating.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			rating = (Rating) criteria.uniqueResult();
			new CopyProperties(rating,ratingform);
		} else if(req.getAttribute("form")!=null){
                        ratingform = (RatingForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(ratingform.getId()));
			rating = (Rating) criteria.uniqueResult();
		}
		

		req.setAttribute("model",rating);
		req.setAttribute("form",ratingform);


                   
		
		return mapping.findForward("success");
	}
	
	
}