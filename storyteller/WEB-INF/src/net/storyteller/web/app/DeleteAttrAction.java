package net.storyteller.web.app;

import java.util.Iterator;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;



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



public class DeleteAttrAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Criteria criteria = session.createCriteria(Attr.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		


		Attr attr = (Attr) criteria.uniqueResult();
		
		for (Iterator iter = attr.getAttrUses().iterator(); iter.hasNext();) {
			AttrUse	attrUse = (AttrUse) iter.next();
			Transaction transaction = session.beginTransaction();
			session.delete(attrUse);
			transaction.commit();
			session.flush();
			
		}
		Transaction transaction = session.beginTransaction();
		session.delete(attr);
		transaction.commit();
		session.flush();

		new HTTPGetRedirection(req, res, "ShowJ2eeStoryAboutNouns.do", attr.getNoun().getJ2eeStory().getId().toString());
		return null;

	}
	
	
}