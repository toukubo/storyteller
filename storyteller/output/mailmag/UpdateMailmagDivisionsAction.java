package net.mailmag.web.app;

import net.mailmag.model.*;
import net.mailmag.beans.*;

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


public class UpdateMailmagDivisionsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Mailmag mailmag = new MailmagImpl();
		MailmagForm mailmagform = new MailmagForm();
		Criteria criteria = session.createCriteria(Mailmag.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			mailmag = (Mailmag) criteria.uniqueResult();
			new CopyProperties(mailmag,mailmagform);
		} else if(req.getAttribute("form")!=null){
                        mailmagform = (MailmagForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(mailmagform.getId()));
			mailmag = (Mailmag) criteria.uniqueResult();
		}
                   
                execute(mailmag,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateMailmagDivisionsAction action = new UpdateMailmagDivisionsAction();
				Criteria criteria = session.createCriteria(Mailmag.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Mailmag mailmag = (Mailmag) criteria.uniqueResult();
				action.execute(mailmag, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(Mailmag mailmag,Session session){
		
	}

}