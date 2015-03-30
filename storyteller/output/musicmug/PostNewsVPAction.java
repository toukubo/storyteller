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


public class PostNewsVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		News news = new NewsImpl();
		NewsForm newsform = (NewsForm) form;

                String error = "";


                		Integer intraUserInt = newsform.getIntraUser();
		newsform.setIntraUser(null);
		Integer artistInt = newsform.getArtist();
		newsform.setArtist(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(newsform.getId() == null || newsform.getId().intValue() == 0){
			news.setId(null);
			newsform.setId(null);
		}else{
			news.setId(newsform.getId());
			Criteria criteria = session.createCriteria(News.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			news = (News) criteria.uniqueResult();

		}
                		news.setDate(newsform.getDate());
		news.setDescription(newsform.getDescription());
		news.setTitle(newsform.getTitle());
		news.setRecentlyadded(newsform.isRecentlyadded());
		news.setPoplularity(newsform.getPoplularity());


		
		StringFullfiller.fullfil(news);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		news.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		news.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(news);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostNewsDetail.do", news.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Newss.do", news.getId().toString());
		return null;

		
	}
	
	
}