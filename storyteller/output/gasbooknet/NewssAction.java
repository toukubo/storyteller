package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class NewssAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(News.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			News news = (News) iter.next();
			vector.add(news);
		}
		News news = new NewsImpl();
		NewsForm newsform = new NewsForm();
		criteria = session.createCriteria(News.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			news = (News) criteria.uniqueResult();
			new CopyProperties(news,newsform);
		} else if(req.getAttribute("form")!=null){
                        newsform = (NewsForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(newsform.getId()));
			news = (News) criteria.uniqueResult();
		}
		

		req.setAttribute("model",news);
		req.setAttribute("form",newsform);
		
		
		req.setAttribute("newss",vector);


                  Criteria criteriaCountry= session.createCriteria(Country.class);
			req.setAttribute("Countrys", criteriaCountry.list());

Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaGenre= session.createCriteria(Genre.class);
			req.setAttribute("Genres", criteriaGenre.list());

Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

Criteria criteriaNewsType= session.createCriteria(NewsType.class);
			req.setAttribute("NewsTypes", criteriaNewsType.list());

Criteria criteriaNewsSource= session.createCriteria(NewsSource.class);
			req.setAttribute("NewsSources", criteriaNewsSource.list());

Criteria criteriaNewsFeature= session.createCriteria(NewsFeature.class);
			req.setAttribute("NewsFeatures", criteriaNewsFeature.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}