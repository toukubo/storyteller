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


public class UpdateSalaryPaymentFromAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		SalaryPayment salaryPayment = new SalaryPaymentImpl();
		SalaryPaymentForm salaryPaymentform = new SalaryPaymentForm();
		Criteria criteria = session.createCriteria(SalaryPayment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			salaryPayment = (SalaryPayment) criteria.uniqueResult();
			new CopyProperties(salaryPayment,salaryPaymentform);
		} else if(req.getAttribute("form")!=null){
                        salaryPaymentform = (SalaryPaymentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(salaryPaymentform.getId()));
			salaryPayment = (SalaryPayment) criteria.uniqueResult();
		}
                   
                execute(salaryPayment,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateSalaryPaymentFromAction action = new UpdateSalaryPaymentFromAction();
				Criteria criteria = session.createCriteria(SalaryPayment.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				SalaryPayment salaryPayment = (SalaryPayment) criteria.uniqueResult();
				action.exectute(salaryPayment, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(SalaryPayment salaryPayment,Session session){
		
	}

}