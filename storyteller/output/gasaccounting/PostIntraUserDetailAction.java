package net.gasaccounting.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

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


public class PostIntraUserDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		IntraUser intrauser = new IntraUserImpl();
		IntraUserForm intrauserform = new IntraUserForm();
		Criteria criteria = session.createCriteria(IntraUser.class);

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


                  Criteria criteriaPrivilege= session.createCriteria(Privilege.class);
			req.setAttribute("Privileges", criteriaPrivilege.list());

 
		
		return mapping.findForward("success");
	}
	
	
}