package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.beans.TestForm;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.Test;
import net.storyteller.model.TestImpl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UpdateTestNonCheckedAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Test test = new TestImpl();
		TestForm testform = new TestForm();
		Criteria criteria = session.createCriteria(Test.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			test = (Test) criteria.uniqueResult();
			new CopyProperties(test,testform);
		} else if(req.getAttribute("form")!=null){
                        testform = (TestForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(testform.getId()));
			test = (Test) criteria.uniqueResult();
		}
                   
                execute(test,session);
                new HTTPGetRedirection(req, res, req.getParameter("from"), req.getParameter("id"));
                return null;



	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateTestNonCheckedAction action = new UpdateTestNonCheckedAction();
				Criteria criteria = session.createCriteria(Test.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Test test = (Test) criteria.uniqueResult();
				action.execute(test, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void execute(Test test,Session session){
		test.setChecked(false);
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(test);
		transaction.commit();
		session.flush();
		
	}

}