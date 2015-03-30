package net.startbahn.web;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;

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

public class FolderCommentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		FolderComment folderComment = new FolderCommentImpl();
		FolderCommentForm folderCommentform = (FolderCommentForm) form;
		
                		Integer folderInt = folderCommentform.getFolder();
		folderCommentform.setFolder(null);

		
		BeanUtils.copyProperties(folderComment,folderCommentform);
		StringFullfiller.fullfil(folderComment);
		if(folderCommentform.getId() == null || folderCommentform.getId().intValue() == 0){
			folderComment.setId(null);
		}else{
			folderComment.setId(folderCommentform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Folder.class);
		criteria2.add(Restrictions.idEq(folderInt));
		Folder folder = (Folder) criteria2.uniqueResult();
		folderComment.setFolder(folder);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(folderComment);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "FolderCommentDetail.do", folderComment.getId().toString());
		return null;

		
	}
	
	
}