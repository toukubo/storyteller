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

public class CopyAExhibitionReportUsedFromAExhibitionReportUsedAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(ExhibitionReportUsed.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		ExhibitionReportUsed exhibitionReportUsed = (ExhibitionReportUsed) criteria.uniqueResult();
		ExhibitionReportUsed exhibitionReportUsed2 = new ExhibitionReportUsedImpl();
		BeanUtils.copyProperties(exhibitionReportUsed2,exhibitionReportUsed);
                exhibitionReportUsed2.setId(null);
		//exhibitionReportUsed2.setSomething(null);
		session.saveOrUpdate(exhibitionReportUsed2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", exhibitionReportUsed2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}