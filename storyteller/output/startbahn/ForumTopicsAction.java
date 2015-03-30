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


public class ForumTopicsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ForumTopic.class);
                




		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("forumTopics",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			ForumTopic forumTopic = (ForumTopic) iter.next();
//			vector.add(forumTopic);
//		}
		ForumTopic forumTopic = new ForumTopicImpl();
		ForumTopicForm forumTopicform = new ForumTopicForm();
		criteria = session.createCriteria(ForumTopic.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			forumTopic = (ForumTopic) criteria.uniqueResult();
			new CopyProperties(forumTopic,forumTopicform);
		} else if(req.getAttribute("form")!=null){
                        forumTopicform = (ForumTopicForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(forumTopicform.getId()));
			forumTopic = (ForumTopic) criteria.uniqueResult();
		}
		

		req.setAttribute("model",forumTopic);
		req.setAttribute("form",forumTopicform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}