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

public class AttachmentFormFileUploadAddingToArtistForLogoAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Attachment attachment = new AttachmentImpl();
		AttachmentForm attachmentform = (AttachmentForm) form;
		
		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら
		if(! (attachmentform.getFormFile().getFileName().endsWith(".jpg") || attachmentform.getFormFile().getFileName().endsWith(".JPG") || attachmentform.getFormFile().getFileName().endsWith(".JPEG") )){
			req.getSession().setAttribute("systemmessage","jpg only");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", attachmentform.getArtist().toString());
			req.setAttribute("id",attachmentform.getArtist());
			return mapping.findForward("error");
		}
		
               	Integer ArtistInt = attachmentform.getArtist();
		attachmentform.setArtist(null);

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(ArtistInt));
		Artist artist = (Artist) criteria2
				.uniqueResult();

                Attachment prevobj = artist.getAttachment();

                if(prevobj!=null){
                   prevobj.setArtist(null);
		Transaction transaction = session.beginTransaction();
		session.delete(prevobj);
		transaction.commit();
                }
				


		BeanUtils.copyProperties(attachment,attachmentform);
		StringFullfiller.fullfil(attachment);
		
		if(attachmentform.getId() == null || attachmentform.getId().intValue() == 0){
			attachment.setId(null);
                attachment.setId(null);

		attachment.setArtist(artist);
		artist.setAttachment(attachment);

		session.flush();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(attachment);
		session.saveOrUpdate(artist);
		transaction.commit();
		session.flush();
		}                
		


		

		///////////////////putting file to upload
		FormFile file = attachmentform.getFormFile();
		String filename = attachment.getId().toString() +".jpg";
		
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
		
		
		new HTTPGetRedirection(req, res, "ArtistDetail.do", ArtistInt.toString());
		return null;
//		req.setAttribute("id", attachment.getId());
//		return mapping.findForward("success");
		
	}
	
	
}