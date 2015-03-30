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


public class PostGroupingDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Grouping grouping = new GroupingImpl();
		GroupingForm groupingform = new GroupingForm();
		Criteria criteria = session.createCriteria(Grouping.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			grouping = (Grouping) criteria.uniqueResult();
			new CopyProperties(grouping,groupingform);
		} else if(req.getAttribute("form")!=null){
                        groupingform = (GroupingForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(groupingform.getId()));
			grouping = (Grouping) criteria.uniqueResult();
		}
		

		req.setAttribute("model",grouping);
		req.setAttribute("form",groupingform);


                   
		
		return mapping.findForward("success");
	}
	
	
}