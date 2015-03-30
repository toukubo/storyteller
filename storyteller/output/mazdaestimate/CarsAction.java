package net.mazdaestimate.web.app;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class CarsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Car.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Car car = (Car) iter.next();
			vector.add(car);
		}
		Car car = new CarImpl();
		CarForm carform = new CarForm();
		criteria = session.createCriteria(Car.class);


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
		
		
		req.setAttribute("cars",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}