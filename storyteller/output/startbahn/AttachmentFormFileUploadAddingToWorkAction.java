package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;


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

public class AttachmentFormFileUploadAddingToWorkAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Attachment attachment = new AttachmentImpl();
		AttachmentForm attachmentform = (AttachmentForm) form;
		
		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら
		if(! (attachmentform.getFile().getFileName().endsWith(".jpg") || attachmentform.getFile().getFileName().endsWith(".JPG") || attachmentform.getFile().getFileName().endsWith(".JPEG") )){
			req.getSession().setAttribute("systemmessage","画像はJPEG画像のみアップロード可能です。\\\");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", attachmentform.getWork().toString());
			req.setAttribute("id",attachmentform.getWork());
			return mapping.findForward("error");
		}
		
		Integer WorkInt = attachmentform.getWork();
		attachmentform.setWork(null);
		
//		attachment.setNumber(Integer.parseInt(req.getParameter("setNumber")));
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria2 = session.createCriteria(Work.class);
		criteria2.add(Restrictions.idEq(WorkInt));
		Work work = (Work) criteria2
				.uniqueResult();
		attachment.setWork(work);

		DbFile dbFile =  AttachmentUtils.createDbFileFromFormFile(attachmentform.getFormFile());
		attachment.setDbFile(dbFile);
		
		Transaction transaction = session.beginTransaction();
		session.save(dbFile);
		session.save(attachment);
		session.saveOrUpdate(work);
		transaction.commit();
		session.flush();


		
		
		
		
		new HTTPGetRedirection(req, res, "WorkDetail.do", WorkInt.toString());
		return null;
		
	}
	
	
}