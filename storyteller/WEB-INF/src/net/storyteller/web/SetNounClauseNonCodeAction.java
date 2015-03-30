package net.storyteller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

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


public class SetNounClauseNonIdAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(NounClause.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		NounClause nounclause = (NounClause) criteria.uniqueResult();
		nounclause.setId(false);
		session.saveOrUpdate(nounclause);
		transaction.commit();
		session.flush();


		req.setAttribute("id", nounclause.getId());

		
		
		return mapping.findForward("success");
	}
	
	
}