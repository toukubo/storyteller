package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.model.crud.*;



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



public class DeleteBbsCommentAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(BbsComment.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));


		BbsComment bbsComment = (BbsComment) criteria.uniqueResult();
		session.delete(bbsComment);
		transaction.commit();
		session.flush();


		
				new HTTPGetRedirection(req, res, "BbsComments.do", bbsComment.getId().toString());
		return null;

	}
	
	
}