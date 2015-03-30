package net.photo.web.app;

import net.photo.model.*;
import net.photo.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class AttachmentsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Attachment.class);
                
		if(StringUtils.isNotBlank(req.getParameter("work"))) {
			Criteria criteria2 = session.createCriteria(Work.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("work"))));
			Work work = (Work) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("work", work));
		}
 

		if(StringUtils.isNotBlank(req.getParameter("dbFile"))) {
			Criteria criteria2 = session.createCriteria(DbFile.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("dbFile"))));
			DbFile dbFile = (DbFile) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("dbFile", dbFile));
		}
 

		req.setAttribute("attachments",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Attachment attachment = (Attachment) iter.next();
//			vector.add(attachment);
//		}
		Attachment attachment = new AttachmentImpl();
		AttachmentForm attachmentform = new AttachmentForm();
		criteria = session.createCriteria(Attachment.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			attachment = (Attachment) criteria.uniqueResult();
			new CopyProperties(attachment,attachmentform);
		} else if(req.getAttribute("form")!=null){
                        attachmentform = (AttachmentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(attachmentform.getId()));
			attachment = (Attachment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",attachment);
		req.setAttribute("form",attachmentform);
		
		


                  Criteria criteriaWork= session.createCriteria(Work.class);
			req.setAttribute("Works", criteriaWork.list());

Criteria criteriaDbFile= session.createCriteria(DbFile.class);
			req.setAttribute("DbFiles", criteriaDbFile.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}