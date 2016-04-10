package net.storyteller.web.app;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.beans.EstimationForm;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.Estimation;
import net.storyteller.model.EstimationChoise;
import net.storyteller.model.EstimationImpl;
import net.storyteller.model.Sentence;

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


public class UpdateEstimationFromFromVerbAndDiscountAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Estimation estimation = new EstimationImpl();
		EstimationForm estimationform = new EstimationForm();
		Criteria criteria = session.createCriteria(Estimation.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			estimation = (Estimation) criteria.uniqueResult();
			new CopyProperties(estimation,estimationform);
		} else if(req.getAttribute("form")!=null){
                        estimationform = (EstimationForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(estimationform.getId()));
			estimation = (Estimation) criteria.uniqueResult();
		}
                   
		execute(estimation,session);
		new HTTPGetRedirection(req, res, "ShowEstimation.do", estimation.getId().toString());
		return null;


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateEstimationFromFromVerbAndDiscountAction action = new UpdateEstimationFromFromVerbAndDiscountAction();
				Criteria criteria = session.createCriteria(Estimation.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Estimation estimation = (Estimation) criteria.uniqueResult();
				action.execute(estimation, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void execute(Estimation estimation,Session session){
		for (Iterator iter = estimation.getEstimationChoises().iterator(); iter.hasNext();) {
			EstimationChoise estimationChoise = (EstimationChoise) iter.next();
			net.storyteller.model.Test test = estimationChoise.getTest();
			if(test.getAsmain()!=null || test.getAsnormal()!=null){
				Sentence sentence = test.getAsmain();
				if(sentence==null){
					sentence = test.getAsnormal();
				}
				estimationChoise.setMarketAverageDays(sentence.getVerb().getMarketAverageDays());
				estimationChoise.setMarketAveragePrice(sentence.getVerb().getMarketAveragePrice());
				int discountedMarketPrice = (int) ( ( sentence.getVerb().getMarketAveragePrice() * (100 - test.getJ2eeStory().getDiscountpercentage()) * 100 ) / 10000);
				estimationChoise.setCost(sentence.getVerb().getCost());
				int price = (int) ( ( discountedMarketPrice - estimationChoise.getCost() ) * 0.8 + estimationChoise.getCost());
				estimationChoise.setPrice(price);
				estimationChoise.setProfilt(estimationChoise.getPrice() - sentence.getVerb().getCost());
				Transaction transaction = session.beginTransaction();
				session.saveOrUpdate(estimationChoise);
				transaction.commit();
				session.flush();
			}
		}
	}

}