package net.mailmag.web.app;

import net.mailmag.model.*;
import net.mailmag.beans.*;

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


public class PostUrlVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Url url = new UrlImpl();
		UrlForm urlform = (UrlForm) form;

                String error = "";


                		Integer mailmagInt = urlform.getMailmag();
		urlform.setMailmag(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(urlform.getId() == null || urlform.getId().intValue() == 0){
			url.setId(null);
			urlform.setId(null);
		}else{
			url.setId(urlform.getId());
			Criteria criteria = session.createCriteria(Url.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			url = (Url) criteria.uniqueResult();

		}
                		url.setUrl(urlform.getUrl());
		url.setShorturl(urlform.getShorturl());
		url.setClicknum(urlform.getClicknum());


		
		StringFullfiller.fullfil(url);
                		Criteria criteria2 = session.createCriteria(Mailmag.class);
		criteria2.add(Restrictions.idEq(mailmagInt));
		Mailmag mailmag = (Mailmag) criteria2.uniqueResult();
		url.setMailmag(mailmag);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(url);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostUrlDetail.do", url.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Urls.do", url.getId().toString());
		return null;

		
	}
	
	
}