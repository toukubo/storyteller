package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.beans.ValidationRuleChoiseForm;
import net.storyteller.model.AttrUse;
import net.storyteller.model.Sentence;
import net.storyteller.model.ValidationRule;
import net.storyteller.model.ValidationRuleChoise;
import net.storyteller.model.ValidationRuleChoiseImpl;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostValidationRuleChoiseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ValidationRuleChoise validationrulechoise = new ValidationRuleChoiseImpl();
		ValidationRuleChoiseForm validationrulechoiseform = (ValidationRuleChoiseForm) form;
		
                		Integer attrUseInt = validationrulechoiseform.getAttrUse();
		validationrulechoiseform.setAttrUse(null);
		Integer validationRuleInt = validationrulechoiseform.getValidationRule();
		validationrulechoiseform.setValidationRule(null);

		
                BeanUtils.copyProperties(validationrulechoise,validationrulechoiseform);
		StringFullfiller.fullfil(validationrulechoise);
		if(validationrulechoiseform.getId() == null || validationrulechoiseform.getId().intValue() == 0){
			validationrulechoise.setId(null);
		}else{
			validationrulechoise.setId(validationrulechoiseform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(AttrUse.class);
		criteria2.add(Restrictions.idEq(attrUseInt));
		AttrUse attruse = (AttrUse) criteria2.uniqueResult();
		validationrulechoise.setAttrUse(attruse);
		criteria2 = session.createCriteria(ValidationRule.class);
		criteria2.add(Restrictions.idEq(validationRuleInt));
		ValidationRule validationrule = (ValidationRule) criteria2.uniqueResult();
		validationrulechoise.setValidationRule(validationrule);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(validationrulechoise);
		transaction.commit();
		session.flush();
		
		String idstr  = ((Sentence)validationrulechoise.getAttrUse().getNounUse().getNounClause().getAsfirst().toArray()[0]).getId().toString();
		new HTTPGetRedirection(req, res, "ShowSentence.do", idstr);
		return null;

		
	}
	
	
}