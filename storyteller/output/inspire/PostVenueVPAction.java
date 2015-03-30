package net.inspire.web.app;

import net.inspire.model.*;
import net.inspire.beans.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class PostVenueVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Venue venue = new VenueImpl();
		VenueForm venueform = (VenueForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(venueform.getId() == null || venueform.getId().intValue() == 0){
			venue.setId(null);
			venueform.setId(null);
		}else{
			venue.setId(venueform.getId());
			Criteria criteria = session.createCriteria(Venue.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			venue = (Venue) criteria.uniqueResult();

		}
                		venue.setFoursquareId(venueform.getFoursquareId());


		
		StringFullfiller.fullfil(venue);
                
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(venue);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostVenueDetail.do", venue.getId().toString(),"success=true");
		return null;

		
	}
	
	
}