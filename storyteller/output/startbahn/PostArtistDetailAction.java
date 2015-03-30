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


public class PostArtistDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Artist artist = new ArtistImpl();
		ArtistForm artistform = new ArtistForm();
		Criteria criteria = session.createCriteria(Artist.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			artist = (Artist) criteria.uniqueResult();
			new CopyProperties(artist,artistform);
		} else if(req.getAttribute("form")!=null){
                        artistform = (ArtistForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(artistform.getId()));
			artist = (Artist) criteria.uniqueResult();
		}
		

		req.setAttribute("model",artist);
		req.setAttribute("form",artistform);


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

 
		
		return mapping.findForward("success");
	}
	
	
}