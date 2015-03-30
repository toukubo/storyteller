package net.tonersaver.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.tonersaver.model.*;
import net.tonersaver.beans.*;


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


public class PostPolicyDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Policy policy = new PolicyImpl();
		PolicyForm policyform = new PolicyForm();
		Criteria criteria = session.createCriteria(Policy.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			policy = (Policy) criteria.uniqueResult();
			new CopyProperties(policy,policyform);
		} else if(req.getAttribute("form")!=null){
                        policyform = (PolicyForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(policyform.getId()));
			policy = (Policy) criteria.uniqueResult();
		}
		

		req.setAttribute("model",policy);
		req.setAttribute("form",policyform);


                   
		
		return mapping.findForward("success");
	}
	
	
}