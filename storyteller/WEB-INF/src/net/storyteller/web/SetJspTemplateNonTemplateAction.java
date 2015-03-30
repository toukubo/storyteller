package net.storyteller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

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


public class SetJspTemplateNonIdAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(JspTemplate.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		JspTemplate jsptemplate = (JspTemplate) criteria.uniqueResult();
		jsptemplate.setId(false);
		session.saveOrUpdate(jsptemplate);
		transaction.commit();
		session.flush();


		req.setAttribute("id", jsptemplate.getId());

		
		
		return mapping.findForward("success");
	}
	
	
}