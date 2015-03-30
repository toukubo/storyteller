package net.mazdasalestool.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;


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


public class PostGroupOfCarLineDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		GroupOfCarLine groupOfCarLine = new GroupOfCarLineImpl();
		GroupOfCarLineForm groupOfCarLineform = new GroupOfCarLineForm();
		Criteria criteria = session.createCriteria(GroupOfCarLine.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			groupOfCarLine = (GroupOfCarLine) criteria.uniqueResult();
			new CopyProperties(groupOfCarLine,groupOfCarLineform);
		} else if(req.getAttribute("form")!=null){
                        groupOfCarLineform = (GroupOfCarLineForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(groupOfCarLineform.getId()));
			groupOfCarLine = (GroupOfCarLine) criteria.uniqueResult();
		}
		

		req.setAttribute("model",groupOfCarLine);
		req.setAttribute("form",groupOfCarLineform);


                   
		
		return mapping.findForward("success");
	}
	
	
}