package net.keionbu.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.keionbu.model.*;
import net.keionbu.model.crud.*;


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

public class CopyAStaticDataFromAStaticDataAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(StaticData.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		StaticData staticData = (StaticData) criteria.uniqueResult();
		StaticData staticData2 = new StaticDataImpl();
		BeanUtils.copyProperties(staticData2,staticData);
                staticData2.setId(null);
		//staticData2.setSomething(null);
		session.saveOrUpdate(staticData2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", staticData2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}