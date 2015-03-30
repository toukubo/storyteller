package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


                		Integer countryInt = newsform.getCountry();
		newsform.setCountry(null);
		Integer intraUserInt = newsform.getIntraUser();
		newsform.setIntraUser(null);
		Integer cInt = newsform.getC();
		newsform.setC(null);
		Integer genreInt = newsform.getGenre();
		newsform.setGenre(null);
		Integer artistInt = newsform.getArtist();
		newsform.setArtist(null);
		Integer bInt = newsform.getB();
		newsform.setB(null);
		Integer aInt = newsform.getA();
		newsform.setA(null);
		Integer newsTypeInt = newsform.getNewsType();
		newsform.setNewsType(null);
		Integer newsSourceInt = newsform.getNewsSource();
		newsform.setNewsSource(null);
		Integer newsFeatureInt = newsform.getNewsFeature();
		newsform.setNewsFeature(null);

		
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
                		Criteria criteria2 = session.createCriteria(Country.class);
		criteria2.add(Restrictions.idEq(countryInt));
		Country country = (Country) criteria2.uniqueResult();
		news.setCountry(country);
		criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		news.setIntraUser(intrauser);
		criteria2 = session.createCriteria(C.class);
		criteria2.add(Restrictions.idEq(cInt));
		C c = (C) criteria2.uniqueResult();
		news.setC(c);
		criteria2 = session.createCriteria(Genre.class);
		criteria2.add(Restrictions.idEq(genreInt));
		Genre genre = (Genre) criteria2.uniqueResult();
		news.setGenre(genre);
		criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		news.setArtist(artist);
		criteria2 = session.createCriteria(B.class);
		criteria2.add(Restrictions.idEq(bInt));
		B b = (B) criteria2.uniqueResult();
		news.setB(b);
		criteria2 = session.createCriteria(A.class);
		criteria2.add(Restrictions.idEq(aInt));
		A a = (A) criteria2.uniqueResult();
		news.setA(a);
		criteria2 = session.createCriteria(NewsType.class);
		criteria2.add(Restrictions.idEq(newsTypeInt));
		NewsType newstype = (NewsType) criteria2.uniqueResult();
		news.setNewsType(newstype);
		criteria2 = session.createCriteria(NewsSource.class);
		criteria2.add(Restrictions.idEq(newsSourceInt));
		NewsSource newssource = (NewsSource) criteria2.uniqueResult();
		news.setNewsSource(newssource);
		criteria2 = session.createCriteria(NewsFeature.class);
		criteria2.add(Restrictions.idEq(newsFeatureInt));
		NewsFeature newsfeature = (NewsFeature) criteria2.uniqueResult();
		news.setNewsFeature(newsfeature);


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