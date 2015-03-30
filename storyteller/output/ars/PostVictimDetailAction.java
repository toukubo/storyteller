package net.ars.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ars.model.*;
import net.ars.beans.*;


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


public class PostVictimDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Victim victim = new VictimImpl();
		VictimForm victimform = new VictimForm();
		Criteria criteria = session.createCriteria(Victim.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			victim = (Victim) criteria.uniqueResult();
			new CopyProperties(victim,victimform);
		} else if(req.getAttribute("form")!=null){
                        victimform = (VictimForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(victimform.getId()));
			victim = (Victim) criteria.uniqueResult();
		}
		

		req.setAttribute("model",victim);
		req.setAttribute("form",victimform);


                  Criteria criteriaAccident= session.createCriteria(Accident.class);
			req.setAttribute("Accidents", criteriaAccident.list());

 
		
		return mapping.findForward("success");
	}
	
	
}