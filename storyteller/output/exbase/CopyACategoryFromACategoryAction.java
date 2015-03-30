package net.exbase.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.exbase.model.*;
import net.exbase.model.crud.*;


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

public class CopyACategoryFromACategoryAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Category.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Category category = (Category) criteria.uniqueResult();
		Category category2 = new CategoryImpl();
		BeanUtils.copyProperties(category2,category);
                category2.setId(null);
		//category2.setSomething(null);
		session.saveOrUpdate(category2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", category2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}