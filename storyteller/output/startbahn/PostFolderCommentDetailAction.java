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


public class PostFolderCommentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		FolderComment folderComment = new FolderCommentImpl();
		FolderCommentForm folderCommentform = new FolderCommentForm();
		Criteria criteria = session.createCriteria(FolderComment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			folderComment = (FolderComment) criteria.uniqueResult();
			new CopyProperties(folderComment,folderCommentform);
		} else if(req.getAttribute("form")!=null){
                        folderCommentform = (FolderCommentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(folderCommentform.getId()));
			folderComment = (FolderComment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",folderComment);
		req.setAttribute("form",folderCommentform);


                  Criteria criteriaFolder= session.createCriteria(Folder.class);
			req.setAttribute("Folders", criteriaFolder.list());

 
		
		return mapping.findForward("success");
	}
	
	
}