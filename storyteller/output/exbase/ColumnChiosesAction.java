package net.exbase.web;

import net.exbase.model.*;
import net.exbase.model.crud.*;

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

public class ColumnChiosesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ColumnChiose.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			ColumnChiose columnChiose = (ColumnChiose) iter.next();
			vector.add(columnChiose);
		}
		ColumnChiose columnChiose = new ColumnChioseImpl();
		Criteria criteria2 = session.createCriteria(ColumnChiose.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria2.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			columnChiose = (ColumnChiose) criteria2.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria2.add(Restrictions.idEq(req.getAttribute("id")));
			columnChiose = (ColumnChiose) criteria2.uniqueResult();
		}

		req.setAttribute("columnChiose",columnChiose);

		
		req.setAttribute("columnChioses",vector);
		
		return mapping.findForward("success");
	}
	
	
}