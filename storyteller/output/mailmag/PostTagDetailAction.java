package net.mailmag.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mailmag.model.*;
import net.mailmag.beans.*;


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


public class PostTagDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Tag tag = new TagImpl();
		TagForm tagform = new TagForm();
		Criteria criteria = session.createCriteria(Tag.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			tag = (Tag) criteria.uniqueResult();
			new CopyProperties(tag,tagform);
		} else if(req.getAttribute("form")!=null){
                        tagform = (TagForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(tagform.getId()));
			tag = (Tag) criteria.uniqueResult();
		}
		

		req.setAttribute("model",tag);
		req.setAttribute("form",tagform);


                   
		
		return mapping.findForward("success");
	}
	
	
}