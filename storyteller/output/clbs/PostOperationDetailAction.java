package net.clbs.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.clbs.model.*;
import net.clbs.beans.*;


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


public class PostOperationDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Operation operation = new OperationImpl();
		OperationForm operationform = new OperationForm();
		Criteria criteria = session.createCriteria(Operation.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			operation = (Operation) criteria.uniqueResult();
			new CopyProperties(operation,operationform);
		} else if(req.getAttribute("form")!=null){
                        operationform = (OperationForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(operationform.getId()));
			operation = (Operation) criteria.uniqueResult();
		}
		

		req.setAttribute("model",operation);
		req.setAttribute("form",operationform);


                  Criteria criteriaCaseUser= session.createCriteria(CaseUser.class);
			req.setAttribute("CaseUsers", criteriaCaseUser.list());

Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

 
		
		return mapping.findForward("success");
	}
	
	
}