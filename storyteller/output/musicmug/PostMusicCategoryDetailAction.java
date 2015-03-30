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


public class PostMusicCategoryDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		MusicCategory musicCategory = new MusicCategoryImpl();
		MusicCategoryForm musicCategoryform = new MusicCategoryForm();
		Criteria criteria = session.createCriteria(MusicCategory.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			musicCategory = (MusicCategory) criteria.uniqueResult();
			new CopyProperties(musicCategory,musicCategoryform);
		} else if(req.getAttribute("form")!=null){
                        musicCategoryform = (MusicCategoryForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(musicCategoryform.getId()));
			musicCategory = (MusicCategory) criteria.uniqueResult();
		}
		

		req.setAttribute("model",musicCategory);
		req.setAttribute("form",musicCategoryform);


                   
		
		return mapping.findForward("success");
	}
	
	
}