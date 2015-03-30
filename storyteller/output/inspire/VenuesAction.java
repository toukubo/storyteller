package net.inspire.web.app;

import net.inspire.model.*;
import net.inspire.beans.*;

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


public class VenuesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="VenuesAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Venue.class);
                
		req.setAttribute("venues",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Venue venue = (Venue) iter.next();
//			vector.add(venue);
//		}
		Venue venue = new VenueImpl();
		VenueForm venueform = new VenueForm();
		criteria = session.createCriteria(Venue.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			venue = (Venue) criteria.uniqueResult();
			new CopyProperties(venue,venueform);
		} else if(req.getAttribute("form")!=null){
                        venueform = (VenueForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(venueform.getId()));
			venue = (Venue) criteria.uniqueResult();
		}
		

		req.setAttribute("model",venue);
		req.setAttribute("form",venueform);
		
		
//</snippet>

                   

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportVenuesAction csvExportVenuesAction 
//                               = new CsvExportVenuesAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}