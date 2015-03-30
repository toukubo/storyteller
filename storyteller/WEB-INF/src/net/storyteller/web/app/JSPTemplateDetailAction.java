package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.JspTemplate;
import net.storyteller.model.JspTemplateImpl;
import net.storyteller.model.Verb;
import net.enclosing.util.HibernateSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class JSPTemplateDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		JspTemplate jsptemplate = new JspTemplateImpl();
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		
		if(req.getParameter("rid") !=null){
			Criteria criteria = session.createCriteria(Verb.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("rid"))));
			Verb verb = (Verb) criteria.uniqueResult();
			jsptemplate.setVerb(verb);
		}else{
			
			Criteria criteria = session.createCriteria(JspTemplate.class);
			
			if (req.getParameter("id") != null
					&& !req.getParameter("id").equals("")) {
				criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
				jsptemplate = (JspTemplate)criteria.uniqueResult();
				
			} else if (req.getAttribute("id") != null
					&& !req.getAttribute("id").equals("")) {
				criteria.add(Restrictions.idEq(req.getAttribute("id")));
				jsptemplate = (JspTemplate)criteria.uniqueResult();
			}
			
			
		}
		
		Criteria criteria2 = session.createCriteria(Verb.class);
		req.setAttribute("Verbs",criteria2.list());
		
		req.setAttribute("jsptemplate", jsptemplate);
		return mapping.findForward("success");
	}
	
	
}

