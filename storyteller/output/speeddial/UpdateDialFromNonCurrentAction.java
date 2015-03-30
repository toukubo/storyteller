package net.speeddial.web.app;

import net.speeddial.model.*;
import net.speeddial.beans.*;

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


public class UpdateDialFromNonCurrentAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Dial dial = new DialImpl();
		DialForm dialform = new DialForm();
		Criteria criteria = session.createCriteria(Dial.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			dial = (Dial) criteria.uniqueResult();
			new CopyProperties(dial,dialform);
		} else if(req.getAttribute("form")!=null){
                        dialform = (DialForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(dialform.getId()));
			dial = (Dial) criteria.uniqueResult();
		}
                   
                execute(dial,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateDialFromNonCurrentAction action = new UpdateDialFromNonCurrentAction();
				Criteria criteria = session.createCriteria(Dial.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Dial dial = (Dial) criteria.uniqueResult();
				action.exectute(dial, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(Dial dial,Session session){
		
	}

}