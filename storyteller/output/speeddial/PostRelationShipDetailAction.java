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


public class PostRelationShipDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		RelationShip relationShip = new RelationShipImpl();
		RelationShipForm relationShipform = new RelationShipForm();
		Criteria criteria = session.createCriteria(RelationShip.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			relationShip = (RelationShip) criteria.uniqueResult();
			new CopyProperties(relationShip,relationShipform);
		} else if(req.getAttribute("form")!=null){
                        relationShipform = (RelationShipForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(relationShipform.getId()));
			relationShip = (RelationShip) criteria.uniqueResult();
		}
		

		req.setAttribute("model",relationShip);
		req.setAttribute("form",relationShipform);


                  Criteria criteriaRelationShipStatus= session.createCriteria(RelationShipStatus.class);
			req.setAttribute("RelationShipStatuss", criteriaRelationShipStatus.list());

 
		
		return mapping.findForward("success");
	}
	
	
}