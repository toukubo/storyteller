package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.beans.J2eeStoryForm;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.J2eeStoryImpl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UpdateJ2eeStoryFromForUpdatingTasksFromTaskTemplatesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		J2eeStory j2eeStory = new J2eeStoryImpl();
		J2eeStoryForm j2eeStoryform = new J2eeStoryForm();
		Criteria criteria = session.createCriteria(J2eeStory.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			j2eeStory = (J2eeStory) criteria.uniqueResult();
			new CopyProperties(j2eeStory,j2eeStoryform);
		} else if(req.getAttribute("form")!=null){
                        j2eeStoryform = (J2eeStoryForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(j2eeStoryform.getId()));
			j2eeStory = (J2eeStory) criteria.uniqueResult();
		}
                   
		execute(j2eeStory,session);
		
		new HTTPGetRedirection(req, res, "J2eeDetail.do", j2eeStory.getId().toString());
		return null;
                


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateJ2eeStoryFromForUpdatingTasksFromTaskTemplatesAction action = new UpdateJ2eeStoryFromForUpdatingTasksFromTaskTemplatesAction();
				Criteria criteria = session.createCriteria(J2eeStory.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				J2eeStory j2eeStory = (J2eeStory) criteria.uniqueResult();
				action.execute(j2eeStory, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void execute(J2eeStory j2eeStory,Session session){
		
		
	}

}