package net.storyteller.web.app;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.beans.EstimationForm;
import net.storyteller.model.Estimation;
import net.storyteller.model.EstimationChoise;
import net.storyteller.model.EstimationImpl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class UpdateEstimationFromForSummingupAction extends Action{
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

		criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
		estimation = (Estimation) criteria.uniqueResult();
		
		int total = 0;
		int totalcost = 0;
		int totalprofit = 0;
		
		for (Iterator iter = estimation.getEstimationChoises().iterator(); iter.hasNext();) {
			EstimationChoise estimationChoise = (EstimationChoise) iter.next();
			total += estimationChoise.getPrice();
			totalcost += estimationChoise.getCost();
			totalprofit += estimationChoise.getProfilt();
		}
		estimation.setTotalprice(total);
		estimation.setTotalcost(totalcost);
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(estimation);
		transaction.commit();
		session.flush();
            
		new HTTPGetRedirection(req, res, "ShowEstimation.do", estimation.getId().toString());
		return null;
                   
		



	}
}