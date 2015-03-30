package net.gasbooknet.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;


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


public class PostNewsFeatureDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		NewsFeature newsFeature = new NewsFeatureImpl();
		NewsFeatureForm newsFeatureform = new NewsFeatureForm();
		Criteria criteria = session.createCriteria(NewsFeature.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			newsFeature = (NewsFeature) criteria.uniqueResult();
			new CopyProperties(newsFeature,newsFeatureform);
		} else if(req.getAttribute("form")!=null){
                        newsFeatureform = (NewsFeatureForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(newsFeatureform.getId()));
			newsFeature = (NewsFeature) criteria.uniqueResult();
		}
		

		req.setAttribute("model",newsFeature);
		req.setAttribute("form",newsFeatureform);


                   
		
		return mapping.findForward("success");
	}
	
	
}