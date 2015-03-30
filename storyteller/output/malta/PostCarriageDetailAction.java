package net.malta.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.malta.model.*;
import net.malta.beans.*;


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


public class PostCarriageDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Carriage carriage = new CarriageImpl();
		CarriageForm carriageform = new CarriageForm();
		Criteria criteria = session.createCriteria(Carriage.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			carriage = (Carriage) criteria.uniqueResult();
			new CopyProperties(carriage,carriageform);
		} else if(req.getAttribute("form")!=null){
                        carriageform = (CarriageForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(carriageform.getId()));
			carriage = (Carriage) criteria.uniqueResult();
		}
		

		req.setAttribute("model",carriage);
		req.setAttribute("form",carriageform);


                   
		
		return mapping.findForward("success");
	}
	
	
}