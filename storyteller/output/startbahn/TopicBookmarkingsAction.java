package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class TopicBookmarkingsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(TopicBookmarking.class);
                
		if(StringUtils.isNotBlank(req.getParameter("publicUser"))) {
			Criteria criteria2 = session.createCriteria(PublicUser.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("publicUser"))));
			PublicUser publicUser = (PublicUser) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("publicUser", publicUser));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("forumTopic"))) {
			Criteria criteria2 = session.createCriteria(ForumTopic.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("forumTopic"))));
			ForumTopic forumTopic = (ForumTopic) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("forumTopic", forumTopic));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("topicBookmarkings",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			TopicBookmarking topicBookmarking = (TopicBookmarking) iter.next();
//			vector.add(topicBookmarking);
//		}
		TopicBookmarking topicBookmarking = new TopicBookmarkingImpl();
		TopicBookmarkingForm topicBookmarkingform = new TopicBookmarkingForm();
		criteria = session.createCriteria(TopicBookmarking.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			topicBookmarking = (TopicBookmarking) criteria.uniqueResult();
			new CopyProperties(topicBookmarking,topicBookmarkingform);
		} else if(req.getAttribute("form")!=null){
                        topicBookmarkingform = (TopicBookmarkingForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(topicBookmarkingform.getId()));
			topicBookmarking = (TopicBookmarking) criteria.uniqueResult();
		}
		

		req.setAttribute("model",topicBookmarking);
		req.setAttribute("form",topicBookmarkingform);
		
		


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

Criteria criteriaForumTopic= session.createCriteria(ForumTopic.class);
			req.setAttribute("ForumTopics", criteriaForumTopic.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}