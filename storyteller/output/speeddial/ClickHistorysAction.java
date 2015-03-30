package net.speeddial.web.app;

import net.speeddial.model.*;
import net.speeddial.beans.*;

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


public class ClickHistorysAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ClickHistory.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			ClickHistory clickHistory = (ClickHistory) iter.next();
			vector.add(clickHistory);
		}
		ClickHistory clickHistory = new ClickHistoryImpl();
		ClickHistoryForm clickHistoryform = new ClickHistoryForm();
		criteria = session.createCriteria(ClickHistory.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			clickHistory = (ClickHistory) criteria.uniqueResult();
			new CopyProperties(clickHistory,clickHistoryform);
		} else if(req.getAttribute("form")!=null){
                        clickHistoryform = (ClickHistoryForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(clickHistoryform.getId()));
			clickHistory = (ClickHistory) criteria.uniqueResult();
		}
		

		req.setAttribute("model",clickHistory);
		req.setAttribute("form",clickHistoryform);
		
		
		req.setAttribute("clickHistorys",vector);


                  Criteria criteriaDial= session.createCriteria(Dial.class);
			req.setAttribute("Dials", criteriaDial.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}