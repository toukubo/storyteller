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


public class PostConfirmationDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Confirmation confirmation = new ConfirmationImpl();
		ConfirmationForm confirmationform = new ConfirmationForm();
		Criteria criteria = session.createCriteria(Confirmation.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			confirmation = (Confirmation) criteria.uniqueResult();
			new CopyProperties(confirmation,confirmationform);
		} else if(req.getAttribute("form")!=null){
                        confirmationform = (ConfirmationForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(confirmationform.getId()));
			confirmation = (Confirmation) criteria.uniqueResult();
		}
		

		req.setAttribute("model",confirmation);
		req.setAttribute("form",confirmationform);


                  Criteria criteriaActivity= session.createCriteria(Activity.class);
			req.setAttribute("Activitys", criteriaActivity.list());

 
		
		return mapping.findForward("success");
	}
	
	
}