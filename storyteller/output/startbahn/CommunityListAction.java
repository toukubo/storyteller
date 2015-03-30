package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;

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


public class CommunityListAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Community.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Community community = (Community) iter.next();
			vector.add(community);
		}
		Community community = new CommunityImpl();
		CommunityForm communityform = new CommunityForm();
		criteria = session.createCriteria(Community.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			community = (Community) criteria.uniqueResult();
			new CopyProperties(community,communityform);
		} else if(req.getAttribute("form")!=null){
                        communityform = (CommunityForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(communityform.getId()));
			community = (Community) criteria.uniqueResult();
		}
		

		req.setAttribute("model",community);
		req.setAttribute("form",communityform);
		
		
		req.setAttribute("communitys",vector);
		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}