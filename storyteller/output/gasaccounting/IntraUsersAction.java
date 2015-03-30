package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

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
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			IntraUser intrauser = (IntraUser) iter.next();
			vector.add(intrauser);
		}
		IntraUser intrauser = new IntraUserImpl();
		IntraUserForm intrauserform = new IntraUserForm();
		criteria = session.createCriteria(IntraUser.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			intrauser = (IntraUser) criteria.uniqueResult();
			new CopyProperties(intrauser,intrauserform);
		} else if(req.getAttribute("form")!=null){
                        intrauserform = (IntraUserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(intrauserform.getId()));
			intrauser = (IntraUser) criteria.uniqueResult();
		}
		

		req.setAttribute("model",intrauser);
		req.setAttribute("form",intrauserform);
		
		
		req.setAttribute("intrausers",vector);


                  Criteria criteriaPrivilege= session.createCriteria(Privilege.class);
			req.setAttribute("Privileges", criteriaPrivilege.list());

Criteria criteriaIcalFile= session.createCriteria(IcalFile.class);
			req.setAttribute("IcalFiles", criteriaIcalFile.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}