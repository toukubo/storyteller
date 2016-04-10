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

public class CopyAJ2eeStoryFromAJ2eeStoryAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(J2eeStory.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		J2eeStory j2eestory = (J2eeStory) criteria.uniqueResult();
		J2eeStory j2eestory2 = new J2eeStoryImpl();
		BeanUtils.copyProperties(j2eestory2,j2eestory);
                j2eestory2.setId(null);
		//j2eestory2.setSomething(null);
		session.saveOrUpdate(j2eestory2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", j2eestory2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}

