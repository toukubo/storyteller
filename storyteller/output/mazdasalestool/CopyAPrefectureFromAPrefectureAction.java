package net.mazdasalestool.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mazdasalestool.model.*;
import net.mazdasalestool.model.crud.*;


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

public class CopyAPrefectureFromAPrefectureAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Prefecture.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Prefecture prefecture = (Prefecture) criteria.uniqueResult();
		Prefecture prefecture2 = new PrefectureImpl();
		BeanUtils.copyProperties(prefecture2,prefecture);
                prefecture2.setId(null);
		//prefecture2.setSomething(null);
		session.saveOrUpdate(prefecture2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", prefecture2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}