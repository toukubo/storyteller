package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.beans.*;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class PostEstimationChoiseDetailAction extends Action{
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
		

		req.setAttribute("model",estimationChoise);
		req.setAttribute("form",estimationChoiseform);


                  Criteria criteriaTask= session.createCriteria(Task.class);
			req.setAttribute("Tasks", criteriaTask.list());

Criteria criteriaEstimation= session.createCriteria(Estimation.class);
			req.setAttribute("Estimations", criteriaEstimation.list());

 
		
		return mapping.findForward("success");
	}
	
	
}