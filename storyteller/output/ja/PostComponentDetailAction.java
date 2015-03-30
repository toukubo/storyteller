package net.ja.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ja.model.*;
import net.ja.beans.*;


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


public class PostComponentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Component component = new ComponentImpl();
		ComponentForm componentform = new ComponentForm();
		Criteria criteria = session.createCriteria(Component.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			component = (Component) criteria.uniqueResult();
			new CopyProperties(component,componentform);
		} else if(req.getAttribute("form")!=null){
                        componentform = (ComponentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(componentform.getId()));
			component = (Component) criteria.uniqueResult();
		}
		

		req.setAttribute("model",component);
		req.setAttribute("form",componentform);


                  Criteria criteriaDataComponent= session.createCriteria(DataComponent.class);
			req.setAttribute("DataComponents", criteriaDataComponent.list());

Criteria criteriaPageLayout= session.createCriteria(PageLayout.class);
			req.setAttribute("PageLayouts", criteriaPageLayout.list());

Criteria criteriaLabel= session.createCriteria(Label.class);
			req.setAttribute("Labels", criteriaLabel.list());

 
		
		return mapping.findForward("success");
	}
	
	
}