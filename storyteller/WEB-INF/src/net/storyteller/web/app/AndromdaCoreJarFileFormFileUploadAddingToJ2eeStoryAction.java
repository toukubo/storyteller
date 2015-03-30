package net.storyteller.web.app;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.beans.AndromdaCoreJarFileForm;
import net.storyteller.model.AndromdaCoreJarFile;
import net.storyteller.model.AndromdaCoreJarFileImpl;
import net.storyteller.model.J2eeStory;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.util.FileCopyUtils;

public class AndromdaCoreJarFileFormFileUploadAddingToJ2eeStoryAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		AndromdaCoreJarFile andromdacorejarfile = new AndromdaCoreJarFileImpl();
		AndromdaCoreJarFileForm andromdacorejarfileform = (AndromdaCoreJarFileForm) form;
		
		///////////////////////validation for file names jpg��JPG��JPEG����Ȃ��Ȃ�
//		if(! (andromdacorejarfileform.getFormFile().getFileName().endsWith(".jpg") || andromdacorejarfileform.getFormFile().getFileName().endsWith(".JPG") || andromdacorejarfileform.getFormFile().getFileName().endsWith(".JPEG") )){
		//			req.getSession().setAttribute("systemmessage","jpg only");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", andromdacorejarfileform.getJ2eeStory().toString());
		//			req.setAttribute("id",andromdacorejarfileform.getJ2eeStory());
		//			return mapping.findForward("error");
		//		}
		

               	Integer J2eeStoryInt = andromdacorejarfileform.getJ2eeStory();
		andromdacorejarfileform.setJ2eeStory(null);

		
		BeanUtils.copyProperties(andromdacorejarfile,andromdacorejarfileform);
		StringFullfiller.fullfil(andromdacorejarfile);
		if(andromdacorejarfileform.getId() == null || andromdacorejarfileform.getId().intValue() == 0){
			andromdacorejarfile.setId(null);
		}else{
			andromdacorejarfile.setId(andromdacorejarfileform.getId());
		}

                
		


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(J2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2
				.uniqueResult();

                if(j2eestory.getAndromdaCoreJarFile()!=null){
                   andromdacorejarfile.setId(j2eestory.getAndromdaCoreJarFile().getId());
                }

		andromdacorejarfile.setJ2eeStory(j2eestory);
		
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(andromdacorejarfile);
        j2eestory.setAndromdaCoreJarFile(andromdacorejarfile);
        session.saveOrUpdate(j2eestory);
		transaction.commit();
		session.flush();
		

		///////////////////putting file to upload
		FormFile file = andromdacorejarfileform.getFormFile();
		String filename = andromdacorejarfile.getId().toString() +".jar";
		String filename2 = j2eestory.getName() +".jar";
		
		InputStream is = file.getInputStream();
		String basepath = 		this.getServlet().getServletContext().getRealPath(".");

		
		BufferedInputStream inBuffer = new BufferedInputStream(is);
		FileOutputStream fos = new FileOutputStream(basepath + "/" + filename);
		BufferedOutputStream outBuffer = new BufferedOutputStream(fos);
		int contents = 0;
		while ((contents = inBuffer.read()) != -1) {
			outBuffer.write(contents);
		}
		outBuffer.flush();
		is.close();
		inBuffer.close();
		outBuffer.close();
		FileCopyUtils.copy(new File(basepath + "/" + filename),new File(basepath + "/" + filename2));
//		
//		//also save to nameofj2eeproject.jar
//		is = file.getInputStream();
//		inBuffer = new BufferedInputStream(is);
//		fos = new FileOutputStream(basepath + "/" + filename2);
//		outBuffer = new BufferedOutputStream(fos);
//		contents = 0;
//		while ((contents = inBuffer.read()) != -1) {
//			outBuffer.write(contents);
//		}
//		outBuffer.flush();
//		is.close();
//		inBuffer.close();
//		outBuffer.close();
		
		
		new HTTPGetRedirection(req, res, "J2eeStoryDetail.do", J2eeStoryInt.toString());
		return null;
//		req.setAttribute("id", andromdacorejarfile.getId());
//		return mapping.findForward("success");
		
	}
	
	
}


