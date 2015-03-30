package net.clbs.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.clbs.model.*;
import net.clbs.beans.*;


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


public class PostTransitionDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Transition transition = new TransitionImpl();
		TransitionForm transitionform = new TransitionForm();
		Criteria criteria = session.createCriteria(Transition.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			transition = (Transition) criteria.uniqueResult();
			new CopyProperties(transition,transitionform);
		} else if(req.getAttribute("form")!=null){
                        transitionform = (TransitionForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(transitionform.getId()));
			transition = (Transition) criteria.uniqueResult();
		}
		

		req.setAttribute("model",transition);
		req.setAttribute("form",transitionform);


                  Criteria criteriaOperation= session.createCriteria(Operation.class);
			req.setAttribute("Operations", criteriaOperation.list());

 
		
		return mapping.findForward("success");
	}
	
	
}