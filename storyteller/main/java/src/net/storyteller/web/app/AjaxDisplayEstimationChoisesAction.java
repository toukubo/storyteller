package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class AjaxDisplayEstimationChoisesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(EstimationChoise.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			EstimationChoise estimationChoise = (EstimationChoise) iter.next();
			vector.add(estimationChoise);
		}
		EstimationChoise estimationChoise = new EstimationChoiseImpl();
		EstimationChoiseForm estimationChoiseform = new EstimationChoiseForm();
		criteria = session.createCriteria(EstimationChoise.class);


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
		
		
		req.setAttribute("estimationChoises",vector);


                  Criteria criteriaTask= session.createCriteria(Task.class);
			req.setAttribute("Tasks", criteriaTask.list());

Criteria criteriaEstimation= session.createCriteria(Estimation.class);
			req.setAttribute("Estimations", criteriaEstimation.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}