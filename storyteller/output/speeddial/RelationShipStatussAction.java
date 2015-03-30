package net.speeddial.web.app;

import net.speeddial.model.*;
import net.speeddial.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class RelationShipStatussAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(RelationShipStatus.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			RelationShipStatus relationShipStatus = (RelationShipStatus) iter.next();
			vector.add(relationShipStatus);
		}
		RelationShipStatus relationShipStatus = new RelationShipStatusImpl();
		RelationShipStatusForm relationShipStatusform = new RelationShipStatusForm();
		criteria = session.createCriteria(RelationShipStatus.class);


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
		
		
		req.setAttribute("relationShipStatuss",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}