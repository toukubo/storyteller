package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class CollectorsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Collector.class);
                
		if(StringUtils.isNotBlank(req.getParameter("publicUser"))) {
			Criteria criteria2 = session.createCriteria(PublicUser.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("publicUser"))));
			PublicUser publicUser = (PublicUser) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("publicUser", publicUser));
		}
 




		req.setAttribute("collectors",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Collector collector = (Collector) iter.next();
//			vector.add(collector);
//		}
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
		
		


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}