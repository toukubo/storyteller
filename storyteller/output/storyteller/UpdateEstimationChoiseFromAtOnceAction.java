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
				action.exectute(estimationChoise, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(EstimationChoise estimationChoise,Session session){
		
	}

}