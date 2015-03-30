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


public class PostFolderVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Folder folder = new FolderImpl();
		FolderForm folderform = (FolderForm) form;

                String error = "";
if(StringUtils.isBlank(folderform.getWord())){
   error += "語は空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",folderform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(folderform.getId() == null || folderform.getId().intValue() == 0){
			folder.setId(null);
			folderform.setId(null);
		}else{
			folder.setId(folderform.getId());
			Criteria criteria = session.createCriteria(Folder.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			folder = (Folder) criteria.uniqueResult();

		}
                		folder.setWord(folderform.getWord());


		
		StringFullfiller.fullfil(folder);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(folder);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostFolderDetail.do", folder.getId().toString());
		return null;

		
	}
	
	
}