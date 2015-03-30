package net.ja.web.app;

import net.ja.model.*;
import net.ja.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class ComponentsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Component.class);
                
		if(StringUtils.isNotBlank(req.getParameter("dataComponent"))) {
			Criteria criteria2 = session.createCriteria(DataComponent.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("dataComponent"))));
			DataComponent dataComponent = (DataComponent) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("dataComponent", dataComponent));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("pageLayout"))) {
			Criteria criteria2 = session.createCriteria(PageLayout.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("pageLayout"))));
			PageLayout pageLayout = (PageLayout) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("pageLayout", pageLayout));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("label"))) {
			Criteria criteria2 = session.createCriteria(Label.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("label"))));
			Label label = (Label) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("label", label));
		}
 




		req.setAttribute("components",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Component component = (Component) iter.next();
//			vector.add(component);
//		}
		Component component = new ComponentImpl();
		ComponentForm componentform = new ComponentForm();
		criteria = session.createCriteria(Component.class);


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

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}