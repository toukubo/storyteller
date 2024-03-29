package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.beans.EstimationChoiseForm;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.EstimationChoise;
import net.storyteller.model.EstimationChoiseImpl;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class UpdateEstimationChoiseFromAboutPricesAction extends Action{
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

		criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
		estimationChoise = (EstimationChoise) criteria.uniqueResult();
		
//		estimationChoise.setCost( (int) (estimationChoise.getRequireddays() * 40000) );
		int discountedMarketPrice = (int) ( ( estimationChoise.getMarketAveragePrice() * (100 - estimationChoise.getEstimation().getJ2eeStory().getDiscountpercentage()) ) / 100);
		estimationChoise.setCost( (int) (discountedMarketPrice * 0.9 ));
		int price =  (int) ( ( discountedMarketPrice - estimationChoise.getCost() ) * 0.8 + estimationChoise.getCost() );
		estimationChoise.setPrice( price );

		
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(estimationChoise);
		transaction.commit();
		session.flush();
		
		
		
		
		
		
                   
                   
		

		new HTTPGetRedirection(req, res, "ShowEstimation.do", estimationChoise.getEstimation().getId().toString());
		return null;

	}
}