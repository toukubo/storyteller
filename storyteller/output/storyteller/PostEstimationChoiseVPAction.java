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


public class PostEstimationChoiseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		EstimationChoise estimationChoise = new EstimationChoiseImpl();
		EstimationChoiseForm estimationChoiseform = (EstimationChoiseForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",estimationChoiseform);
	return mapping.findForward("error");
}


                		Integer testInt = estimationChoiseform.getTest();
		estimationChoiseform.setTest(null);
		Integer estimationInt = estimationChoiseform.getEstimation();
		estimationChoiseform.setEstimation(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(estimationChoiseform.getId() == null || estimationChoiseform.getId().intValue() == 0){
			estimationChoise.setId(null);
			estimationChoiseform.setId(null);
		}else{
			estimationChoise.setId(estimationChoiseform.getId());
			Criteria criteria = session.createCriteria(EstimationChoise.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			estimationChoise = (EstimationChoise) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(estimationChoise);
                		Criteria criteria2 = session.createCriteria(Test.class);
		criteria2.add(Restrictions.idEq(testInt));
		Test test = (Test) criteria2.uniqueResult();
		estimationChoise.setTest(test);
		criteria2 = session.createCriteria(Estimation.class);
		criteria2.add(Restrictions.idEq(estimationInt));
		Estimation estimation = (Estimation) criteria2.uniqueResult();
		estimationChoise.setEstimation(estimation);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(estimationChoise);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostEstimationChoiseDetail.do", estimationChoise.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "EstimationChoises.do", estimationChoise.getId().toString());
		return null;

		
	}
	
	
}