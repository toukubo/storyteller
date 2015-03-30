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


public class JoiningsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Joining.class);
                
		if(StringUtils.isNotBlank(req.getParameter("publicUser"))) {
			Criteria criteria2 = session.createCriteria(PublicUser.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("publicUser"))));
			PublicUser publicUser = (PublicUser) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("publicUser", publicUser));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("community"))) {
			Criteria criteria2 = session.createCriteria(Community.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("community"))));
			Community community = (Community) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("community", community));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("joinings",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Joining joining = (Joining) iter.next();
//			vector.add(joining);
//		}
		Joining joining = new JoiningImpl();
		JoiningForm joiningform = new JoiningForm();
		criteria = session.createCriteria(Joining.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			joining = (Joining) criteria.uniqueResult();
			new CopyProperties(joining,joiningform);
		} else if(req.getAttribute("form")!=null){
                        joiningform = (JoiningForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(joiningform.getId()));
			joining = (Joining) criteria.uniqueResult();
		}
		

		req.setAttribute("model",joining);
		req.setAttribute("form",joiningform);
		
		


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

Criteria criteriaCommunity= session.createCriteria(Community.class);
			req.setAttribute("Communitys", criteriaCommunity.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}