package net.iwager.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.iwager.model.*;
import net.iwager.beans.*;


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


public class PostSidebetDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Sidebet sidebet = new SidebetImpl();
		SidebetForm sidebetform = new SidebetForm();
		Criteria criteria = session.createCriteria(Sidebet.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			sidebet = (Sidebet) criteria.uniqueResult();
			new CopyProperties(sidebet,sidebetform);
		} else if(req.getAttribute("form")!=null){
                        sidebetform = (SidebetForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(sidebetform.getId()));
			sidebet = (Sidebet) criteria.uniqueResult();
		}
		

		req.setAttribute("model",sidebet);
		req.setAttribute("form",sidebetform);


                  Criteria criteriaPlay= session.createCriteria(Play.class);
			req.setAttribute("Plays", criteriaPlay.list());

 
		
		return mapping.findForward("success");
	}
	
	
}