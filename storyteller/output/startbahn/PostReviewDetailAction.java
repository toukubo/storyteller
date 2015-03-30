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


public class PostReviewDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Review review = new ReviewImpl();
		ReviewForm reviewform = new ReviewForm();
		Criteria criteria = session.createCriteria(Review.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			review = (Review) criteria.uniqueResult();
			new CopyProperties(review,reviewform);
		} else if(req.getAttribute("form")!=null){
                        reviewform = (ReviewForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(reviewform.getId()));
			review = (Review) criteria.uniqueResult();
		}
		

		req.setAttribute("model",review);
		req.setAttribute("form",reviewform);


                  Criteria criteriaWork= session.createCriteria(Work.class);
			req.setAttribute("Works", criteriaWork.list());

 
		
		return mapping.findForward("success");
	}
	
	
}