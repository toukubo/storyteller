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


public class PostForumCommentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ForumComment forumComment = new ForumCommentImpl();
		ForumCommentForm forumCommentform = (ForumCommentForm) form;

                String error = "";


                		Integer publicUserInt = forumCommentform.getPublicUser();
		forumCommentform.setPublicUser(null);
		Integer forumTopicInt = forumCommentform.getForumTopic();
		forumCommentform.setForumTopic(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(forumCommentform.getId() == null || forumCommentform.getId().intValue() == 0){
			forumComment.setId(null);
			forumCommentform.setId(null);
		}else{
			forumComment.setId(forumCommentform.getId());
			Criteria criteria = session.createCriteria(ForumComment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			forumComment = (ForumComment) criteria.uniqueResult();

		}
                		forumComment.setTitle(forumCommentform.getTitle());
		forumComment.setDescription(forumCommentform.getDescription());
		forumComment.setDate(forumCommentform.getDate());


		
		StringFullfiller.fullfil(forumComment);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		forumComment.setPublicUser(publicuser);
		criteria2 = session.createCriteria(ForumTopic.class);
		criteria2.add(Restrictions.idEq(forumTopicInt));
		ForumTopic forumtopic = (ForumTopic) criteria2.uniqueResult();
		forumComment.setForumTopic(forumtopic);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(forumComment);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostForumCommentDetail.do", forumComment.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ForumComments.do", forumComment.getId().toString());
		return null;

		
	}
	
	
}