package net.startbahn.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;

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


public class SetSelectionOfFolderCommentTitleAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());



		for (int I = 0; I < req.getParameterValues("id").length; i++) {
			Criteria criteria2 = session.createCriteria(FolderComment.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameterValues("id")[i])));
			FolderComment folderComment = (FolderComment)criteria2.uniqueResult();
			folderComment.settitle(true);
			session.save(folderComment);
		}
		transaction.commit();
		session.flush();

		
		
		return mapping.findForward("success");
	}
	
	
}