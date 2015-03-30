package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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


public class UpdateHollidayFromFromJapaneseHollydayICSAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Holliday holliday = new HollidayImpl();
		HollidayForm hollidayform = new HollidayForm();
		Criteria criteria = session.createCriteria(Holliday.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			holliday = (Holliday) criteria.uniqueResult();
			new CopyProperties(holliday,hollidayform);
		} else if(req.getAttribute("form")!=null){
                        hollidayform = (HollidayForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(hollidayform.getId()));
			holliday = (Holliday) criteria.uniqueResult();
		}
                   
                execute(holliday,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateHollidayFromFromJapaneseHollydayICSAction action = new UpdateHollidayFromFromJapaneseHollydayICSAction();
				Criteria criteria = session.createCriteria(Holliday.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Holliday holliday = (Holliday) criteria.uniqueResult();
				action.exectute(holliday, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(Holliday holliday,Session session){
		
	}

}