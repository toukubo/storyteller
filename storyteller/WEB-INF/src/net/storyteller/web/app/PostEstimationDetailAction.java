package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.beans.EstimationForm;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.Estimation;
import net.storyteller.model.EstimationImpl;
import net.storyteller.model.J2eeStory;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class PostEstimationDetailAction extends Action{
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
		
		if(StringUtils.isNotBlank(req.getParameter("j2eeStory"))){
			Criteria criteriaJ2eeStory = session
					.createCriteria(J2eeStory.class);
			criteriaJ2eeStory.add(Restrictions.eq("id", Integer.valueOf(req.getParameter("j2eeStory"))));
			J2eeStory j2eeStory = (J2eeStory) criteriaJ2eeStory.uniqueResult();
			estimation.setJ2eeStory(j2eeStory);
			estimationform.setJ2eeStory(Integer.valueOf(req.getParameter("j2eeStory")));
			estimationform.setSentenceunit(j2eeStory.getPrice_per_sentences());
		}
		

		req.setAttribute("model",estimation);
		req.setAttribute("form",estimationform);


                  Criteria criteriaJ2eeStory= session.createCriteria(J2eeStory.class);
			req.setAttribute("J2eeStorys", criteriaJ2eeStory.list());

 
		
		return mapping.findForward("success");
	}
	
	
}