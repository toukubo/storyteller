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

public class ArtistXlsFileFormFileUploadAddingToArtistAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ArtistXlsFile artistxlsfile = new ArtistXlsFileImpl();
		ArtistXlsFileForm artistxlsfileform = (ArtistXlsFileForm) form;
		
		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら
		if(! (artistxlsfileform.getFormFile().getFileName().endsWith(".jpg") || artistxlsfileform.getFormFile().getFileName().endsWith(".JPG") || artistxlsfileform.getFormFile().getFileName().endsWith(".JPEG") )){
			req.getSession().setAttribute("systemmessage","jpg only");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", artistxlsfileform.getArtist().toString());
			req.setAttribute("id",artistxlsfileform.getArtist());
			return mapping.findForward("error");
		}
		
               	Integer ArtistInt = artistxlsfileform.getArtist();
		artistxlsfileform.setArtist(null);

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(ArtistInt));
		Artist artist = (Artist) criteria2
				.uniqueResult();

                ArtistXlsFile prevobj = artist.getArtistXlsFile();

                if(prevobj!=null){
                   prevobj.setArtist(null);
		Transaction transaction = session.beginTransaction();
		session.delete(prevobj);
		transaction.commit();
                }
				


		BeanUtils.copyProperties(artistxlsfile,artistxlsfileform);
		StringFullfiller.fullfil(artistxlsfile);
		
		if(artistxlsfileform.getId() == null || artistxlsfileform.getId().intValue() == 0){
			artistxlsfile.setId(null);
                artistxlsfile.setId(null);

		artistxlsfile.setArtist(artist);
		artist.setArtistXlsFile(artistxlsfile);

		session.flush();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(artistxlsfile);
		session.saveOrUpdate(artist);
		transaction.commit();
		session.flush();
		}                
		


		

		///////////////////putting file to upload
		FormFile file = artistxlsfileform.getFormFile();
		String filename = artistxlsfile.getId().toString() +".jpg";
		
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
//		req.setAttribute("id", artistxlsfile.getId());
//		return mapping.findForward("success");
		
	}
	
	
}