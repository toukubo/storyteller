package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class ProductsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Product.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Product product = (Product) iter.next();
			vector.add(product);
		}
		Product product = new ProductImpl();
		ProductForm productform = new ProductForm();
		criteria = session.createCriteria(Product.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			product = (Product) criteria.uniqueResult();
			new CopyProperties(product,productform);
		} else if(req.getAttribute("form")!=null){
                        productform = (ProductForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(productform.getId()));
			product = (Product) criteria.uniqueResult();
		}
		

		req.setAttribute("model",product);
		req.setAttribute("form",productform);
		
		
		req.setAttribute("products",vector);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaWork= session.createCriteria(Work.class);
			req.setAttribute("Works", criteriaWork.list());

Criteria criteriaBrand= session.createCriteria(Brand.class);
			req.setAttribute("Brands", criteriaBrand.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}