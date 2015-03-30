package net.ja.web.app;

import net.ja.model.*;
import net.ja.beans.*;

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


public class UpdateAccountTransactionAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		AccountTransaction accountTransaction = new AccountTransactionImpl();
		AccountTransactionForm accountTransactionform = new AccountTransactionForm();
		Criteria criteria = session.createCriteria(AccountTransaction.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			accountTransaction = (AccountTransaction) criteria.uniqueResult();
			new CopyProperties(accountTransaction,accountTransactionform);
		} else if(req.getAttribute("form")!=null){
                        accountTransactionform = (AccountTransactionForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(accountTransactionform.getId()));
			accountTransaction = (AccountTransaction) criteria.uniqueResult();
		}
                   
                execute(accountTransaction,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateAccountTransactionAction action = new UpdateAccountTransactionAction();
				Criteria criteria = session.createCriteria(AccountTransaction.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				AccountTransaction accountTransaction = (AccountTransaction) criteria.uniqueResult();
				action.execute(accountTransaction, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(AccountTransaction accountTransaction,Session session){
		
	}

}