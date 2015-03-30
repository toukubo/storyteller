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


public class PostArtistThreadDetailInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ArtistThread artistThread = new ArtistThreadImpl();
		ArtistThreadForm artistThreadform = new ArtistThreadForm();
		Criteria criteria = session.createCriteria(ArtistThread.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			artistThread = (ArtistThread) criteria.uniqueResult();
			new CopyProperties(artistThread,artistThreadform);
		} else if(req.getAttribute("form")!=null){
                        artistThreadform = (ArtistThreadForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(artistThreadform.getId()));
			artistThread = (ArtistThread) criteria.uniqueResult();
		}
		

		req.setAttribute("model",artistThread);
		req.setAttribute("form",artistThreadform);


                  Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

 
		
		return mapping.findForward("success");
	}
	
	
}