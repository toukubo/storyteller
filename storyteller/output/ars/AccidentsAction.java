package net.ars.web.app;

import net.ars.model.*;
import net.ars.beans.*;

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


public class AccidentsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Accident.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Accident accident = (Accident) iter.next();
			vector.add(accident);
		}
		Accident accident = new AccidentImpl();
		AccidentForm accidentform = new AccidentForm();
		criteria = session.createCriteria(Accident.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			accident = (Accident) criteria.uniqueResult();
			new CopyProperties(accident,accidentform);
		} else if(req.getAttribute("form")!=null){
                        accidentform = (AccidentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(accidentform.getId()));
			accident = (Accident) criteria.uniqueResult();
		}
		

		req.setAttribute("model",accident);
		req.setAttribute("form",accidentform);
		
		
		req.setAttribute("accidents",vector);


                  Criteria criteriaAttachment= session.createCriteria(Attachment.class);
			req.setAttribute("Attachments", criteriaAttachment.list());

Criteria criteriaStaff= session.createCriteria(Staff.class);
			req.setAttribute("Staffs", criteriaStaff.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}