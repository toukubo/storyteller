package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


                		Integer intraUserInt = productform.getIntraUser();
		productform.setIntraUser(null);
		Integer cInt = productform.getC();
		productform.setC(null);
		Integer workInt = productform.getWork();
		productform.setWork(null);
		Integer bInt = productform.getB();
		productform.setB(null);
		Integer aInt = productform.getA();
		productform.setA(null);
		Integer brandInt = productform.getBrand();
		productform.setBrand(null);

		
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
                		product.setDate(productform.getDate());
		product.setDescription(productform.getDescription());
		product.setPoplular(productform.isPoplular());


		
		StringFullfiller.fullfil(product);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		product.setIntraUser(intrauser);
		criteria2 = session.createCriteria(C.class);
		criteria2.add(Restrictions.idEq(cInt));
		C c = (C) criteria2.uniqueResult();
		product.setC(c);
		criteria2 = session.createCriteria(Work.class);
		criteria2.add(Restrictions.idEq(workInt));
		Work work = (Work) criteria2.uniqueResult();
		product.setWork(work);
		criteria2 = session.createCriteria(B.class);
		criteria2.add(Restrictions.idEq(bInt));
		B b = (B) criteria2.uniqueResult();
		product.setB(b);
		criteria2 = session.createCriteria(A.class);
		criteria2.add(Restrictions.idEq(aInt));
		A a = (A) criteria2.uniqueResult();
		product.setA(a);
		criteria2 = session.createCriteria(Brand.class);
		criteria2.add(Restrictions.idEq(brandInt));
		Brand brand = (Brand) criteria2.uniqueResult();
		product.setBrand(brand);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(product);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostProductDetail.do", product.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Products.do", product.getId().toString());
		return null;

		
	}
	
	
}