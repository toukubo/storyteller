package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class UpdateAtOnceAccountSnapshotActionAction extends Action{
//	public ActionForward execute(
//			ActionMapping mapping,
//			ActionForm form,
//			HttpServletRequest req,
//			HttpServletResponse res) throws Exception{
//
//
//		Session session = new HibernateSession().currentSession(this
//				.getServlet().getServletContext());
//
//		Criteria criteria = session.createCriteria(AccountSnapshot.class);
//                execute(criteria.list(),session);
//
//
//	}
//	public static void main(String[] args) {
//		try {
////				ApplicationContext context = new ClassPathXmlApplicationContext(
////						new String[] { "applicationContext.xml",
////								"applicationContext-localDataSource.xml" });
////				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
////				Session session = sessionFactory.openSession();
////				UpdateAtOnceAccountSnapshotActionAction action = new UpdateAtOnceAccountSnapshotActionAction();
////				Criteria criteria = session.createCriteria(AccountSnapshot.class);
////				criteria.add(Restrictions.idEq(new Integer(1)));
////				AccountSnapshot accountSnapshot = (AccountSnapshot) criteria.uniqueResult();
////				action.execute(accountSnapshot, session);
////				session.close();
////				sessionFactory.close();
////				sessionFactory =null;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	public void execute(List list,Session session){
//                    
//		for (Iterator iter = list.iterator(); iter.hasNext();) {
//			AccountSnapshot accountSnapshot = (AccountSnapshot) iter.next();
//                           //operation here.
//
//		}
//
//
//		
//	}

}