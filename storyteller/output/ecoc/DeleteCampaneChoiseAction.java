package net.ecoc.web.app;

import net.ecoc.model.*;
import net.ecoc.model.crud.*;



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



public class DeleteCampaneChoiseAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(CampaneChoise.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));


		CampaneChoise campaneChoise = (CampaneChoise) criteria.uniqueResult();
		session.delete(campaneChoise);
		transaction.commit();
		session.flush();


		
				new HTTPGetRedirection(req, res, "CampaneChoises.do", campaneChoise.getId().toString());
		return null;

	}
	
	
}