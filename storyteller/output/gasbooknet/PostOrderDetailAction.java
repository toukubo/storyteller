package net.gasbooknet.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

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


public class PostOrderDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Order order = new OrderImpl();
		OrderForm orderform = new OrderForm();
		Criteria criteria = session.createCriteria(Order.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			order = (Order) criteria.uniqueResult();
			new CopyProperties(order,orderform);
		} else if(req.getAttribute("form")!=null){
                        orderform = (OrderForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(orderform.getId()));
			order = (Order) criteria.uniqueResult();
		}
		

		req.setAttribute("model",order);
		req.setAttribute("form",orderform);


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

 
		
		return mapping.findForward("success");
	}
	
	
}