package net.speeddial.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.speeddial.model.*;
import net.speeddial.beans.*;


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


public class PostRelationShipStatusDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		RelationShipStatus relationShipStatus = new RelationShipStatusImpl();
		RelationShipStatusForm relationShipStatusform = new RelationShipStatusForm();
		Criteria criteria = session.createCriteria(RelationShipStatus.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			relationShipStatus = (RelationShipStatus) criteria.uniqueResult();
			new CopyProperties(relationShipStatus,relationShipStatusform);
		} else if(req.getAttribute("form")!=null){
                        relationShipStatusform = (RelationShipStatusForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(relationShipStatusform.getId()));
			relationShipStatus = (RelationShipStatus) criteria.uniqueResult();
		}
		

		req.setAttribute("model",relationShipStatus);
		req.setAttribute("form",relationShipStatusform);


                   
		
		return mapping.findForward("success");
	}
	
	
}