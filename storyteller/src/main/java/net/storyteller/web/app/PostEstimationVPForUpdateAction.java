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


public class PostEstimationVPForUpdateAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Estimation estimation = new EstimationImpl();
		EstimationForm estimationform = (EstimationForm) form;

                String error = "";


                		Integer j2eeStoryInt = estimationform.getJ2eeStory();
		estimationform.setJ2eeStory(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(estimationform.getId() == null || estimationform.getId().intValue() == 0){
			estimation.setId(null);
			estimationform.setId(null);
		}else{
			estimation.setId(estimationform.getId());
			Criteria criteria = session.createCriteria(Estimation.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			estimation = (Estimation) criteria.uniqueResult();

		}
                		estimation.setTotalcost(estimationform.getTotalcost());
		estimation.setTotalprice(estimationform.getTotalprice());
		estimation.setAdapted(estimationform.isAdapted());
		estimation.setTotalsentencenum(estimationform.getTotalsentencenum());
		estimation.setSentenceunit(estimationform.getSentenceunit());


		
		StringFullfiller.fullfil(estimation);
                		Criteria criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(j2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		estimation.setJ2eeStory(j2eestory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(estimation);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostEstimationDetail.do", estimation.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Estimations.do", estimation.getId().toString());
		return null;

		
	}
	
	
}