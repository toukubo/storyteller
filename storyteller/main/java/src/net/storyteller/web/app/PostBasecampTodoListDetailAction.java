package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.beans.*;


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


public class PostBasecampTodoListDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		BasecampTodoList basecampTodoList = new BasecampTodoListImpl();
		BasecampTodoListForm basecampTodoListform = new BasecampTodoListForm();
		Criteria criteria = session.createCriteria(BasecampTodoList.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			basecampTodoList = (BasecampTodoList) criteria.uniqueResult();
			new CopyProperties(basecampTodoList,basecampTodoListform);
		} else if(req.getAttribute("form")!=null){
                        basecampTodoListform = (BasecampTodoListForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(basecampTodoListform.getId()));
			basecampTodoList = (BasecampTodoList) criteria.uniqueResult();
		}
		

		req.setAttribute("model",basecampTodoList);
		req.setAttribute("form",basecampTodoListform);


                  Criteria criteriaBasecampProject= session.createCriteria(BasecampProject.class);
			req.setAttribute("BasecampProjects", criteriaBasecampProject.list());

 
		
		return mapping.findForward("success");
	}
	
	
}