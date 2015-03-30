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


public class PostBusinessdayDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Businessday businessday = new BusinessdayImpl();
		BusinessdayForm businessdayform = new BusinessdayForm();
		Criteria criteria = session.createCriteria(Businessday.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			businessday = (Businessday) criteria.uniqueResult();
			new CopyProperties(businessday,businessdayform);
		} else if(req.getAttribute("form")!=null){
                        businessdayform = (BusinessdayForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(businessdayform.getId()));
			businessday = (Businessday) criteria.uniqueResult();
		}
		

		req.setAttribute("model",businessday);
		req.setAttribute("form",businessdayform);


                   
		
		return mapping.findForward("success");
	}
	
	
}