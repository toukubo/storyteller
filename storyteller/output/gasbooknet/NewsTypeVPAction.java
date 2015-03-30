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

public class NewsTypeVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		NewsType newsType = new NewsTypeImpl();
		NewsTypeForm newsTypeform = (NewsTypeForm) form;
		
                
		
		BeanUtils.copyProperties(newsType,newsTypeform);
		StringFullfiller.fullfil(newsType);
		if(newsTypeform.getId() == null || newsTypeform.getId().intValue() == 0){
			newsType.setId(null);
		}else{
			newsType.setId(newsTypeform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(newsType);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "NewsTypeDetail.do", newsType.getId().toString());
		return null;

		
	}
	
	
}