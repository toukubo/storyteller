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


public class PostInvitationSetDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		InvitationSet invitationSet = new InvitationSetImpl();
		InvitationSetForm invitationSetform = new InvitationSetForm();
		Criteria criteria = session.createCriteria(InvitationSet.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			invitationSet = (InvitationSet) criteria.uniqueResult();
			new CopyProperties(invitationSet,invitationSetform);
		} else if(req.getAttribute("form")!=null){
                        invitationSetform = (InvitationSetForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(invitationSetform.getId()));
			invitationSet = (InvitationSet) criteria.uniqueResult();
		}
		

		req.setAttribute("model",invitationSet);
		req.setAttribute("form",invitationSetform);


                   
		
		return mapping.findForward("success");
	}
	
	
}