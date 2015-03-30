package net.keionbu.web.app;

import net.keionbu.model.*;
import net.keionbu.beans.*;

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


public class PostInstrumentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Instrument instrument = new InstrumentImpl();
		InstrumentForm instrumentform = (InstrumentForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(instrumentform.getId() == null || instrumentform.getId().intValue() == 0){
			instrument.setId(null);
			instrumentform.setId(null);
		}else{
			instrument.setId(instrumentform.getId());
			Criteria criteria = session.createCriteria(Instrument.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			instrument = (Instrument) criteria.uniqueResult();

		}
                		instrument.setName(instrumentform.getName());


		
		StringFullfiller.fullfil(instrument);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(instrument);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostInstrumentDetail.do", instrument.getId().toString());
		return null;

		
	}
	
	
}