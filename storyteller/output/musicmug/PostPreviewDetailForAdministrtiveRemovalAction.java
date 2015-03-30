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


public class PostPreviewDetailForAdministrtiveRemovalAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Preview preview = new PreviewImpl();
		PreviewForm previewform = new PreviewForm();
		Criteria criteria = session.createCriteria(Preview.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			preview = (Preview) criteria.uniqueResult();
			new CopyProperties(preview,previewform);
		} else if(req.getAttribute("form")!=null){
                        previewform = (PreviewForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(previewform.getId()));
			preview = (Preview) criteria.uniqueResult();
		}
		

		req.setAttribute("model",preview);
		req.setAttribute("form",previewform);


                   
		
		return mapping.findForward("success");
	}
	
	
}