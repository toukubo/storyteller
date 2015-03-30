package net.iwager.web.app;

import net.iwager.model.*;
import net.iwager.beans.*;

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


public class UpdatePlayAboutJackpotAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Play play = new PlayImpl();
		PlayForm playform = new PlayForm();
		Criteria criteria = session.createCriteria(Play.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			play = (Play) criteria.uniqueResult();
			new CopyProperties(play,playform);
		} else if(req.getAttribute("form")!=null){
                        playform = (PlayForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(playform.getId()));
			play = (Play) criteria.uniqueResult();
		}
                   
                execute(play,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdatePlayAboutJackpotAction action = new UpdatePlayAboutJackpotAction();
				Criteria criteria = session.createCriteria(Play.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Play play = (Play) criteria.uniqueResult();
				action.execute(play, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(Play play,Session session){
		
	}

}