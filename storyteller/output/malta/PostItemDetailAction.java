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


public class PostItemDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Item item = new ItemImpl();
		ItemForm itemform = new ItemForm();
		Criteria criteria = session.createCriteria(Item.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			item = (Item) criteria.uniqueResult();
			new CopyProperties(item,itemform);
		} else if(req.getAttribute("form")!=null){
                        itemform = (ItemForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(itemform.getId()));
			item = (Item) criteria.uniqueResult();
		}
		

		req.setAttribute("model",item);
		req.setAttribute("form",itemform);


                  Criteria criteriaProduct= session.createCriteria(Product.class);
			req.setAttribute("Products", criteriaProduct.list());

Criteria criteriaCarriage= session.createCriteria(Carriage.class);
			req.setAttribute("Carriages", criteriaCarriage.list());

 
		
		return mapping.findForward("success");
	}
	
	
}