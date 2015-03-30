package net.gasbooknet.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;


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


public class PostSpaceDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Space space = new SpaceImpl();
		SpaceForm spaceform = new SpaceForm();
		Criteria criteria = session.createCriteria(Space.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			space = (Space) criteria.uniqueResult();
			new CopyProperties(space,spaceform);
		} else if(req.getAttribute("form")!=null){
                        spaceform = (SpaceForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(spaceform.getId()));
			space = (Space) criteria.uniqueResult();
		}
		

		req.setAttribute("model",space);
		req.setAttribute("form",spaceform);


                   
		
		return mapping.findForward("success");
	}
	
	
}