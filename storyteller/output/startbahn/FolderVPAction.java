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

public class FolderVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Folder folder = new FolderImpl();
		FolderForm folderform = (FolderForm) form;
		
                		Integer publicUserInt = folderform.getPublicUser();
		folderform.setPublicUser(null);

		
		BeanUtils.copyProperties(folder,folderform);
		StringFullfiller.fullfil(folder);
		if(folderform.getId() == null || folderform.getId().intValue() == 0){
			folder.setId(null);
		}else{
			folder.setId(folderform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		folder.setPublicUser(publicuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(folder);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "FolderDetail.do", folder.getId().toString());
		return null;

		
	}
	
	
}