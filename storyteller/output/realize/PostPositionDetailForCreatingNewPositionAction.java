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


public class PostPositionDetailForCreatingNewPositionAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Position position = new PositionImpl();
		PositionForm positionform = new PositionForm();
		Criteria criteria = session.createCriteria(Position.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			position = (Position) criteria.uniqueResult();
			new CopyProperties(position,positionform);
		} else if(req.getAttribute("form")!=null){
                        positionform = (PositionForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(positionform.getId()));
			position = (Position) criteria.uniqueResult();
		}
		

		req.setAttribute("model",position);
		req.setAttribute("form",positionform);


                  Criteria criteriaCycle= session.createCriteria(Cycle.class);
			req.setAttribute("Cycles", criteriaCycle.list());

Criteria criteriaUser= session.createCriteria(User.class);
			req.setAttribute("Users", criteriaUser.list());

 
		
		return mapping.findForward("success");
	}
	
	
}