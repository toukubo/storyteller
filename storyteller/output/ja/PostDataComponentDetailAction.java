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


public class PostDataComponentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		DataComponent dataComponent = new DataComponentImpl();
		DataComponentForm dataComponentform = new DataComponentForm();
		Criteria criteria = session.createCriteria(DataComponent.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			dataComponent = (DataComponent) criteria.uniqueResult();
			new CopyProperties(dataComponent,dataComponentform);
		} else if(req.getAttribute("form")!=null){
                        dataComponentform = (DataComponentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(dataComponentform.getId()));
			dataComponent = (DataComponent) criteria.uniqueResult();
		}
		

		req.setAttribute("model",dataComponent);
		req.setAttribute("form",dataComponentform);


                  Criteria criteriaAttr= session.createCriteria(Attr.class);
			req.setAttribute("Attrs", criteriaAttr.list());

Criteria criteriaComponent= session.createCriteria(Component.class);
			req.setAttribute("Components", criteriaComponent.list());

 
		
		return mapping.findForward("success");
	}
	
	
}