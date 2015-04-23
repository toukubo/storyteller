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


public class PostContributeDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Contribute contribute = new ContributeImpl();
		ContributeForm contributeform = new ContributeForm();
		Criteria criteria = session.createCriteria(Contribute.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			contribute = (Contribute) criteria.uniqueResult();
			new CopyProperties(contribute,contributeform);
		} else if(req.getAttribute("form")!=null){
                        contributeform = (ContributeForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(contributeform.getId()));
			contribute = (Contribute) criteria.uniqueResult();
		}
		

		req.setAttribute("model",contribute);
		req.setAttribute("form",contributeform);


                  Criteria criteriaContributionType= session.createCriteria(ContributionType.class);
			req.setAttribute("ContributionTypes", criteriaContributionType.list());

Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

 
		
		return mapping.findForward("success");
	}
	
	
}