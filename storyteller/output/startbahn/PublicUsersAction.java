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


public class PublicUsersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(PublicUser.class);
                



if(StringUtils.isNotBlank(req.getParameter("recentlyadded"))){   if(req.getParameter("recentlyadded").equals("true")){
      criteria.add(Restrictions.eq("recentlyadded",true));
   }else{
      criteria.add(Restrictions.eq("recentlyadded",false));
   }
}




		if(StringUtils.isNotBlank(req.getParameter("artist"))) {
			Criteria criteria2 = session.createCriteria(Artist.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("artist"))));
			Artist artist = (Artist) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("artist", artist));
		}
 
if(StringUtils.isNotBlank(req.getParameter("poplular"))){   if(req.getParameter("poplular").equals("true")){
      criteria.add(Restrictions.eq("poplular",true));
   }else{
      criteria.add(Restrictions.eq("poplular",false));
   }
}








		if(StringUtils.isNotBlank(req.getParameter("birthdatestartdate")) && StringUtils.isNotBlank(req.getParameter("birthdateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("birthdatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("birthdateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}










		if(StringUtils.isNotBlank(req.getParameter("collector"))) {
			Criteria criteria2 = session.createCriteria(Collector.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("collector"))));
			Collector collector = (Collector) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("collector", collector));
		}
 





		if(StringUtils.isNotBlank(req.getParameter("reviewer"))) {
			Criteria criteria2 = session.createCriteria(Reviewer.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("reviewer"))));
			Reviewer reviewer = (Reviewer) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("reviewer", reviewer));
		}
 




		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}



		req.setAttribute("publicUsers",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			PublicUser publicUser = (PublicUser) iter.next();
//			vector.add(publicUser);
//		}
		PublicUser publicUser = new PublicUserImpl();
		PublicUserForm publicUserform = new PublicUserForm();
		criteria = session.createCriteria(PublicUser.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			publicUser = (PublicUser) criteria.uniqueResult();
			new CopyProperties(publicUser,publicUserform);
		} else if(req.getAttribute("form")!=null){
                        publicUserform = (PublicUserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(publicUserform.getId()));
			publicUser = (PublicUser) criteria.uniqueResult();
		}
		

		req.setAttribute("model",publicUser);
		req.setAttribute("form",publicUserform);
		
		


                  Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

Criteria criteriaCollector= session.createCriteria(Collector.class);
			req.setAttribute("Collectors", criteriaCollector.list());

Criteria criteriaReviewer= session.createCriteria(Reviewer.class);
			req.setAttribute("Reviewers", criteriaReviewer.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}