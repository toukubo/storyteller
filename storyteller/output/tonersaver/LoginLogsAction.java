package net.tonersaver.web.app;

import net.tonersaver.model.*;
import net.tonersaver.beans.*;

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


public class LoginLogsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="LoginLogsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(LoginLog.class);
                



		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}

		if(StringUtils.isNotBlank(req.getParameter("admin"))) {
			Criteria criteria2 = session.createCriteria(Admin.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("admin"))));
			Admin admin = (Admin) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("admin", admin));
		}
 

		req.setAttribute("loginLogs",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			LoginLog loginLog = (LoginLog) iter.next();
//			vector.add(loginLog);
//		}
		LoginLog loginLog = new LoginLogImpl();
		LoginLogForm loginLogform = new LoginLogForm();
		criteria = session.createCriteria(LoginLog.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			loginLog = (LoginLog) criteria.uniqueResult();
			new CopyProperties(loginLog,loginLogform);
		} else if(req.getAttribute("form")!=null){
                        loginLogform = (LoginLogForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(loginLogform.getId()));
			loginLog = (LoginLog) criteria.uniqueResult();
		}
		

		req.setAttribute("model",loginLog);
		req.setAttribute("form",loginLogform);
		
		
//</snippet>

                  Criteria criteriaAdmin= session.createCriteria(Admin.class);
			req.setAttribute("Admins", criteriaAdmin.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}