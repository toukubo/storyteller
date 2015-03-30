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


public class PostReviewerVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Reviewer reviewer = new ReviewerImpl();
		ReviewerForm reviewerform = (ReviewerForm) form;

                String error = "";


                		Integer publicUserInt = reviewerform.getPublicUser();
		reviewerform.setPublicUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(reviewerform.getId() == null || reviewerform.getId().intValue() == 0){
			reviewer.setId(null);
			reviewerform.setId(null);
		}else{
			reviewer.setId(reviewerform.getId());
			Criteria criteria = session.createCriteria(Reviewer.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			reviewer = (Reviewer) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(reviewer);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		reviewer.setPublicUser(publicuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(reviewer);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostReviewerDetail.do", reviewer.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Reviewers.do", reviewer.getId().toString());
		return null;

		
	}
	
	
}