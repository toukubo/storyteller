package net.gasbooknet.web;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ZipFtpServerVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ZipFtpServer zipFtpServer = new ZipFtpServerImpl();
		ZipFtpServerForm zipFtpServerform = (ZipFtpServerForm) form;
		
                
		
		BeanUtils.copyProperties(zipFtpServer,zipFtpServerform);
		StringFullfiller.fullfil(zipFtpServer);
		if(zipFtpServerform.getId() == null || zipFtpServerform.getId().intValue() == 0){
			zipFtpServer.setId(null);
		}else{
			zipFtpServer.setId(zipFtpServerform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(zipFtpServer);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ZipFtpServerDetail.do", zipFtpServer.getId().toString());
		return null;

		
	}
	
	
}