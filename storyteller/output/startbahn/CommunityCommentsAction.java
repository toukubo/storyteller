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


public class CommunityCommentsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(CommunityComment.class);
                
		if(StringUtils.isNotBlank(req.getParameter("communityThread"))) {
			Criteria criteria2 = session.createCriteria(CommunityThread.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("communityThread"))));
			CommunityThread communityThread = (CommunityThread) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("communityThread", communityThread));
		}
 

		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("communityComments",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			CommunityComment communityComment = (CommunityComment) iter.next();
//			vector.add(communityComment);
//		}
		CommunityComment communityComment = new CommunityCommentImpl();
		CommunityCommentForm communityCommentform = new CommunityCommentForm();
		criteria = session.createCriteria(CommunityComment.class);


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

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}