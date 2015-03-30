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


public class WorksAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Work.class);
                
		if(StringUtils.isNotBlank(req.getParameter("artist"))) {
			Criteria criteria2 = session.createCriteria(Artist.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("artist"))));
			Artist artist = (Artist) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("artist", artist));
		}
 



if(StringUtils.isNotBlank(req.getParameter("client"))){   if(req.getParameter("client").equals("true")){
      criteria.add(Restrictions.eq("client",true));
   }else{
      criteria.add(Restrictions.eq("client",false));
   }
}


if(StringUtils.isNotBlank(req.getParameter("licensed"))){   if(req.getParameter("licensed").equals("true")){
      criteria.add(Restrictions.eq("licensed",true));
   }else{
      criteria.add(Restrictions.eq("licensed",false));
   }
}


if(StringUtils.isNotBlank(req.getParameter("licensingpossibleafterexpired"))){   if(req.getParameter("licensingpossibleafterexpired").equals("true")){
      criteria.add(Restrictions.eq("licensingpossibleafterexpired",true));
   }else{
      criteria.add(Restrictions.eq("licensingpossibleafterexpired",false));
   }
}







		if(StringUtils.isNotBlank(req.getParameter("updatedatestartdate")) && StringUtils.isNotBlank(req.getParameter("updatedateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("updatedatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("updatedateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}

		if(StringUtils.isNotBlank(req.getParameter("productiondatestartdate")) && StringUtils.isNotBlank(req.getParameter("productiondateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("productiondatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("productiondateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}






		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}



		req.setAttribute("works",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Work work = (Work) iter.next();
//			vector.add(work);
//		}
		Work work = new WorkImpl();
		WorkForm workform = new WorkForm();
		criteria = session.createCriteria(Work.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			work = (Work) criteria.uniqueResult();
			new CopyProperties(work,workform);
		} else if(req.getAttribute("form")!=null){
                        workform = (WorkForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(workform.getId()));
			work = (Work) criteria.uniqueResult();
		}
		

		req.setAttribute("model",work);
		req.setAttribute("form",workform);
		
		


                  Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}