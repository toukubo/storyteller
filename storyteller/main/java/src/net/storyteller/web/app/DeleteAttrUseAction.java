package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.model.AttrUse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;



public class DeleteAttrUseAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(AttrUse.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));


		AttrUse attruse = (AttrUse) criteria.uniqueResult();
		
		String j2eestoryid = attruse.getAttr().getNoun().getJ2eeStory().getId().toString();
		session.delete(attruse);
		transaction.commit();
		session.flush();


		
		new HTTPGetRedirection		(req, res, "J2eeStoryDetail.do", j2eestoryid);
		return null;
	}
	
	
}