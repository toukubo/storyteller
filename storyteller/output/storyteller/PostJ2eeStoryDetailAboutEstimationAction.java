package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.beans.*;


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


public class PostJ2eeStoryDetailAboutEstimationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		J2eeStory j2eeStory = new J2eeStoryImpl();
		J2eeStoryForm j2eeStoryform = new J2eeStoryForm();
		Criteria criteria = session.createCriteria(J2eeStory.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			j2eeStory = (J2eeStory) criteria.uniqueResult();
			new CopyProperties(j2eeStory,j2eeStoryform);
		} else if(req.getAttribute("form")!=null){
                        j2eeStoryform = (J2eeStoryForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(j2eeStoryform.getId()));
			j2eeStory = (J2eeStory) criteria.uniqueResult();
		}
		

		req.setAttribute("model",j2eeStory);
		req.setAttribute("form",j2eeStoryform);


                   
		
		return mapping.findForward("success");
	}
	
	
}