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


public class PostFolderCommentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		FolderComment folderComment = new FolderCommentImpl();
		FolderCommentForm folderCommentform = (FolderCommentForm) form;

                String error = "";


                		Integer folderInt = folderCommentform.getFolder();
		folderCommentform.setFolder(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(folderCommentform.getId() == null || folderCommentform.getId().intValue() == 0){
			folderComment.setId(null);
			folderCommentform.setId(null);
		}else{
			folderComment.setId(folderCommentform.getId());
			Criteria criteria = session.createCriteria(FolderComment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			folderComment = (FolderComment) criteria.uniqueResult();

		}
                		folderComment.setTitle(folderCommentform.getTitle());
		folderComment.setDescription(folderCommentform.getDescription());
		folderComment.setDate(folderCommentform.getDate());


		
		StringFullfiller.fullfil(folderComment);
                		Criteria criteria2 = session.createCriteria(Folder.class);
		criteria2.add(Restrictions.idEq(folderInt));
		Folder folder = (Folder) criteria2.uniqueResult();
		folderComment.setFolder(folder);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(folderComment);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostFolderCommentDetail.do", folderComment.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "FolderComments.do", folderComment.getId().toString());
		return null;

		
	}
	
	
}