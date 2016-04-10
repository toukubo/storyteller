package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.beans.*;


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


public class PostContributionTypeDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ContributionType contributionType = new ContributionTypeImpl();
		ContributionTypeForm contributionTypeform = new ContributionTypeForm();
		Criteria criteria = session.createCriteria(ContributionType.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			contributionType = (ContributionType) criteria.uniqueResult();
			new CopyProperties(contributionType,contributionTypeform);
		} else if(req.getAttribute("form")!=null){
                        contributionTypeform = (ContributionTypeForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(contributionTypeform.getId()));
			contributionType = (ContributionType) criteria.uniqueResult();
		}
		

		req.setAttribute("model",contributionType);
		req.setAttribute("form",contributionTypeform);


                   
		
		return mapping.findForward("success");
	}
	
	
}