package net.crm.web.app;

import net.crm.model.*;
import net.crm.beans.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostProductVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Product product = new ProductImpl();
		ProductForm productform = (ProductForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(productform.getId() == null || productform.getId().intValue() == 0){
			product.setId(null);
			productform.setId(null);
		}else{
			product.setId(productform.getId());
			Criteria criteria = session.createCriteria(Product.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			product = (Product) criteria.uniqueResult();

		}
                		product.setPrice(productform.getPrice());
		product.setName(productform.getName());


		
		StringFullfiller.fullfil(product);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(product);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostProductDetail.do", product.getId().toString());
		return null;

		
	}
	
	
}