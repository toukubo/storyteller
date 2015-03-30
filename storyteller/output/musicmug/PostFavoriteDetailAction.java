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


public class PostFavoriteDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Favorite favorite = new FavoriteImpl();
		FavoriteForm favoriteform = new FavoriteForm();
		Criteria criteria = session.createCriteria(Favorite.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			favorite = (Favorite) criteria.uniqueResult();
			new CopyProperties(favorite,favoriteform);
		} else if(req.getAttribute("form")!=null){
                        favoriteform = (FavoriteForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(favoriteform.getId()));
			favorite = (Favorite) criteria.uniqueResult();
		}
		

		req.setAttribute("model",favorite);
		req.setAttribute("form",favoriteform);


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

Criteria criteriaMusicCategory= session.createCriteria(MusicCategory.class);
			req.setAttribute("MusicCategorys", criteriaMusicCategory.list());

 
		
		return mapping.findForward("success");
	}
	
	
}