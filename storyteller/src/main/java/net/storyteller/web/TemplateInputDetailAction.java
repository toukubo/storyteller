package net.storyteller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

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

public class TemplateInputDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		TemplateInput templateinput = new TemplateInputImpl();
		Criteria criteria = session.createCriteria(TemplateInput.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			templateinput = (TemplateInput) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			templateinput = (TemplateInput) criteria.uniqueResult();
		}
		if(req.getParameter("rid")!=null){
			Criteria criteria2 = session.createCriteria(Verb.class);
			criteria2.add(Restrictions.eq("id", Integer.valueOf(req.getParameter("rid"))));
			Verb verb = (Verb) criteria2.uniqueResult();;
			templateinput.setVerb(verb);
		}

		req.setAttribute("templateinput",templateinput);
		
		
		
		return mapping.findForward("success");
	}
	
	
}

