package net.clbs.web.app;

import net.clbs.model.*;
import net.clbs.beans.*;

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


public class CaseUsersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(CaseUser.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			CaseUser caseUser = (CaseUser) iter.next();
			vector.add(caseUser);
		}
		CaseUser caseUser = new CaseUserImpl();
		CaseUserForm caseUserform = new CaseUserForm();
		criteria = session.createCriteria(CaseUser.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			caseUser = (CaseUser) criteria.uniqueResult();
			new CopyProperties(caseUser,caseUserform);
		} else if(req.getAttribute("form")!=null){
                        caseUserform = (CaseUserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(caseUserform.getId()));
			caseUser = (CaseUser) criteria.uniqueResult();
		}
		

		req.setAttribute("model",caseUser);
		req.setAttribute("form",caseUserform);
		
		
		req.setAttribute("caseUsers",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}