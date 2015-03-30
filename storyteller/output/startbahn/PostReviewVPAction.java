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


public class PostReviewVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Review review = new ReviewImpl();
		ReviewForm reviewform = (ReviewForm) form;

                String error = "";
if(StringUtils.isBlank(reviewform.getWork())){
   error += "作品は空にはできません。<br />"; 
}

if(StringUtils.isBlank(reviewform.getTitle())){
   error += "タイトルは空にはできません。<br />"; 
}

if(!reviewform.isdateIsValid()){
   error += "日付 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",reviewform);
	return mapping.findForward("error");
}


                		Integer workInt = reviewform.getWork();
		reviewform.setWork(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(reviewform.getId() == null || reviewform.getId().intValue() == 0){
			review.setId(null);
			reviewform.setId(null);
		}else{
			review.setId(reviewform.getId());
			Criteria criteria = session.createCriteria(Review.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			review = (Review) criteria.uniqueResult();

		}
                		review.setTitle(reviewform.getTitle());
		review.setDate(reviewform.getDate());


		
		StringFullfiller.fullfil(review);
                		Criteria criteria2 = session.createCriteria(Work.class);
		criteria2.add(Restrictions.idEq(workInt));
		Work work = (Work) criteria2.uniqueResult();
		review.setWork(work);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(review);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostReviewDetail.do", review.getId().toString());
		return null;

		
	}
	
	
}