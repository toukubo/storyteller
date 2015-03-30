package net.startbahn.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;


import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;


import net.enclosing.util.HibernateSession;

public class CopyAFolderFromAFolderAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Folder.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Folder folder = (Folder) criteria.uniqueResult();
		Folder folder2 = new FolderImpl();
		BeanUtils.copyProperties(folder2,folder);
                folder2.setId(null);
		//folder2.setSomething(null);
		session.saveOrUpdate(folder2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", folder2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}