package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.StringFullfiller;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class EventFormFileUploadAddingToAttachmentAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Event event = new EventImpl();
		EventForm eventform = (EventForm) form;
		
		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら
		if(! (eventform.getFile().getFileName().endsWith(".jpg") || eventform.getFile().getFileName().endsWith(".JPG") || eventform.getFile().getFileName().endsWith(".JPEG") )){
			req.getSession().setAttribute("systemmessage","画像はJPEG画像のみアップロード可能です。\\\");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", eventform.getAttachment().toString());
			req.setAttribute("id",eventform.getAttachment());
			return mapping.findForward("error");
		}
		
		Integer AttachmentInt = eventform.getAttachment();
		eventform.setAttachment(null);
		
//		event.setNumber(Integer.parseInt(req.getParameter("setNumber")));
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria2 = session.createCriteria(Attachment.class);
		criteria2.add(Restrictions.idEq(AttachmentInt));
		Attachment attachment = (Attachment) criteria2
				.uniqueResult();
		event.setAttachment(attachment);
                  attachment.setEvent(event);

		DbFile dbFile =  AttachmentUtils.createDbFileFromFormFile(attachmentform.getFormFile());
		attachment.setDbFile(dbFile);
		
		Transaction transaction = session.beginTransaction();
		session.save(dbFile);
		session.save(event);
		session.saveOrUpdate(attachment);
		transaction.commit();
		session.flush();


		
		
		
		
		new HTTPGetRedirection(req, res, "AttachmentDetail.do", AttachmentInt.toString());
		return null;
		
	}
	
	
}