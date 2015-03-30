package net.gasbooknet.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

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


public class GrepPublicUserOnMailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Criteria criteria = session.createCriteria(PublicUser.class);
	    	if(req.getParameter("q") !=null && !req.getParameter("q").equals("")){
	    	   criteria.add(Restrictions.like("mail","%" + new String(req.getParameter("q").getBytes("8859_1"), "UTF-8")  + "%"));
	  	}
		session.flush();
		req.setAttribute("intrausers", criteria.list());
		req.setAttribute("from","GrepPublicUserOnMail");
		return mapping.findForward("success");
	}
}