package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class MugFavoritesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(MugFavorite.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			MugFavorite mugFavorite = (MugFavorite) iter.next();
			vector.add(mugFavorite);
		}
		MugFavorite mugFavorite = new MugFavoriteImpl();
		MugFavoriteForm mugFavoriteform = new MugFavoriteForm();
		criteria = session.createCriteria(MugFavorite.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			mugFavorite = (MugFavorite) criteria.uniqueResult();
			new CopyProperties(mugFavorite,mugFavoriteform);
		} else if(req.getAttribute("form")!=null){
                        mugFavoriteform = (MugFavoriteForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(mugFavoriteform.getId()));
			mugFavorite = (MugFavorite) criteria.uniqueResult();
		}
		

		req.setAttribute("model",mugFavorite);
		req.setAttribute("form",mugFavoriteform);
		
		
		req.setAttribute("mugFavorites",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}