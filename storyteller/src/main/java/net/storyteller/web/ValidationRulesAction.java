package net.storyteller.web;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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

public class ValidationRulesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ValidationRule.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			ValidationRule validationrule = (ValidationRule) iter.next();
			vector.add(validationrule);
		}
		ValidationRule validationrule = new ValidationRuleImpl();
		Criteria criteria2 = session.createCriteria(ValidationRule.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria2.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			validationrule = (ValidationRule) criteria2.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria2.add(Restrictions.idEq(req.getAttribute("id")));
			validationrule = (ValidationRule) criteria2.uniqueResult();
		}

		req.setAttribute("validationrule",validationrule);

		
		req.setAttribute("validationrules",vector);
		
		return mapping.findForward("success");
	}
	
	
}