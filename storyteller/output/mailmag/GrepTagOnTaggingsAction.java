package net.mailmag.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mailmag.model.*;
import net.mailmag.model.crud.*;

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


public class GrepTagOnTaggingsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Criteria criteria = session.createCriteria(Tag.class);
	    	if(req.getParameter("q") !=null && !req.getParameter("q").equals("")){
	    	   criteria.add(Restrictions.like("taggings","%" + new String(req.getParameter("q").getBytes("8859_1"), "UTF-8")  + "%"));
	  	}
		session.flush();
		req.setAttribute("intrausers", criteria.list());
		req.setAttribute("from","GrepTagOnTaggings");
		return mapping.findForward("success");
	}
}