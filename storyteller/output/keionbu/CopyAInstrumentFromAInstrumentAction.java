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

public class CopyAInstrumentFromAInstrumentAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Instrument.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		Instrument instrument = (Instrument) criteria.uniqueResult();
		Instrument instrument2 = new InstrumentImpl();
		BeanUtils.copyProperties(instrument2,instrument);
                instrument2.setId(null);
		//instrument2.setSomething(null);
		session.saveOrUpdate(instrument2);
		transaction.commit();
		session.flush();

		req.setAttribute("id", instrument2.getId());
		
		
		return mapping.findForward("success");
	}
	
	
}