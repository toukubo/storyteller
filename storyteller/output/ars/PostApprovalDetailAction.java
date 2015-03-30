package net.ars.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ars.model.*;
import net.ars.beans.*;


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


public class PostApprovalDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Approval approval = new ApprovalImpl();
		ApprovalForm approvalform = new ApprovalForm();
		Criteria criteria = session.createCriteria(Approval.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			approval = (Approval) criteria.uniqueResult();
			new CopyProperties(approval,approvalform);
		} else if(req.getAttribute("form")!=null){
                        approvalform = (ApprovalForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(approvalform.getId()));
			approval = (Approval) criteria.uniqueResult();
		}
		

		req.setAttribute("model",approval);
		req.setAttribute("form",approvalform);


                  Criteria criteriaAccident= session.createCriteria(Accident.class);
			req.setAttribute("Accidents", criteriaAccident.list());

 
		
		return mapping.findForward("success");
	}
	
	
}