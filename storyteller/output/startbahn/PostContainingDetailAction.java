package net.startbahn.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.beans.*;


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


public class PostContainingDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Containing containing = new ContainingImpl();
		ContainingForm containingform = new ContainingForm();
		Criteria criteria = session.createCriteria(Containing.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			containing = (Containing) criteria.uniqueResult();
			new CopyProperties(containing,containingform);
		} else if(req.getAttribute("form")!=null){
                        containingform = (ContainingForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(containingform.getId()));
			containing = (Containing) criteria.uniqueResult();
		}
		

		req.setAttribute("model",containing);
		req.setAttribute("form",containingform);


                  Criteria criteriaWork= session.createCriteria(Work.class);
			req.setAttribute("Works", criteriaWork.list());

Criteria criteriaFolder= session.createCriteria(Folder.class);
			req.setAttribute("Folders", criteriaFolder.list());

 
		
		return mapping.findForward("success");
	}
	
	
}