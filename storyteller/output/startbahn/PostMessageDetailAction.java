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


public class PostMessageDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Message message = new MessageImpl();
		MessageForm messageform = new MessageForm();
		Criteria criteria = session.createCriteria(Message.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			message = (Message) criteria.uniqueResult();
			new CopyProperties(message,messageform);
		} else if(req.getAttribute("form")!=null){
                        messageform = (MessageForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(messageform.getId()));
			message = (Message) criteria.uniqueResult();
		}
		

		req.setAttribute("model",message);
		req.setAttribute("form",messageform);


                   
		
		return mapping.findForward("success");
	}
	
	
}