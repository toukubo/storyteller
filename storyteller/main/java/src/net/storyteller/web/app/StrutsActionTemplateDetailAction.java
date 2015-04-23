package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.JspTemplate;
import net.storyteller.model.StrutsActionTemplate;
import net.storyteller.model.StrutsActionTemplateImpl;
import net.storyteller.model.Verb;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class StrutsActionTemplateDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		StrutsActionTemplate strutsactiontemplate = new StrutsActionTemplateImpl();
		Criteria criteria = session.createCriteria(StrutsActionTemplate.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			strutsactiontemplate = (StrutsActionTemplate) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			strutsactiontemplate = (StrutsActionTemplate) criteria.uniqueResult();
		}

		req.setAttribute("strutsactiontemplate",strutsactiontemplate);
		
		
		Criteria criteria2 = session.createCriteria(Verb.class);
		req.setAttribute("Verbs", criteria2.list());
		
		Criteria criteria3 = session.createCriteria(StrutsActionTemplate.class);
		criteria3.add(Restrictions.eq("verb", strutsactiontemplate.getVerb()));
		req.setAttribute("strutsactiontemplates", criteria3.list());
		
		Criteria criteria4 = session.createCriteria(JspTemplate.class);
		criteria4.add(Restrictions.eq("verb", strutsactiontemplate.getVerb()));
		req.setAttribute("jsptemplates", criteria4.list());
		
		return mapping.findForward("success");
	}
	
	
}

