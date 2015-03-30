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


public class PostFolderDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Folder folder = new FolderImpl();
		FolderForm folderform = new FolderForm();
		Criteria criteria = session.createCriteria(Folder.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			folder = (Folder) criteria.uniqueResult();
			new CopyProperties(folder,folderform);
		} else if(req.getAttribute("form")!=null){
                        folderform = (FolderForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(folderform.getId()));
			folder = (Folder) criteria.uniqueResult();
		}
		

		req.setAttribute("model",folder);
		req.setAttribute("form",folderform);


                   
		
		return mapping.findForward("success");
	}
	
	
}