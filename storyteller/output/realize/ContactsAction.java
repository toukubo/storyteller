package net.realize.web.app;

import net.realize.model.*;
import net.realize.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class ContactsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="ContactsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Contact.class);
                
		req.setAttribute("contacts",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Contact contact = (Contact) iter.next();
//			vector.add(contact);
//		}
		Contact contact = new ContactImpl();
		ContactForm contactform = new ContactForm();
		criteria = session.createCriteria(Contact.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			contact = (Contact) criteria.uniqueResult();
			new CopyProperties(contact,contactform);
		} else if(req.getAttribute("form")!=null){
                        contactform = (ContactForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(contactform.getId()));
			contact = (Contact) criteria.uniqueResult();
		}
		

		req.setAttribute("model",contact);
		req.setAttribute("form",contactform);
		
		
//</snippet>

                   

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportContactsAction csvExportContactsAction 
//                               = new CsvExportContactsAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}