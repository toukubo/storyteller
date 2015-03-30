package net.musicmug.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.musicmug.model.*;
import net.musicmug.beans.*;


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


public class PostMugSharingDetailForRequestAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		MugSharing mugSharing = new MugSharingImpl();
		MugSharingForm mugSharingform = new MugSharingForm();
		Criteria criteria = session.createCriteria(MugSharing.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			mugSharing = (MugSharing) criteria.uniqueResult();
			new CopyProperties(mugSharing,mugSharingform);
		} else if(req.getAttribute("form")!=null){
                        mugSharingform = (MugSharingForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(mugSharingform.getId()));
			mugSharing = (MugSharing) criteria.uniqueResult();
		}
		

		req.setAttribute("model",mugSharing);
		req.setAttribute("form",mugSharingform);


                   
		
		return mapping.findForward("success");
	}
	
	
}