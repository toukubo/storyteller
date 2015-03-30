package net.realize.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.realize.model.*;
import net.realize.beans.*;


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


public class PostCycleMatchingDetailSettingIntroductionAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		CycleMatching cycleMatching = new CycleMatchingImpl();
		CycleMatchingForm cycleMatchingform = new CycleMatchingForm();
		Criteria criteria = session.createCriteria(CycleMatching.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			cycleMatching = (CycleMatching) criteria.uniqueResult();
			new CopyProperties(cycleMatching,cycleMatchingform);
		} else if(req.getAttribute("form")!=null){
                        cycleMatchingform = (CycleMatchingForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(cycleMatchingform.getId()));
			cycleMatching = (CycleMatching) criteria.uniqueResult();
		}
		

		req.setAttribute("model",cycleMatching);
		req.setAttribute("form",cycleMatchingform);


                  Criteria criteriaCycle= session.createCriteria(Cycle.class);
			req.setAttribute("Cycles", criteriaCycle.list());

Criteria criteriaUser= session.createCriteria(User.class);
			req.setAttribute("Users", criteriaUser.list());

Criteria criteriaCommitionPayment= session.createCriteria(CommitionPayment.class);
			req.setAttribute("CommitionPayments", criteriaCommitionPayment.list());

 
		
		return mapping.findForward("success");
	}
	
	
}