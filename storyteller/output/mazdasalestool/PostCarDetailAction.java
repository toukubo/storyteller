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


public class PostCarDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Car car = new CarImpl();
		CarForm carform = new CarForm();
		Criteria criteria = session.createCriteria(Car.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			car = (Car) criteria.uniqueResult();
			new CopyProperties(car,carform);
		} else if(req.getAttribute("form")!=null){
                        carform = (CarForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(carform.getId()));
			car = (Car) criteria.uniqueResult();
		}
		

		req.setAttribute("model",car);
		req.setAttribute("form",carform);


                  Criteria criteriaGroupOfCarLine= session.createCriteria(GroupOfCarLine.class);
			req.setAttribute("GroupOfCarLines", criteriaGroupOfCarLine.list());

 
		
		return mapping.findForward("success");
	}
	
	
}