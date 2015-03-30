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


public class PostNewsSourceVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		NewsSource newsSource = new NewsSourceImpl();
		NewsSourceForm newsSourceform = (NewsSourceForm) form;

                String error = "";


                		Integer publicUserInt = newsSourceform.getPublicUser();
		newsSourceform.setPublicUser(null);
		Integer partnerMediaInt = newsSourceform.getPartnerMedia();
		newsSourceform.setPartnerMedia(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(newsSourceform.getId() == null || newsSourceform.getId().intValue() == 0){
			newsSource.setId(null);
			newsSourceform.setId(null);
		}else{
			newsSource.setId(newsSourceform.getId());
			Criteria criteria = session.createCriteria(NewsSource.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			newsSource = (NewsSource) criteria.uniqueResult();

		}
                		newsSource.setName(newsSourceform.getName());
		newsSource.setUrl(newsSourceform.getUrl());
		newsSource.setRssurl(newsSourceform.getRssurl());
		newsSource.setDescription(newsSourceform.getDescription());
		newsSource.setOriginal(newsSourceform.isOriginal());


		
		StringFullfiller.fullfil(newsSource);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		newsSource.setPublicUser(publicuser);
		criteria2 = session.createCriteria(PartnerMedia.class);
		criteria2.add(Restrictions.idEq(partnerMediaInt));
		PartnerMedia partnermedia = (PartnerMedia) criteria2.uniqueResult();
		newsSource.setPartnerMedia(partnermedia);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(newsSource);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostNewsSourceDetail.do", newsSource.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "NewsSources.do", newsSource.getId().toString());
		return null;

		
	}
	
	
}