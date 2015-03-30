package net.hint.web.app;

import net.hint.model.*;
import net.hint.beans.*;

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


public class UpdateEMailForAutoLinkAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		EMail eMail = new EMailImpl();
		EMailForm eMailform = new EMailForm();
		Criteria criteria = session.createCriteria(EMail.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			eMail = (EMail) criteria.uniqueResult();
			new CopyProperties(eMail,eMailform);
		} else if(req.getAttribute("form")!=null){
                        eMailform = (EMailForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(eMailform.getId()));
			eMail = (EMail) criteria.uniqueResult();
		}
                   
                execute(eMail,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateEMailForAutoLinkAction action = new UpdateEMailForAutoLinkAction();
				Criteria criteria = session.createCriteria(EMail.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				EMail eMail = (EMail) criteria.uniqueResult();
				action.execute(eMail, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(EMail eMail,Session session){
		
	}

}