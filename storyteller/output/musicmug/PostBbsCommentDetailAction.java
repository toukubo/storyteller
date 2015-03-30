package net.musicmug.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.musicmug.model.*;
import net.musicmug.beans.*;


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


public class PostBbsCommentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		BbsComment bbsComment = new BbsCommentImpl();
		BbsCommentForm bbsCommentform = new BbsCommentForm();
		Criteria criteria = session.createCriteria(BbsComment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			bbsComment = (BbsComment) criteria.uniqueResult();
			new CopyProperties(bbsComment,bbsCommentform);
		} else if(req.getAttribute("form")!=null){
                        bbsCommentform = (BbsCommentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(bbsCommentform.getId()));
			bbsComment = (BbsComment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",bbsComment);
		req.setAttribute("form",bbsCommentform);


                  Criteria criteriaBbsThread= session.createCriteria(BbsThread.class);
			req.setAttribute("BbsThreads", criteriaBbsThread.list());

 
		
		return mapping.findForward("success");
	}
	
	
}