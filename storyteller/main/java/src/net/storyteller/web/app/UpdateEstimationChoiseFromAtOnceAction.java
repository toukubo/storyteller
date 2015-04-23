package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.beans.EstimationChoiseForm;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.EstimationChoise;
import net.storyteller.model.EstimationChoiseImpl;

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


public class UpdateEstimationChoiseFromAtOnceAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		EstimationChoise estimationChoise = new EstimationChoiseImpl();
		EstimationChoiseForm estimationChoiseform = new EstimationChoiseForm();
		Criteria criteria = session.createCriteria(EstimationChoise.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			estimationChoise = (EstimationChoise) criteria.uniqueResult();
			new CopyProperties(estimationChoise,estimationChoiseform);
		} else if(req.getAttribute("form")!=null){
                        estimationChoiseform = (EstimationChoiseForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(estimationChoiseform.getId()));
			estimationChoise = (EstimationChoise) criteria.uniqueResult();
		}
                   
		execute(estimationChoise,session);
		new HTTPGetRedirection(req, res, "ShowEstimation.do", estimationChoise.getEstimation().getId().toString());
		return null;
                


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateEstimationChoiseFromAtOnceAction action = new UpdateEstimationChoiseFromAtOnceAction();
				Criteria criteria = session.createCriteria(EstimationChoise.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				EstimationChoise estimationChoise = (EstimationChoise) criteria.uniqueResult();
				action.execute(estimationChoise, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void execute(EstimationChoise estimationChoise,Session session){
		
	
		
	}

}