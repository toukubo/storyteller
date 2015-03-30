package net.speeddial.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.speeddial.model.*;
import net.speeddial.beans.*;


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


public class PostDialDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Dial dial = new DialImpl();
		DialForm dialform = new DialForm();
		Criteria criteria = session.createCriteria(Dial.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			dial = (Dial) criteria.uniqueResult();
			new CopyProperties(dial,dialform);
		} else if(req.getAttribute("form")!=null){
                        dialform = (DialForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(dialform.getId()));
			dial = (Dial) criteria.uniqueResult();
		}
		

		req.setAttribute("model",dial);
		req.setAttribute("form",dialform);


                  Criteria criteriaService= session.createCriteria(Service.class);
			req.setAttribute("Services", criteriaService.list());

Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

Criteria criteriaDialThumnailFile= session.createCriteria(DialThumnailFile.class);
			req.setAttribute("DialThumnailFiles", criteriaDialThumnailFile.list());

 
		
		return mapping.findForward("success");
	}
	
	
}