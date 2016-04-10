package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.beans.*;


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


public class PostClientDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Client client = new ClientImpl();
		ClientForm clientform = new ClientForm();
		Criteria criteria = session.createCriteria(Client.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			client = (Client) criteria.uniqueResult();
			new CopyProperties(client,clientform);
		} else if(req.getAttribute("form")!=null){
                        clientform = (ClientForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(clientform.getId()));
			client = (Client) criteria.uniqueResult();
		}
		

		req.setAttribute("model",client);
		req.setAttribute("form",clientform);


                   
		
		return mapping.findForward("success");
	}
	
	
}