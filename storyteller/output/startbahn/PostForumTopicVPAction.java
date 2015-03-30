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


public class PostForumTopicVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ForumTopic forumTopic = new ForumTopicImpl();
		ForumTopicForm forumTopicform = (ForumTopicForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(forumTopicform.getId() == null || forumTopicform.getId().intValue() == 0){
			forumTopic.setId(null);
			forumTopicform.setId(null);
		}else{
			forumTopic.setId(forumTopicform.getId());
			Criteria criteria = session.createCriteria(ForumTopic.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			forumTopic = (ForumTopic) criteria.uniqueResult();

		}
                		forumTopic.setTitle(forumTopicform.getTitle());
		forumTopic.setDescription(forumTopicform.getDescription());
		forumTopic.setDate(forumTopicform.getDate());


		
		StringFullfiller.fullfil(forumTopic);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(forumTopic);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostForumTopicDetail.do", forumTopic.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ForumTopics.do", forumTopic.getId().toString());
		return null;

		
	}
	
	
}