package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostBasecampTodoVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		BasecampTodo basecampTodo = new BasecampTodoImpl();
		BasecampTodoForm basecampTodoform = (BasecampTodoForm) form;

                String error = "";


                		Integer basecampTodoListInt = basecampTodoform.getBasecampTodoList();
		basecampTodoform.setBasecampTodoList(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(basecampTodoform.getId() == null || basecampTodoform.getId().intValue() == 0){
			basecampTodo.setId(null);
			basecampTodoform.setId(null);
		}else{
			basecampTodo.setId(basecampTodoform.getId());
			Criteria criteria = session.createCriteria(BasecampTodo.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			basecampTodo = (BasecampTodo) criteria.uniqueResult();

		}
                		basecampTodo.setContent(basecampTodoform.getContent());
		basecampTodo.setOrdernum(basecampTodoform.getOrdernum());
		basecampTodo.setDone(basecampTodoform.isDone());


		
		StringFullfiller.fullfil(basecampTodo);
                		Criteria criteria2 = session.createCriteria(BasecampTodoList.class);
		criteria2.add(Restrictions.idEq(basecampTodoListInt));
		BasecampTodoList basecamptodolist = (BasecampTodoList) criteria2.uniqueResult();
		basecampTodo.setBasecampTodoList(basecamptodolist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(basecampTodo);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBasecampTodoDetail.do", basecampTodo.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "BasecampTodos.do", basecampTodo.getId().toString());
		return null;

		
	}
	
	
}