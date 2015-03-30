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


public class PostCommunityCommentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		CommunityComment communityComment = new CommunityCommentImpl();
		CommunityCommentForm communityCommentform = new CommunityCommentForm();
		Criteria criteria = session.createCriteria(CommunityComment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			communityComment = (CommunityComment) criteria.uniqueResult();
			new CopyProperties(communityComment,communityCommentform);
		} else if(req.getAttribute("form")!=null){
                        communityCommentform = (CommunityCommentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(communityCommentform.getId()));
			communityComment = (CommunityComment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",communityComment);
		req.setAttribute("form",communityCommentform);


                  Criteria criteriaCommunityThread= session.createCriteria(CommunityThread.class);
			req.setAttribute("CommunityThreads", criteriaCommunityThread.list());

 
		
		return mapping.findForward("success");
	}
	
	
}