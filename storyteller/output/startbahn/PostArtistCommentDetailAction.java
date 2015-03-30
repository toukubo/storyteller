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


public class PostArtistCommentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ArtistComment artistComment = new ArtistCommentImpl();
		ArtistCommentForm artistCommentform = new ArtistCommentForm();
		Criteria criteria = session.createCriteria(ArtistComment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			artistComment = (ArtistComment) criteria.uniqueResult();
			new CopyProperties(artistComment,artistCommentform);
		} else if(req.getAttribute("form")!=null){
                        artistCommentform = (ArtistCommentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(artistCommentform.getId()));
			artistComment = (ArtistComment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",artistComment);
		req.setAttribute("form",artistCommentform);


                  Criteria criteriaArtistThread= session.createCriteria(ArtistThread.class);
			req.setAttribute("ArtistThreads", criteriaArtistThread.list());

 
		
		return mapping.findForward("success");
	}
	
	
}