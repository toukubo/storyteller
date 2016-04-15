package net.storyteller.web;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

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

public class NounClausesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(NounClause.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			NounClause nounclause = (NounClause) iter.next();
			vector.add(nounclause);
		}
		NounClause nounclause = new NounClauseImpl();
		Criteria criteria2 = session.createCriteria(NounClause.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria2.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			nounclause = (NounClause) criteria2.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria2.add(Restrictions.idEq(req.getAttribute("id")));
			nounclause = (NounClause) criteria2.uniqueResult();
		}

		req.setAttribute("nounclause",nounclause);

		
		req.setAttribute("nounclauses",vector);
		
		return mapping.findForward("success");
	}
	
	
}
