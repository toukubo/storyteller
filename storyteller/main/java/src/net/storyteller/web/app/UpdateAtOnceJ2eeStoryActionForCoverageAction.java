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


public class UpdateAtOnceJ2eeStoryActionForCoverageAction extends Action{
//	public ActionForward execute(
//			ActionMapping mapping,
//			ActionForm form,
//			HttpServletRequest req,
//			HttpServletResponse res) throws Exception{

//
//		Session session = new HibernateSession().currentSession(this
//				.getServlet().getServletContext());
//
//		Criteria criteria = session.createCriteria(J2eeStory.class);
//                execute(criteria.list(),session);
//
//
//	}
//	public static void main(String[] args) {
//		try {
//				ApplicationContext context = new ClassPathXmlApplicationContext(
//						new String[] { "applicationContext.xml",
//								"applicationContext-localDataSource.xml" });
//				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
//				Session session = sessionFactory.openSession();
//				UpdateAtOnceJ2eeStoryActionForCoverageAction action = new UpdateAtOnceJ2eeStoryActionForCoverageAction();
//				Criteria criteria = session.createCriteria(J2eeStory.class);
//				criteria.add(Restrictions.idEq(new Integer(1)));
//				J2eeStory j2eeStory = (J2eeStory) criteria.uniqueResult();
//				action.execute(j2eeStory, session);
//				session.close();
//				sessionFactory.close();
//				sessionFactory =null;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	public void execute(List list,Session session){
//                    
//		for (Iterator iter = list.iterator(); iter.hasNext();) {
//			J2eeStory j2eeStory = (J2eeStory) iter.next();
//                           //operation here.
//
//		}
//
//
//		
//	}

}