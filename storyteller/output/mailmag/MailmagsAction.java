package net.mailmag.web.app;

import net.mailmag.model.*;
import net.mailmag.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class MailmagsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Mailmag.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Mailmag mailmag = (Mailmag) iter.next();
			vector.add(mailmag);
		}
		Mailmag mailmag = new MailmagImpl();
		MailmagForm mailmagform = new MailmagForm();
		criteria = session.createCriteria(Mailmag.class);


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
		
		
		req.setAttribute("mailmags",vector);


                  Criteria criteriaSite= session.createCriteria(Site.class);
			req.setAttribute("Sites", criteriaSite.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}