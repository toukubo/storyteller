package net.keionbu.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.keionbu.model.*;
import net.keionbu.beans.*;


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
import net.storyteller.desktop.CopyProperties;


public class PostInstrumentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Instrument instrument = new InstrumentImpl();
		InstrumentForm instrumentform = new InstrumentForm();
		Criteria criteria = session.createCriteria(Instrument.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			instrument = (Instrument) criteria.uniqueResult();
			new CopyProperties(instrument,instrumentform);
		} else if(req.getAttribute("form")!=null){
                        instrumentform = (InstrumentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(instrumentform.getId()));
			instrument = (Instrument) criteria.uniqueResult();
		}
		

		req.setAttribute("model",instrument);
		req.setAttribute("form",instrumentform);


                   
		
		return mapping.findForward("success");
	}
	
	
}