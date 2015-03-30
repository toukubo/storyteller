package net.tonersaver.web.app;

import net.tonersaver.model.*;
import net.tonersaver.beans.*;


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

public class StaticDataFormFileUploadAddingToStaticDataAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		StaticData staticData = new StaticDataImpl();
		StaticDataForm staticDataform = (StaticDataForm) form;
		
		///////////////////////validation for file names jpgかJPGかJPEGじゃないなら
		if(! (staticDataform.getFormFiles()[0].getFileName().endsWith(".jpg") || staticDataform.getFormFiles()[0].getFileName().endsWith(".JPG") || staticDataform.getFormFiles()[0].getFileName().endsWith(".JPEG") )){
			req.getSession().setAttribute("systemmessage","画像はJPEG画像のみアップロード可能です。");
//			new HTTPGetRedirection(req, res, "##secoundmodelclass##Detail.do", staticDataform.getStaticData().toString());
			req.setAttribute("id",staticDataform.getStaticData());
			return mapping.findForward("error");
		}
		
		Integer StaticDataInt = Integer.valueOf(req.getParameter("staticData"));
		
//		staticData.setNumber(Integer.parseInt(req.getParameter("setNumber")));
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria2 = session.createCriteria(StaticData.class);
		criteria2.add(Restrictions.idEq(StaticDataInt));
		StaticData staticData = (StaticData) criteria2
				.uniqueResult();
//		staticData.setStaticData(staticData);
                  staticData.setStaticData(staticData);

		DbFile dbFile =  AttachmentUtils.createDbFileFromFormFile(attachmentform.getFormFiles()[0]);
		attachment.setDbFile(dbFile);

		attachment.setFiletype("jpg");
		StringFullfiller.fullfil(attachment);
		
		Transaction transaction = session.beginTransaction();
		session.save(dbFile);
		session.save(staticData);
		session.saveOrUpdate(staticData);
		transaction.commit();
		session.flush();


		
		
		
		
		new HTTPGetRedirection(req, res, "PostStaticDataDetail.do", StaticDataInt.toString());
		return null;
		
	}
	
	
}