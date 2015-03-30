package net.autolink.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.autolink.model.*;
import net.autolink.beans.*;


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


public class PostKeywordDetailForQuotesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Keyword keyword = new KeywordImpl();
		KeywordForm keywordform = new KeywordForm();
		Criteria criteria = session.createCriteria(Keyword.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			keyword = (Keyword) criteria.uniqueResult();
			new CopyProperties(keyword,keywordform);
		} else if(req.getAttribute("form")!=null){
                        keywordform = (KeywordForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(keywordform.getId()));
			keyword = (Keyword) criteria.uniqueResult();
		}
		

		req.setAttribute("model",keyword);
		req.setAttribute("form",keywordform);


                   
		
		return mapping.findForward("success");
	}
	
	
}