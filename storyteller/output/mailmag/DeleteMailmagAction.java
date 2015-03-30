package net.mailmag.web.app;

import net.mailmag.model.*;
import net.mailmag.model.crud.*;



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



public class DeleteMailmagAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Mailmag.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));


		Mailmag mailmag = (Mailmag) criteria.uniqueResult();
		session.delete(mailmag);
		transaction.commit();
		session.flush();


		
				new HTTPGetRedirection(req, res, "Mailmags.do", mailmag.getId().toString());
		return null;

	}
	
	
}