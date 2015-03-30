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


public class PostExhibitionDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Exhibition exhibition = new ExhibitionImpl();
		ExhibitionForm exhibitionform = new ExhibitionForm();
		Criteria criteria = session.createCriteria(Exhibition.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			exhibition = (Exhibition) criteria.uniqueResult();
			new CopyProperties(exhibition,exhibitionform);
		} else if(req.getAttribute("form")!=null){
                        exhibitionform = (ExhibitionForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(exhibitionform.getId()));
			exhibition = (Exhibition) criteria.uniqueResult();
		}
		

		req.setAttribute("model",exhibition);
		req.setAttribute("form",exhibitionform);


                  Criteria criteriaExhibitionIntraUser= session.createCriteria(ExhibitionIntraUser.class);
			req.setAttribute("ExhibitionIntraUsers", criteriaExhibitionIntraUser.list());

Criteria criteriaBase= session.createCriteria(Base.class);
			req.setAttribute("Bases", criteriaBase.list());

 
		
		return mapping.findForward("success");
	}
	
	
}