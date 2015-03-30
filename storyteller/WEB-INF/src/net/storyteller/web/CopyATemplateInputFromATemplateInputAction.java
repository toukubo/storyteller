package net.storyteller.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;


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

public class CopyATemplateInputFromATemplateInputAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(TemplateInput.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		TemplateInput templateinput = (TemplateInput) criteria.uniqueResult();
		TemplateInput templateinput2 = new TemplateInputImpl();
		BeanUtils.copyProperties(templateinput2,templateinput);
                templateinput2.setId(null);
		//templateinput2.setSomething(null);
		session.saveOrUpdate(templateinput2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", templateinput2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}

