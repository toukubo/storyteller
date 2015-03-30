package net.ecoc.web.app;

import net.ecoc.model.*;
import net.ecoc.beans.*;

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


public class CampaneChoisesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(CampaneChoise.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			CampaneChoise campaneChoise = (CampaneChoise) iter.next();
			vector.add(campaneChoise);
		}
		CampaneChoise campaneChoise = new CampaneChoiseImpl();
		CampaneChoiseForm campaneChoiseform = new CampaneChoiseForm();
		criteria = session.createCriteria(CampaneChoise.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			campaneChoise = (CampaneChoise) criteria.uniqueResult();
			new CopyProperties(campaneChoise,campaneChoiseform);
		} else if(req.getAttribute("form")!=null){
                        campaneChoiseform = (CampaneChoiseForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(campaneChoiseform.getId()));
			campaneChoise = (CampaneChoise) criteria.uniqueResult();
		}
		

		req.setAttribute("model",campaneChoise);
		req.setAttribute("form",campaneChoiseform);
		
		
		req.setAttribute("campaneChoises",vector);


                  Criteria criteriaProduct= session.createCriteria(Product.class);
			req.setAttribute("Products", criteriaProduct.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}