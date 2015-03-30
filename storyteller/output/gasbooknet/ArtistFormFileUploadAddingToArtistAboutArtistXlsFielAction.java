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

public class ArtistFormFileUploadAddingToArtistAboutArtistXlsFielAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Artist artist = new ArtistImpl();
		ArtistForm artistform = (ArtistForm) form;
		
		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら
		if(! (artistform.getFormFile().getFileName().endsWith(".jpg") || artistform.getFormFile().getFileName().endsWith(".JPG") || artistform.getFormFile().getFileName().endsWith(".JPEG") )){
			req.getSession().setAttribute("systemmessage","jpg only");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", artistform.getArtist().toString());
			req.setAttribute("id",artistform.getArtist());
			return mapping.findForward("error");
		}
		
               	Integer ArtistInt = artistform.getArtist();
		artistform.setArtist(null);

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(ArtistInt));
		Artist artist = (Artist) criteria2
				.uniqueResult();

                Artist prevobj = artist.getArtist();

                if(prevobj!=null){
                   prevobj.setArtist(null);
		Transaction transaction = session.beginTransaction();
		session.delete(prevobj);
		transaction.commit();
                }
				


		BeanUtils.copyProperties(artist,artistform);
		StringFullfiller.fullfil(artist);
		
		if(artistform.getId() == null || artistform.getId().intValue() == 0){
			artist.setId(null);
                artist.setId(null);

		artist.setArtist(artist);
		artist.setArtist(artist);

		session.flush();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(artist);
		session.saveOrUpdate(artist);
		transaction.commit();
		session.flush();
		}                
		


		

		///////////////////putting file to upload
		FormFile file = artistform.getFormFile();
		String filename = artist.getId().toString() +".jpg";
		
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
//		req.setAttribute("id", artist.getId());
//		return mapping.findForward("success");
		
	}
	
	
}