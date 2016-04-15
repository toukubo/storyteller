package net.storyteller.web.app;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.model.Attr;
import net.storyteller.model.AttrUse;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.J2eeStoryImpl;
import net.storyteller.model.Noun;
import net.storyteller.model.ValidationRule;
import net.storyteller.model.ValidationRuleChoise;
import net.storyteller.model.ValidationRuleChoiseImpl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CreateValidationRuleChoiseFromAttrsOfAJ2eeStory extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		J2eeStory story = new J2eeStoryImpl();
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Criteria criteria = session.createCriteria(J2eeStory.class);
		criteria
				.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		story = (J2eeStory) criteria.uniqueResult();
		req.setAttribute("story", story);
		for (Iterator iter = story.getNouns().iterator(); iter.hasNext();) {
			Noun noun = (Noun) iter.next();
			for (Iterator iterator = noun.getAttrs().iterator(); iterator.hasNext();) {
				Attr attr = (Attr) iterator.next();
				for (Iterator iterator2 = attr.getAttrUses().iterator(); iterator2
						.hasNext();) {
					AttrUse attrUse = (AttrUse) iterator2.next();
					if(attrUse.getAttr().getClasstype().equals("int")){
						if(attrUse.getValidationRuleChoises().size() == 1){
							Criteria criteria3 = session
									.createCriteria(ValidationRule.class);
							criteria3
									.add(Restrictions.eq("name", new String("int")));
							ValidationRule rule = (ValidationRule) criteria3
									.uniqueResult();
							ValidationRuleChoise choise = new ValidationRuleChoiseImpl();
							choise.setAttrUse(attrUse);
							choise.setValidationRule(rule);
							Transaction transaction = session
									.beginTransaction();
							session.saveOrUpdate(choise);
							transaction.commit();
							session.flush();
							
						}
						
					}else if(attrUse.getAttr().getClasstype().equals("String")){
						
					}else if(attrUse.getAttr().getClasstype().equals("Integer")){
						if(attrUse.getValidationRuleChoises().size() == 1){
							Criteria criteria3 = session
									.createCriteria(ValidationRule.class);
							criteria3
									.add(Restrictions.eq("name", new String("int")));
							ValidationRule rule = (ValidationRule) criteria3
									.uniqueResult();
							ValidationRuleChoise choise = new ValidationRuleChoiseImpl();
							choise.setAttrUse(attrUse);
							choise.setValidationRule(rule);
							Transaction transaction = session
									.beginTransaction();
							session.saveOrUpdate(choise);
							transaction.commit();
							session.flush();
							
						}
					}else if(attrUse.getAttr().getClasstype().equals("float")){
						
					}else if(attrUse.getAttr().getClasstype().equals("double")){
						
					}else if(attrUse.getAttr().getClasstype().equals("boolean")){
						
					}else if(attrUse.getAttr().getClasstype().equals("date")){
						if(attrUse.getValidationRuleChoises().size() == 1){
							Criteria criteria3 = session
									.createCriteria(ValidationRule.class);
							criteria3
									.add(Restrictions.eq("name", new String("date")));
							ValidationRule rule = (ValidationRule) criteria3
									.uniqueResult();
							ValidationRuleChoise choise = new ValidationRuleChoiseImpl();
							choise.setAttrUse(attrUse);
							choise.setValidationRule(rule);
							Transaction transaction = session
									.beginTransaction();
							session.saveOrUpdate(choise);
							transaction.commit();
							session.flush();
							
						}
						
					}
				}
			}
		}
		
		new HTTPGetRedirection(req, res, "J2eeStoryDetail.do", story.getId().toString());
		return null;
		
		
		
		
	}
	
	
}
