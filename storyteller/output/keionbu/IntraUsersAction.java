package net.keionbu.web.app;

import net.keionbu.model.*;
import net.keionbu.beans.*;

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


public class IntraUsersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(IntraUser.class);
                


if(StringUtils.isNotBlank(req.getParameter("removed"))){   if(req.getParameter("removed").equals("true")){
      criteria.add(Restrictions.eq("removed",true));
   }else{
      criteria.add(Restrictions.eq("removed",false));
   }
}

		if(StringUtils.isNotBlank(req.getParameter("updatedatestartdate")) && StringUtils.isNotBlank(req.getParameter("updatedateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("updatedatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("updatedateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}















		if(StringUtils.isNotBlank(req.getParameter("createdatestartdate")) && StringUtils.isNotBlank(req.getParameter("createdateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("createdatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("createdateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}







		req.setAttribute("intraUsers",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			IntraUser intraUser = (IntraUser) iter.next();
//			vector.add(intraUser);
//		}
		IntraUser intraUser = new IntraUserImpl();
		IntraUserForm intraUserform = new IntraUserForm();
		criteria = session.createCriteria(IntraUser.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			intraUser = (IntraUser) criteria.uniqueResult();
			new CopyProperties(intraUser,intraUserform);
		} else if(req.getAttribute("form")!=null){
                        intraUserform = (IntraUserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(intraUserform.getId()));
			intraUser = (IntraUser) criteria.uniqueResult();
		}
		

		req.setAttribute("model",intraUser);
		req.setAttribute("form",intraUserform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}