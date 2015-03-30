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


public class PrivilegesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Privilege.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Privilege privilege = (Privilege) iter.next();
			vector.add(privilege);
		}
		Privilege privilege = new PrivilegeImpl();
		PrivilegeForm privilegeform = new PrivilegeForm();
		criteria = session.createCriteria(Privilege.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			privilege = (Privilege) criteria.uniqueResult();
			new CopyProperties(privilege,privilegeform);
		} else if(req.getAttribute("form")!=null){
                        privilegeform = (PrivilegeForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(privilegeform.getId()));
			privilege = (Privilege) criteria.uniqueResult();
		}
		

		req.setAttribute("model",privilege);
		req.setAttribute("form",privilegeform);
		
		
		req.setAttribute("privileges",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}