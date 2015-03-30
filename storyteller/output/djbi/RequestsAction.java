package net.djbi.web.app;

import net.djbi.model.*;
import net.djbi.beans.*;

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


public class RequestsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Request.class);
                

if(StringUtils.isNotBlank(req.getParameter("acknowleged"))){   if(req.getParameter("acknowleged").equals("true")){
      criteria.add(Restrictions.eq("acknowleged",true));
   }else{
      criteria.add(Restrictions.eq("acknowleged",false));
   }
}

		if(StringUtils.isNotBlank(req.getParameter("user"))) {
			Criteria criteria2 = session.createCriteria(User.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("user"))));
			User user = (User) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("user", user));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("requests",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Request request = (Request) iter.next();
//			vector.add(request);
//		}
		Request request = new RequestImpl();
		RequestForm requestform = new RequestForm();
		criteria = session.createCriteria(Request.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			request = (Request) criteria.uniqueResult();
			new CopyProperties(request,requestform);
		} else if(req.getAttribute("form")!=null){
                        requestform = (RequestForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(requestform.getId()));
			request = (Request) criteria.uniqueResult();
		}
		

		req.setAttribute("model",request);
		req.setAttribute("form",requestform);
		
		


                  Criteria criteriaUser= session.createCriteria(User.class);
			req.setAttribute("Users", criteriaUser.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}