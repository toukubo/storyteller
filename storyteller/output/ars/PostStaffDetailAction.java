package net.ars.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ars.model.*;
import net.ars.beans.*;


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


public class PostStaffDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Staff staff = new StaffImpl();
		StaffForm staffform = new StaffForm();
		Criteria criteria = session.createCriteria(Staff.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			staff = (Staff) criteria.uniqueResult();
			new CopyProperties(staff,staffform);
		} else if(req.getAttribute("form")!=null){
                        staffform = (StaffForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(staffform.getId()));
			staff = (Staff) criteria.uniqueResult();
		}
		

		req.setAttribute("model",staff);
		req.setAttribute("form",staffform);


                   
		
		return mapping.findForward("success");
	}
	
	
}