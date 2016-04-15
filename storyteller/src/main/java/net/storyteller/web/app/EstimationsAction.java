package net.storyteller.web.app;

import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.beans.EstimationForm;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.Estimation;
import net.storyteller.model.EstimationImpl;
import net.storyteller.model.J2eeStory;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class EstimationsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Estimation.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Estimation estimation = (Estimation) iter.next();
			vector.add(estimation);
		}
		Estimation estimation = new EstimationImpl();
		EstimationForm estimationform = new EstimationForm();
		criteria = session.createCriteria(Estimation.class);


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
		

		req.setAttribute("model",estimation);
		req.setAttribute("form",estimationform);
		
		
		req.setAttribute("estimations",vector);


                  Criteria criteriaJ2eeStory= session.createCriteria(J2eeStory.class);
			req.setAttribute("J2eeStorys", criteriaJ2eeStory.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}