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


public class PostQuoteDetailToBanItAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Quote quote = new QuoteImpl();
		QuoteForm quoteform = new QuoteForm();
		Criteria criteria = session.createCriteria(Quote.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			quote = (Quote) criteria.uniqueResult();
			new CopyProperties(quote,quoteform);
		} else if(req.getAttribute("form")!=null){
                        quoteform = (QuoteForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(quoteform.getId()));
			quote = (Quote) criteria.uniqueResult();
		}
		

		req.setAttribute("model",quote);
		req.setAttribute("form",quoteform);


                  Criteria criteriaKeyword= session.createCriteria(Keyword.class);
			req.setAttribute("Keywords", criteriaKeyword.list());

Criteria criteriaPost= session.createCriteria(Post.class);
			req.setAttribute("Posts", criteriaPost.list());

 
		
		return mapping.findForward("success");
	}
	
	
}