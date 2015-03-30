package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostFavoriteVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Favorite favorite = new FavoriteImpl();
		FavoriteForm favoriteform = (FavoriteForm) form;

                String error = "";


                		Integer publicUserInt = favoriteform.getPublicUser();
		favoriteform.setPublicUser(null);
		Integer musicCategoryInt = favoriteform.getMusicCategory();
		favoriteform.setMusicCategory(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(favoriteform.getId() == null || favoriteform.getId().intValue() == 0){
			favorite.setId(null);
			favoriteform.setId(null);
		}else{
			favorite.setId(favoriteform.getId());
			Criteria criteria = session.createCriteria(Favorite.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			favorite = (Favorite) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(favorite);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		favorite.setPublicUser(publicuser);
		criteria2 = session.createCriteria(MusicCategory.class);
		criteria2.add(Restrictions.idEq(musicCategoryInt));
		MusicCategory musiccategory = (MusicCategory) criteria2.uniqueResult();
		favorite.setMusicCategory(musiccategory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(favorite);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostFavoriteDetail.do", favorite.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Favorites.do", favorite.getId().toString());
		return null;

		
	}
	
	
}