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


public class PostJoiningDetailInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Joining joining = new JoiningImpl();
		JoiningForm joiningform = new JoiningForm();
		Criteria criteria = session.createCriteria(Joining.class);

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

 
		
		return mapping.findForward("success");
	}
	
	
}