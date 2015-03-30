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

public class CopyAPoliceFromAPoliceAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Police.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Police police = (Police) criteria.uniqueResult();
		Police police2 = new PoliceImpl();
		BeanUtils.copyProperties(police2,police);
                police2.setId(null);
		//police2.setSomething(null);
		session.saveOrUpdate(police2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", police2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}