package net.startbahn.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.beans.*;


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


public class PostMarkDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Mark mark = new MarkImpl();
		MarkForm markform = new MarkForm();
		Criteria criteria = session.createCriteria(Mark.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			mark = (Mark) criteria.uniqueResult();
			new CopyProperties(mark,markform);
		} else if(req.getAttribute("form")!=null){
                        markform = (MarkForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(markform.getId()));
			mark = (Mark) criteria.uniqueResult();
		}
		

		req.setAttribute("model",mark);
		req.setAttribute("form",markform);


                   
		
		return mapping.findForward("success");
	}
	
	
}