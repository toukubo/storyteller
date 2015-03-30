package net.keionbu.web;

import net.keionbu.model.*;
import net.keionbu.model.crud.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class InstrumentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Instrument instrument = new InstrumentImpl();
		InstrumentForm instrumentform = (InstrumentForm) form;
		
                
		
		BeanUtils.copyProperties(instrument,instrumentform);
		StringFullfiller.fullfil(instrument);
		if(instrumentform.getId() == null || instrumentform.getId().intValue() == 0){
			instrument.setId(null);
		}else{
			instrument.setId(instrumentform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(instrument);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "InstrumentDetail.do", instrument.getId().toString());
		return null;

		
	}
	
	
}