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


public class PostWorkCommentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		WorkComment workComment = new WorkCommentImpl();
		WorkCommentForm workCommentform = new WorkCommentForm();
		Criteria criteria = session.createCriteria(WorkComment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			workComment = (WorkComment) criteria.uniqueResult();
			new CopyProperties(workComment,workCommentform);
		} else if(req.getAttribute("form")!=null){
                        workCommentform = (WorkCommentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(workCommentform.getId()));
			workComment = (WorkComment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",workComment);
		req.setAttribute("form",workCommentform);


                  Criteria criteriaWork= session.createCriteria(Work.class);
			req.setAttribute("Works", criteriaWork.list());

 
		
		return mapping.findForward("success");
	}
	
	
}