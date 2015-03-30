package net.evaid.web.app;

import net.evaid.model.*;
import net.evaid.beans.*;

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
import org.hibernate.criterion.Restrictions;


public class PostExchangeVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Exchange exchange = new ExchangeImpl();
		ExchangeForm exchangeform = (ExchangeForm) form;

                String error = "";


                		Integer topublicuserInt = exchangeform.getTopublicuser();
		exchangeform.setTopublicuser(null);
		Integer frompublicuserInt = exchangeform.getFrompublicuser();
		exchangeform.setFrompublicuser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(exchangeform.getId() == null || exchangeform.getId().intValue() == 0){
			exchange.setId(null);
			exchangeform.setId(null);
		}else{
			exchange.setId(exchangeform.getId());
			Criteria criteria = session.createCriteria(Exchange.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			exchange = (Exchange) criteria.uniqueResult();

		}
                		exchange.setDate(exchangeform.getDate());


		
		StringFullfiller.fullfil(exchange);
                		Criteria criteria2 = session.createCriteria(Topublicuser.class);
		criteria2.add(Restrictions.idEq(topublicuserInt));
		Topublicuser topublicuser = (Topublicuser) criteria2.uniqueResult();
		exchange.setTopublicuser(topublicuser);
		criteria2 = session.createCriteria(Frompublicuser.class);
		criteria2.add(Restrictions.idEq(frompublicuserInt));
		Frompublicuser frompublicuser = (Frompublicuser) criteria2.uniqueResult();
		exchange.setFrompublicuser(frompublicuser);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(exchange);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostExchangeDetail.do", exchange.getId().toString(),"success=true");
		return null;

		
	}
	
	
}