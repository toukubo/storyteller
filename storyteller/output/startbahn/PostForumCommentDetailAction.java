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


public class PostForumCommentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ForumComment forumComment = new ForumCommentImpl();
		ForumCommentForm forumCommentform = new ForumCommentForm();
		Criteria criteria = session.createCriteria(ForumComment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			forumComment = (ForumComment) criteria.uniqueResult();
			new CopyProperties(forumComment,forumCommentform);
		} else if(req.getAttribute("form")!=null){
                        forumCommentform = (ForumCommentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(forumCommentform.getId()));
			forumComment = (ForumComment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",forumComment);
		req.setAttribute("form",forumCommentform);


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

Criteria criteriaForumTopic= session.createCriteria(ForumTopic.class);
			req.setAttribute("ForumTopics", criteriaForumTopic.list());

 
		
		return mapping.findForward("success");
	}
	
	
}