package net.universe.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.universe.model.*;
import net.universe.beans.*;


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


public class PostNarratorDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Narrator narrator = new NarratorImpl();
		NarratorForm narratorform = new NarratorForm();
		Criteria criteria = session.createCriteria(Narrator.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			narrator = (Narrator) criteria.uniqueResult();
			new CopyProperties(narrator,narratorform);
		} else if(req.getAttribute("form")!=null){
                        narratorform = (NarratorForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(narratorform.getId()));
			narrator = (Narrator) criteria.uniqueResult();
		}
		

		req.setAttribute("model",narrator);
		req.setAttribute("form",narratorform);


                   
		
		return mapping.findForward("success");
	}
	
	
}