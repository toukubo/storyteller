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


public class CommunityThreadsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(CommunityThread.class);
                

		if(StringUtils.isNotBlank(req.getParameter("community"))) {
			Criteria criteria2 = session.createCriteria(Community.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("community"))));
			Community community = (Community) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("community", community));
		}
 

		req.setAttribute("communityThreads",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			CommunityThread communityThread = (CommunityThread) iter.next();
//			vector.add(communityThread);
//		}
		CommunityThread communityThread = new CommunityThreadImpl();
		CommunityThreadForm communityThreadform = new CommunityThreadForm();
		criteria = session.createCriteria(CommunityThread.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			communityThread = (CommunityThread) criteria.uniqueResult();
			new CopyProperties(communityThread,communityThreadform);
		} else if(req.getAttribute("form")!=null){
                        communityThreadform = (CommunityThreadForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(communityThreadform.getId()));
			communityThread = (CommunityThread) criteria.uniqueResult();
		}
		

		req.setAttribute("model",communityThread);
		req.setAttribute("form",communityThreadform);
		
		


                  Criteria criteriaCommunity= session.createCriteria(Community.class);
			req.setAttribute("Communitys", criteriaCommunity.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}