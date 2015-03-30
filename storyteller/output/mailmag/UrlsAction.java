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


public class UrlsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Url.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Url url = (Url) iter.next();
			vector.add(url);
		}
		Url url = new UrlImpl();
		UrlForm urlform = new UrlForm();
		criteria = session.createCriteria(Url.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			url = (Url) criteria.uniqueResult();
			new CopyProperties(url,urlform);
		} else if(req.getAttribute("form")!=null){
                        urlform = (UrlForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(urlform.getId()));
			url = (Url) criteria.uniqueResult();
		}
		

		req.setAttribute("model",url);
		req.setAttribute("form",urlform);
		
		
		req.setAttribute("urls",vector);


                  Criteria criteriaMailmag= session.createCriteria(Mailmag.class);
			req.setAttribute("Mailmags", criteriaMailmag.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}