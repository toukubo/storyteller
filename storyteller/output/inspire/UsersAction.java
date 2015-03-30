package net.inspire.web.app;

import net.inspire.model.*;
import net.inspire.beans.*;

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


public class UsersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="UsersAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(User.class);
                
		req.setAttribute("users",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			User user = (User) iter.next();
//			vector.add(user);
//		}
		User user = new UserImpl();
		UserForm userform = new UserForm();
		criteria = session.createCriteria(User.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			user = (User) criteria.uniqueResult();
			new CopyProperties(user,userform);
		} else if(req.getAttribute("form")!=null){
                        userform = (UserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(userform.getId()));
			user = (User) criteria.uniqueResult();
		}
		

		req.setAttribute("model",user);
		req.setAttribute("form",userform);
		
		
//</snippet>

                   

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportUsersAction csvExportUsersAction 
//                               = new CsvExportUsersAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}