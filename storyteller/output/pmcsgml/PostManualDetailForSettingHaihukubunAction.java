package net.pmcsgml.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.pmcsgml.model.*;
import net.pmcsgml.beans.*;


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


public class PostManualDetailForSettingHaihukubunAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Manual manual = new ManualImpl();
		ManualForm manualform = new ManualForm();
		Criteria criteria = session.createCriteria(Manual.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			manual = (Manual) criteria.uniqueResult();
			new CopyProperties(manual,manualform);
		} else if(req.getAttribute("form")!=null){
                        manualform = (ManualForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(manualform.getId()));
			manual = (Manual) criteria.uniqueResult();
		}
		

		req.setAttribute("model",manual);
		req.setAttribute("form",manualform);


                   
		
		return mapping.findForward("success");
	}
	
	
}