package net.startbahn.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.beans.*;


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


public class PostActionHistoryDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ActionHistory actionHistory = new ActionHistoryImpl();
		ActionHistoryForm actionHistoryform = new ActionHistoryForm();
		Criteria criteria = session.createCriteria(ActionHistory.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			actionHistory = (ActionHistory) criteria.uniqueResult();
			new CopyProperties(actionHistory,actionHistoryform);
		} else if(req.getAttribute("form")!=null){
                        actionHistoryform = (ActionHistoryForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(actionHistoryform.getId()));
			actionHistory = (ActionHistory) criteria.uniqueResult();
		}
		

		req.setAttribute("model",actionHistory);
		req.setAttribute("form",actionHistoryform);


                  Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

 
		
		return mapping.findForward("success");
	}
	
	
}