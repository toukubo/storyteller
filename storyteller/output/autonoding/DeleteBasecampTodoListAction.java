package net.autonoding.web.app;

import net.autonoding.model.*;
import net.autonoding.model.crud.*;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;



public class DeleteBasecampTodoListAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(BasecampTodoList.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));


		BasecampTodoList basecampTodoList = (BasecampTodoList) criteria.uniqueResult();
		session.delete(basecampTodoList);
		transaction.commit();
		session.flush();


		
				new HTTPGetRedirection(req, res, "BasecampTodoLists.do", basecampTodoList.getId().toString());
		return null;

	}
	
	
}