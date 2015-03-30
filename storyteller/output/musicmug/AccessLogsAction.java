package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

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


public class AccessLogsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(AccessLog.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			AccessLog accessLog = (AccessLog) iter.next();
			vector.add(accessLog);
		}
		AccessLog accessLog = new AccessLogImpl();
		AccessLogForm accessLogform = new AccessLogForm();
		criteria = session.createCriteria(AccessLog.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			accessLog = (AccessLog) criteria.uniqueResult();
			new CopyProperties(accessLog,accessLogform);
		} else if(req.getAttribute("form")!=null){
                        accessLogform = (AccessLogForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(accessLogform.getId()));
			accessLog = (AccessLog) criteria.uniqueResult();
		}
		

		req.setAttribute("model",accessLog);
		req.setAttribute("form",accessLogform);
		
		
		req.setAttribute("accessLogs",vector);


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}