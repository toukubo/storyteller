package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class ReviewListAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Review.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Review review = (Review) iter.next();
			vector.add(review);
		}
		Review review = new ReviewImpl();
		ReviewForm reviewform = new ReviewForm();
		criteria = session.createCriteria(Review.class);


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
		
		
		req.setAttribute("reviews",vector);
		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}