package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.Sentence;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CreatesValuesOfTemplateInputsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Sentence.class);
		criteria.add(Restrictions.idEq(req.getAttribute("id")));
		Sentence sentence = (Sentence) criteria.uniqueResult();
		
		
		//		sentence.setName()
		session.saveOrUpdate(sentence);
		transaction.commit();
		session.flush();

		req.setAttribute("id", sentence.getId());
		
		
		
		
		
		return mapping.findForward("success");
	}
	
	
}

