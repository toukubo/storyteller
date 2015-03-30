package net.iwager.web.app;

import net.iwager.model.*;
import net.iwager.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class DealersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Dealer.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Dealer dealer = (Dealer) iter.next();
			vector.add(dealer);
		}
		Dealer dealer = new DealerImpl();
		DealerForm dealerform = new DealerForm();
		criteria = session.createCriteria(Dealer.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			dealer = (Dealer) criteria.uniqueResult();
			new CopyProperties(dealer,dealerform);
		} else if(req.getAttribute("form")!=null){
                        dealerform = (DealerForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(dealerform.getId()));
			dealer = (Dealer) criteria.uniqueResult();
		}
		

		req.setAttribute("model",dealer);
		req.setAttribute("form",dealerform);
		
		
		req.setAttribute("dealers",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}