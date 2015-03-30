package net.musicmug.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.musicmug.model.*;
import net.musicmug.beans.*;


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


public class PostLiveDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Live live = new LiveImpl();
		LiveForm liveform = new LiveForm();
		Criteria criteria = session.createCriteria(Live.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			live = (Live) criteria.uniqueResult();
			new CopyProperties(live,liveform);
		} else if(req.getAttribute("form")!=null){
                        liveform = (LiveForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(liveform.getId()));
			live = (Live) criteria.uniqueResult();
		}
		

		req.setAttribute("model",live);
		req.setAttribute("form",liveform);


                  Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

 
		
		return mapping.findForward("success");
	}
	
	
}