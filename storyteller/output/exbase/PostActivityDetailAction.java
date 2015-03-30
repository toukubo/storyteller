package net.exbase.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.exbase.model.*;
import net.exbase.beans.*;


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


public class PostActivityDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Activity activity = new ActivityImpl();
		ActivityForm activityform = new ActivityForm();
		Criteria criteria = session.createCriteria(Activity.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			activity = (Activity) criteria.uniqueResult();
			new CopyProperties(activity,activityform);
		} else if(req.getAttribute("form")!=null){
                        activityform = (ActivityForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(activityform.getId()));
			activity = (Activity) criteria.uniqueResult();
		}
		

		req.setAttribute("model",activity);
		req.setAttribute("form",activityform);


                   
		
		return mapping.findForward("success");
	}
	
	
}