package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;


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

public class WorkAttachmentFormFileUploadAddingToWorkForThumbnailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		WorkAttachment workAttachment = new WorkAttachmentImpl();
		WorkAttachmentForm workAttachmentform = (WorkAttachmentForm) form;
		
		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら
		if(! (workAttachmentform.getFormFile().getFileName().endsWith(".jpg") || workAttachmentform.getFormFile().getFileName().endsWith(".JPG") || workAttachmentform.getFormFile().getFileName().endsWith(".JPEG") )){
			req.getSession().setAttribute("systemmessage","jpg only");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", workAttachmentform.getWork().toString());
			req.setAttribute("id",workAttachmentform.getWork());
			return mapping.findForward("error");
		}
		
               	Integer WorkInt = workAttachmentform.getWork();
		workAttachmentform.setWork(null);

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria2 = session.createCriteria(Work.class);
		criteria2.add(Restrictions.idEq(WorkInt));
		Work work = (Work) criteria2
				.uniqueResult();

                WorkAttachment prevobj = work.getWorkAttachment();

                if(prevobj!=null){
                   prevobj.setWork(null);
		Transaction transaction = session.beginTransaction();
		session.delete(prevobj);
		transaction.commit();
                }
				


		BeanUtils.copyProperties(workAttachment,workAttachmentform);
		StringFullfiller.fullfil(workAttachment);
		
		if(workAttachmentform.getId() == null || workAttachmentform.getId().intValue() == 0){
			workAttachment.setId(null);
                workAttachment.setId(null);

		workAttachment.setWork(work);
		work.setWorkAttachment(workAttachment);

		session.flush();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(workAttachment);
		session.saveOrUpdate(work);
		transaction.commit();
		session.flush();
		}                
		


		

		///////////////////putting file to upload
		FormFile file = workAttachmentform.getFormFile();
		String filename = workAttachment.getId().toString() +".jpg";
		
		InputStream is = file.getInputStream();
		String basepath = 		this.getServlet().getServletContext().getRealPath("upload");

		
		BufferedInputStream inBuffer = new BufferedInputStream(is);
		FileOutputStream fos = new FileOutputStream(basepath + "/" + filename);
		BufferedOutputStream outBuffer = new BufferedOutputStream(fos);
		int contents = 0;
		while ((contents = inBuffer.read()) != -1) {
			outBuffer.write(contents);
		}
		outBuffer.flush();
		inBuffer.close();
		outBuffer.close();
		
		
		new HTTPGetRedirection(req, res, "WorkDetail.do", WorkInt.toString());
		return null;
//		req.setAttribute("id", workAttachment.getId());
//		return mapping.findForward("success");
		
	}
	
	
}