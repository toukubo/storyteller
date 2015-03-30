package net.ja.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ja.model.*;
import net.ja.beans.*;


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


public class PostAreaDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Area area = new AreaImpl();
		AreaForm areaform = new AreaForm();
		Criteria criteria = session.createCriteria(Area.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			area = (Area) criteria.uniqueResult();
			new CopyProperties(area,areaform);
		} else if(req.getAttribute("form")!=null){
                        areaform = (AreaForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(areaform.getId()));
			area = (Area) criteria.uniqueResult();
		}
		

		req.setAttribute("model",area);
		req.setAttribute("form",areaform);


                   
		
		return mapping.findForward("success");
	}
	
	
}