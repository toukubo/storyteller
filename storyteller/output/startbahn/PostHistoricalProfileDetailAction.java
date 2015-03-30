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


public class PostHistoricalProfileDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		HistoricalProfile historicalProfile = new HistoricalProfileImpl();
		HistoricalProfileForm historicalProfileform = new HistoricalProfileForm();
		Criteria criteria = session.createCriteria(HistoricalProfile.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			historicalProfile = (HistoricalProfile) criteria.uniqueResult();
			new CopyProperties(historicalProfile,historicalProfileform);
		} else if(req.getAttribute("form")!=null){
                        historicalProfileform = (HistoricalProfileForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(historicalProfileform.getId()));
			historicalProfile = (HistoricalProfile) criteria.uniqueResult();
		}
		

		req.setAttribute("model",historicalProfile);
		req.setAttribute("form",historicalProfileform);


                  Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

 
		
		return mapping.findForward("success");
	}
	
	
}