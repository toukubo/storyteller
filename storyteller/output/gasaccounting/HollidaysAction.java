package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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


public class HollidaysAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Holliday.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Holliday holliday = (Holliday) iter.next();
			vector.add(holliday);
		}
		Holliday holliday = new HollidayImpl();
		HollidayForm hollidayform = new HollidayForm();
		criteria = session.createCriteria(Holliday.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			holliday = (Holliday) criteria.uniqueResult();
			new CopyProperties(holliday,hollidayform);
		} else if(req.getAttribute("form")!=null){
                        hollidayform = (HollidayForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(hollidayform.getId()));
			holliday = (Holliday) criteria.uniqueResult();
		}
		

		req.setAttribute("model",holliday);
		req.setAttribute("form",hollidayform);
		
		
		req.setAttribute("hollidays",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}