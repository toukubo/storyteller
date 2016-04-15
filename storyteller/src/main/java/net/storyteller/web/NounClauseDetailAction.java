package net.storyteller.web;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.NounClause;
import net.storyteller.model.NounClauseImpl;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NounClauseDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		NounClause nounclause = new NounClauseImpl();
		Criteria criteria = session.createCriteria(NounClause.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			nounclause = (NounClause) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			nounclause = (NounClause) criteria.uniqueResult();
		}

		req.setAttribute("nounclause",nounclause);
		
		
		
		return mapping.findForward("success");
	}
	
	
}

