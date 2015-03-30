package net.storyteller.web;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.AttrUse;
import net.storyteller.model.EstimationChoise;
import net.storyteller.model.Jsp;
import net.storyteller.model.NounUse;
import net.storyteller.model.Sentence;
import net.storyteller.model.StrutsAction;
import net.storyteller.model.Test;
import net.storyteller.model.ValidationRuleChoise;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;



public class DeleteSentenceAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Sentence.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));


		Sentence sentence = (Sentence) criteria.uniqueResult();
		for (Iterator iterator = sentence.getJsps().iterator(); iterator.hasNext();) {
			Jsp jsp = (Jsp) iterator.next();
			for (Iterator iter2 = jsp.getTests().iterator(); iter2
					.hasNext();) {
				Test test = (Test) iter2.next();
				for (Iterator iterator2 = test.getEstimationChoises().iterator(); iterator2
						.hasNext();) {
					EstimationChoise estimationChoise = (EstimationChoise) iterator2.next();
					session.delete(estimationChoise);
				}
				session.delete(test);
			}
			session.delete(jsp);
		}
		for (Iterator iterator = sentence.getStrutsActions().iterator(); iterator.hasNext();) {
			StrutsAction strutsAction = (StrutsAction) iterator.next();
			session.delete(strutsAction);
		}
		for (Iterator iterator = sentence.getFirstobjective().getOfuse().iterator(); iterator.hasNext();) {
			NounUse nounUse = (NounUse)iterator.next();
			for (Iterator iterator2 = nounUse.getAttrUses().iterator(); iterator2
					.hasNext();) {
				AttrUse attrUse = (AttrUse) iterator2.next();
				for (Iterator iter3 = attrUse.getValidationRuleChoises().iterator(); iter3
						.hasNext();) {
					ValidationRuleChoise validationRuleChoise = (ValidationRuleChoise) iter3.next();
					session.delete(validationRuleChoise);
				}
				session.delete(attrUse);
			}
			session.delete(nounUse);
		}
		if(sentence.getSecountobjective()!=null){
			for (Iterator iterator = sentence.getSecountobjective().getOfuse().iterator(); iterator.hasNext();) {
				NounUse nounUse = (NounUse)iterator.next();
				for (Iterator iterator2 = nounUse.getAttrUses().iterator(); iterator2
						.hasNext();) {
					AttrUse attrUse = (AttrUse) iterator2.next();
					for (Iterator iter3 = attrUse.getValidationRuleChoises().iterator(); iter3
							.hasNext();) {
						ValidationRuleChoise validationRuleChoise = (ValidationRuleChoise) iter3.next();
						session.delete(validationRuleChoise);
					}
					session.delete(attrUse);
				}
				session.delete(nounUse);
			}
		}
		
		session.delete(sentence);
		transaction.commit();
		session.flush();


		
		
		
		
		
		return mapping.findForward("success");
	}
	
	
}
