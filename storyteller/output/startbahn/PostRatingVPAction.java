package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostRatingVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Rating rating = new RatingImpl();
		RatingForm ratingform = (RatingForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(ratingform.getId() == null || ratingform.getId().intValue() == 0){
			rating.setId(null);
			ratingform.setId(null);
		}else{
			rating.setId(ratingform.getId());
			Criteria criteria = session.createCriteria(Rating.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			rating = (Rating) criteria.uniqueResult();

		}
                		rating.setMarkmodel(ratingform.getMarkmodel());
		rating.setMarkeemodel(ratingform.getMarkeemodel());
		rating.setMarkerid(ratingform.getMarkerid());
		rating.setMakeeid(ratingform.getMakeeid());
		rating.setThumbup(ratingform.isThumbup());


		
		StringFullfiller.fullfil(rating);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(rating);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostRatingDetail.do", rating.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Ratings.do", rating.getId().toString());
		return null;

		
	}
	
	
}