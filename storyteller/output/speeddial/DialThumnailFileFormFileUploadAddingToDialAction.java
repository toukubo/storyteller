package net.speeddial.web.app;

import net.speeddial.model.*;
import net.speeddial.beans.*;


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

public class DialThumnailFileFormFileUploadAddingToDialAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		DialThumnailFile dialThumnailFile = new DialThumnailFileImpl();
		DialThumnailFileForm dialThumnailFileform = (DialThumnailFileForm) form;
		
		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら
		if(! (dialThumnailFileform.getFormFile().getFileName().endsWith(".jpg") || dialThumnailFileform.getFormFile().getFileName().endsWith(".JPG") || dialThumnailFileform.getFormFile().getFileName().endsWith(".JPEG") )){
			req.getSession().setAttribute("systemmessage","jpg only");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", dialThumnailFileform.getDial().toString());
			req.setAttribute("id",dialThumnailFileform.getDial());
			return mapping.findForward("error");
		}
		
               	Integer DialInt = dialThumnailFileform.getDial();
		dialThumnailFileform.setDial(null);

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria2 = session.createCriteria(Dial.class);
		criteria2.add(Restrictions.idEq(DialInt));
		Dial dial = (Dial) criteria2
				.uniqueResult();

                DialThumnailFile prevobj = dial.getDialThumnailFile();

                if(prevobj!=null){
                   prevobj.setDial(null);
		Transaction transaction = session.beginTransaction();
		session.delete(prevobj);
		transaction.commit();
                }
				


		BeanUtils.copyProperties(dialThumnailFile,dialThumnailFileform);
		StringFullfiller.fullfil(dialThumnailFile);
		
		if(dialThumnailFileform.getId() == null || dialThumnailFileform.getId().intValue() == 0){
			dialThumnailFile.setId(null);
                dialThumnailFile.setId(null);

		dialThumnailFile.setDial(dial);
		dial.setDialThumnailFile(dialThumnailFile);

		session.flush();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(dialThumnailFile);
		session.saveOrUpdate(dial);
		transaction.commit();
		session.flush();
		}                
		


		

		///////////////////putting file to upload
		FormFile file = dialThumnailFileform.getFormFile();
		String filename = dialThumnailFile.getId().toString() +".jpg";
		
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
		
		
		new HTTPGetRedirection(req, res, "DialDetail.do", DialInt.toString());
		return null;
//		req.setAttribute("id", dialThumnailFile.getId());
//		return mapping.findForward("success");
		
	}
	
	
}