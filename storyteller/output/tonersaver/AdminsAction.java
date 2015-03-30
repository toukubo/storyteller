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


public class AdminsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="AdminsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Admin.class);
                


if(StringUtils.isNotBlank(req.getParameter("passwordchanged"))){   if(req.getParameter("passwordchanged").equals("true")){
      criteria.add(Restrictions.eq("passwordchanged",true));
   }else{
      criteria.add(Restrictions.eq("passwordchanged",false));
   }
}


		if(StringUtils.isNotBlank(req.getParameter("priviledge"))) {
			Criteria criteria2 = session.createCriteria(Priviledge.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("priviledge"))));
			Priviledge priviledge = (Priviledge) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("priviledge", priviledge));
		}
 




if(StringUtils.isNotBlank(req.getParameter("displayssummery"))){   if(req.getParameter("displayssummery").equals("true")){
      criteria.add(Restrictions.eq("displayssummery",true));
   }else{
      criteria.add(Restrictions.eq("displayssummery",false));
   }
}


		req.setAttribute("admins",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Admin admin = (Admin) iter.next();
//			vector.add(admin);
//		}
		Admin admin = new AdminImpl();
		AdminForm adminform = new AdminForm();
		criteria = session.createCriteria(Admin.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			admin = (Admin) criteria.uniqueResult();
			new CopyProperties(admin,adminform);
		} else if(req.getAttribute("form")!=null){
                        adminform = (AdminForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(adminform.getId()));
			admin = (Admin) criteria.uniqueResult();
		}
		

		req.setAttribute("model",admin);
		req.setAttribute("form",adminform);
		
		
//</snippet>

                  Criteria criteriaPriviledge= session.createCriteria(Priviledge.class);
			req.setAttribute("Priviledges", criteriaPriviledge.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}