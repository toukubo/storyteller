package net.mailmag.web.app;

import net.mailmag.model.*;
import net.mailmag.beans.*;


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

public class CsvFileFormFileUploadAddingToSiteAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CsvFile csvFile = new CsvFileImpl();
		CsvFileForm csvFileform = (CsvFileForm) form;
		
		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら
		if(! (csvFileform.getFormFile().getFileName().endsWith(".jpg") || csvFileform.getFormFile().getFileName().endsWith(".JPG") || csvFileform.getFormFile().getFileName().endsWith(".JPEG") )){
			req.getSession().setAttribute("systemmessage","jpg only");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", csvFileform.getSite().toString());
			req.setAttribute("id",csvFileform.getSite());
			return mapping.findForward("error");
		}
		
               	Integer SiteInt = csvFileform.getSite();
		csvFileform.setSite(null);

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria2 = session.createCriteria(Site.class);
		criteria2.add(Restrictions.idEq(SiteInt));
		Site site = (Site) criteria2
				.uniqueResult();

                CsvFile prevobj = site.getCsvFile();

                if(prevobj!=null){
                   prevobj.setSite(null);
		Transaction transaction = session.beginTransaction();
		session.delete(prevobj);
		transaction.commit();
                }
				


		BeanUtils.copyProperties(csvFile,csvFileform);
		StringFullfiller.fullfil(csvFile);
		
		if(csvFileform.getId() == null || csvFileform.getId().intValue() == 0){
			csvFile.setId(null);
                csvFile.setId(null);

		csvFile.setSite(site);
		site.setCsvFile(csvFile);

		session.flush();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(csvFile);
		session.saveOrUpdate(site);
		transaction.commit();
		session.flush();
		}                
		


		

		///////////////////putting file to upload
		FormFile file = csvFileform.getFormFile();
		String filename = csvFile.getId().toString() +".jpg";
		
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
		
		
		new HTTPGetRedirection(req, res, "SiteDetail.do", SiteInt.toString());
		return null;
//		req.setAttribute("id", csvFile.getId());
//		return mapping.findForward("success");
		
	}
	
	
}