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


public class PostCDDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		CD cD = new CDImpl();
		CDForm cDform = new CDForm();
		Criteria criteria = session.createCriteria(CD.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			cD = (CD) criteria.uniqueResult();
			new CopyProperties(cD,cDform);
		} else if(req.getAttribute("form")!=null){
                        cDform = (CDForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(cDform.getId()));
			cD = (CD) criteria.uniqueResult();
		}
		

		req.setAttribute("model",cD);
		req.setAttribute("form",cDform);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

 
		
		return mapping.findForward("success");
	}
	
	
}