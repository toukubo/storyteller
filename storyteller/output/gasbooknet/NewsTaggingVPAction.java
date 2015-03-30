package net.gasbooknet.web;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

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

public class NewsTaggingVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		NewsTagging newsTagging = new NewsTaggingImpl();
		NewsTaggingForm newsTaggingform = (NewsTaggingForm) form;
		
                		Integer tagInt = newsTaggingform.getTag();
		newsTaggingform.setTag(null);
		Integer newsInt = newsTaggingform.getNews();
		newsTaggingform.setNews(null);

		
		BeanUtils.copyProperties(newsTagging,newsTaggingform);
		StringFullfiller.fullfil(newsTagging);
		if(newsTaggingform.getId() == null || newsTaggingform.getId().intValue() == 0){
			newsTagging.setId(null);
		}else{
			newsTagging.setId(newsTaggingform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Tag.class);
		criteria2.add(Restrictions.idEq(tagInt));
		Tag tag = (Tag) criteria2.uniqueResult();
		newsTagging.setTag(tag);
		criteria2 = session.createCriteria(News.class);
		criteria2.add(Restrictions.idEq(newsInt));
		News news = (News) criteria2.uniqueResult();
		newsTagging.setNews(news);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(newsTagging);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "NewsTaggingDetail.do", newsTagging.getId().toString());
		return null;

		
	}
	
	
}