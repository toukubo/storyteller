package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

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


public class TransitsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Transit.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Transit transit = (Transit) iter.next();
			vector.add(transit);
		}
		Transit transit = new TransitImpl();
		TransitForm transitform = new TransitForm();
		criteria = session.createCriteria(Transit.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			transit = (Transit) criteria.uniqueResult();
			new CopyProperties(transit,transitform);
		} else if(req.getAttribute("form")!=null){
                        transitform = (TransitForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(transitform.getId()));
			transit = (Transit) criteria.uniqueResult();
		}
		

		req.setAttribute("model",transit);
		req.setAttribute("form",transitform);
		
		
		req.setAttribute("transits",vector);


                  Criteria criteriaTask= session.createCriteria(Task.class);
			req.setAttribute("Tasks", criteriaTask.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}