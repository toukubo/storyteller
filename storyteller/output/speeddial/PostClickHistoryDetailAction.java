package net.speeddial.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.speeddial.model.*;
import net.speeddial.beans.*;


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


public class PostClickHistoryDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ClickHistory clickHistory = new ClickHistoryImpl();
		ClickHistoryForm clickHistoryform = new ClickHistoryForm();
		Criteria criteria = session.createCriteria(ClickHistory.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			clickHistory = (ClickHistory) criteria.uniqueResult();
			new CopyProperties(clickHistory,clickHistoryform);
		} else if(req.getAttribute("form")!=null){
                        clickHistoryform = (ClickHistoryForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(clickHistoryform.getId()));
			clickHistory = (ClickHistory) criteria.uniqueResult();
		}
		

		req.setAttribute("model",clickHistory);
		req.setAttribute("form",clickHistoryform);


                  Criteria criteriaDial= session.createCriteria(Dial.class);
			req.setAttribute("Dials", criteriaDial.list());

 
		
		return mapping.findForward("success");
	}
	
	
}