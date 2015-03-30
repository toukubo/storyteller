package net.startbahn.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.startbahn.model.*;
import net.startbahn.beans.*;


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


public class PostCommunityThreadDetailInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		CommunityThread communityThread = new CommunityThreadImpl();
		CommunityThreadForm communityThreadform = new CommunityThreadForm();
		Criteria criteria = session.createCriteria(CommunityThread.class);

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

 
		
		return mapping.findForward("success");
	}
	
	
}