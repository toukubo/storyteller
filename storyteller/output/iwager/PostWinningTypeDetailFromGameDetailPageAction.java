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


public class PostWinningTypeDetailFromGameDetailPageAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		WinningType winningType = new WinningTypeImpl();
		WinningTypeForm winningTypeform = new WinningTypeForm();
		Criteria criteria = session.createCriteria(WinningType.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			winningType = (WinningType) criteria.uniqueResult();
			new CopyProperties(winningType,winningTypeform);
		} else if(req.getAttribute("form")!=null){
                        winningTypeform = (WinningTypeForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(winningTypeform.getId()));
			winningType = (WinningType) criteria.uniqueResult();
		}
		

		req.setAttribute("model",winningType);
		req.setAttribute("form",winningTypeform);


                  Criteria criteriaGame= session.createCriteria(Game.class);
			req.setAttribute("Games", criteriaGame.list());

 
		
		return mapping.findForward("success");
	}
	
	
}