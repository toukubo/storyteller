package jp.storyteller.web;

import jp.storyteller.model.*;
import jp.storyteller.model.crud.*;


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

public class AndromdaCoreJarFileFormFileUploadAddingTo##addingtoclass##Action extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		AndromdaCoreJarFile andromdacorejarfile = new AndromdaCoreJarFileImpl();
		AndromdaCoreJarFileBean andromdacorejarfileform = (AndromdaCoreJarFileBean) form;
		
		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら
		if(! (andromdacorejarfileform.getFile().getFileName().endsWith(".jpg") || andromdacorejarfileform.getFile().getFileName().endsWith(".JPG") || andromdacorejarfileform.getFile().getFileName().endsWith(".JPEG") )){
			req.getSession().setAttribute("systemmessage","画像はJPEG画像のみアップロード可能です。\\");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", andromdacorejarfileform.get##addingtoclass##().toString());
			req.setAttribute("id",andromdacorejarfileform.get##addingtoclass##());
			return mapping.findForward("error");
		}
		
		
		BeanUtils.copyProperties(andromdacorejarfile,andromdacorejarfileform);
		StringFullfiller.fullfil(andromdacorejarfile);
		

		
		BeanFactory factory = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		SessionFactory sessionFactory = (SessionFactory) factory
				.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		Criteria criteria2 = session.createCriteria(##addingtoclass##.class);
		criteria2.add(Restrictions.idEq(##addingtoclass##Int));
		##addingtoclass## ##addingtoobj## = (##addingtoclass##) criteria2
				.uniqueResult();

                if(##addingtoobj##.getAndromdaCoreJarFile()!=null){
                   andromdacorejarfile.setId(##addingtoobj##.getAndromdaCoreJarFile().getId());
                }

		andromdacorejarfile.set##addingtoclass##(##addingtoobj##);
		
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(andromdacorejarfile);
                ##addingtoobj##.setAndromdaCoreJarFile(andromdacorejarfile);
		transaction.commit();
		session.flush();
		sessionFactory.close();
		

		///////////////////putting file to upload
		FormFile file = andromdacorejarfileform.getFile();
		String filename = andromdacorejarfile.getId().toString() +".jpg";
		
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
		
		
		new HTTPGetRedirection(req, res, "##addingtoclass##Detail.do", ##addingtoclass##Int.toString());
		return null;
//		req.setAttribute("id", andromdacorejarfile.getId());
//		return mapping.findForward("success");
		
	}
	
	
}


