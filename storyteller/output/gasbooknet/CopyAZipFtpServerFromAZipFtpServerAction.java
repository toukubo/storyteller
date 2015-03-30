package net.gasbooknet.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;


import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;


import net.enclosing.util.HibernateSession;

public class CopyAZipFtpServerFromAZipFtpServerAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(ZipFtpServer.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		ZipFtpServer zipFtpServer = (ZipFtpServer) criteria.uniqueResult();
		ZipFtpServer zipFtpServer2 = new ZipFtpServerImpl();
		BeanUtils.copyProperties(zipFtpServer2,zipFtpServer);
                zipFtpServer2.setId(null);
		//zipFtpServer2.setSomething(null);
		session.saveOrUpdate(zipFtpServer2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", zipFtpServer2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}