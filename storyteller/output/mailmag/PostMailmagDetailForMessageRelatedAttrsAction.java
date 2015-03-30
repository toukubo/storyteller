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


public class PostMailmagDetailForMessageRelatedAttrsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Mailmag mailmag = new MailmagImpl();
		MailmagForm mailmagform = new MailmagForm();
		Criteria criteria = session.createCriteria(Mailmag.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			mailmag = (Mailmag) criteria.uniqueResult();
			new CopyProperties(mailmag,mailmagform);
		} else if(req.getAttribute("form")!=null){
                        mailmagform = (MailmagForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(mailmagform.getId()));
			mailmag = (Mailmag) criteria.uniqueResult();
		}
		

		req.setAttribute("model",mailmag);
		req.setAttribute("form",mailmagform);


                   
		
		return mapping.findForward("success");
	}
	
	
}