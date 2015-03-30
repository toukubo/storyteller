package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class BasecampTodosAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(BasecampTodo.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			BasecampTodo basecampTodo = (BasecampTodo) iter.next();
			vector.add(basecampTodo);
		}
		BasecampTodo basecampTodo = new BasecampTodoImpl();
		BasecampTodoForm basecampTodoform = new BasecampTodoForm();
		criteria = session.createCriteria(BasecampTodo.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			basecampTodo = (BasecampTodo) criteria.uniqueResult();
			new CopyProperties(basecampTodo,basecampTodoform);
		} else if(req.getAttribute("form")!=null){
                        basecampTodoform = (BasecampTodoForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(basecampTodoform.getId()));
			basecampTodo = (BasecampTodo) criteria.uniqueResult();
		}
		

		req.setAttribute("model",basecampTodo);
		req.setAttribute("form",basecampTodoform);
		
		
		req.setAttribute("basecampTodos",vector);


                  Criteria criteriaBasecampTodoList= session.createCriteria(BasecampTodoList.class);
			req.setAttribute("BasecampTodoLists", criteriaBasecampTodoList.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}