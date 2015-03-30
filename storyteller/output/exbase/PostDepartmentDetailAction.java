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


public class PostDepartmentDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Department department = new DepartmentImpl();
		DepartmentForm departmentform = new DepartmentForm();
		Criteria criteria = session.createCriteria(Department.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			department = (Department) criteria.uniqueResult();
			new CopyProperties(department,departmentform);
		} else if(req.getAttribute("form")!=null){
                        departmentform = (DepartmentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(departmentform.getId()));
			department = (Department) criteria.uniqueResult();
		}
		

		req.setAttribute("model",department);
		req.setAttribute("form",departmentform);


                   
		
		return mapping.findForward("success");
	}
	
	
}