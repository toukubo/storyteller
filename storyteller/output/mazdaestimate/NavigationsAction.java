package net.mazdaestimate.web.app;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;

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


public class NavigationsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Navigation.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Navigation navigation = (Navigation) iter.next();
			vector.add(navigation);
		}
		Navigation navigation = new NavigationImpl();
		NavigationForm navigationform = new NavigationForm();
		criteria = session.createCriteria(Navigation.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			navigation = (Navigation) criteria.uniqueResult();
			new CopyProperties(navigation,navigationform);
		} else if(req.getAttribute("form")!=null){
                        navigationform = (NavigationForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(navigationform.getId()));
			navigation = (Navigation) criteria.uniqueResult();
		}
		

		req.setAttribute("model",navigation);
		req.setAttribute("form",navigationform);
		
		
		req.setAttribute("navigations",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}