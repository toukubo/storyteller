package net.mazdaestimate.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;


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


public class PostExhibitionIntraUserDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ExhibitionIntraUser exhibitionIntraUser = new ExhibitionIntraUserImpl();
		ExhibitionIntraUserForm exhibitionIntraUserform = new ExhibitionIntraUserForm();
		Criteria criteria = session.createCriteria(ExhibitionIntraUser.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			exhibitionIntraUser = (ExhibitionIntraUser) criteria.uniqueResult();
			new CopyProperties(exhibitionIntraUser,exhibitionIntraUserform);
		} else if(req.getAttribute("form")!=null){
                        exhibitionIntraUserform = (ExhibitionIntraUserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(exhibitionIntraUserform.getId()));
			exhibitionIntraUser = (ExhibitionIntraUser) criteria.uniqueResult();
		}
		

		req.setAttribute("model",exhibitionIntraUser);
		req.setAttribute("form",exhibitionIntraUserform);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaExhibition= session.createCriteria(Exhibition.class);
			req.setAttribute("Exhibitions", criteriaExhibition.list());

 
		
		return mapping.findForward("success");
	}
	
	
}