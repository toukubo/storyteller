package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;

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


public class CollectorListAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Collector.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Collector collector = (Collector) iter.next();
			vector.add(collector);
		}
		Collector collector = new CollectorImpl();
		CollectorForm collectorform = new CollectorForm();
		criteria = session.createCriteria(Collector.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			collector = (Collector) criteria.uniqueResult();
			new CopyProperties(collector,collectorform);
		} else if(req.getAttribute("form")!=null){
                        collectorform = (CollectorForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(collectorform.getId()));
			collector = (Collector) criteria.uniqueResult();
		}
		

		req.setAttribute("model",collector);
		req.setAttribute("form",collectorform);
		
		
		req.setAttribute("collectors",vector);
		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}