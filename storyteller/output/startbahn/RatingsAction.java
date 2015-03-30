package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class RatingsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Rating.class);
                




if(StringUtils.isNotBlank(req.getParameter("thumbup"))){   if(req.getParameter("thumbup").equals("true")){
      criteria.add(Restrictions.eq("thumbup",true));
   }else{
      criteria.add(Restrictions.eq("thumbup",false));
   }
}


		req.setAttribute("ratings",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Rating rating = (Rating) iter.next();
//			vector.add(rating);
//		}
		Rating rating = new RatingImpl();
		RatingForm ratingform = new RatingForm();
		criteria = session.createCriteria(Rating.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			rating = (Rating) criteria.uniqueResult();
			new CopyProperties(rating,ratingform);
		} else if(req.getAttribute("form")!=null){
                        ratingform = (RatingForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(ratingform.getId()));
			rating = (Rating) criteria.uniqueResult();
		}
		

		req.setAttribute("model",rating);
		req.setAttribute("form",ratingform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}