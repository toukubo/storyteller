package net.craftclip.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.craftclip.model.*;
import net.craftclip.beans.*;


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


public class PostMovieDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Movie movie = new MovieImpl();
		MovieForm movieform = new MovieForm();
		Criteria criteria = session.createCriteria(Movie.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			movie = (Movie) criteria.uniqueResult();
			new CopyProperties(movie,movieform);
		} else if(req.getAttribute("form")!=null){
                        movieform = (MovieForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(movieform.getId()));
			movie = (Movie) criteria.uniqueResult();
		}
		

		req.setAttribute("model",movie);
		req.setAttribute("form",movieform);


                   
		
		return mapping.findForward("success");
	}
	
	
}