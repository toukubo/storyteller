package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class DbFilesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(DbFile.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			DbFile dbFile = (DbFile) iter.next();
			vector.add(dbFile);
		}
		DbFile dbFile = new DbFileImpl();
		DbFileForm dbFileform = new DbFileForm();
		criteria = session.createCriteria(DbFile.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			dbFile = (DbFile) criteria.uniqueResult();
			new CopyProperties(dbFile,dbFileform);
		} else if(req.getAttribute("form")!=null){
                        dbFileform = (DbFileForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(dbFileform.getId()));
			dbFile = (DbFile) criteria.uniqueResult();
		}
		

		req.setAttribute("model",dbFile);
		req.setAttribute("form",dbFileform);
		
		
		req.setAttribute("dbFiles",vector);


                  Criteria criteriaWorkAttachmentPreview= session.createCriteria(WorkAttachmentPreview.class);
			req.setAttribute("WorkAttachmentPreviews", criteriaWorkAttachmentPreview.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}