package net.ecoc.web.app;

import net.ecoc.model.*;
import net.ecoc.beans.*;

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
                		product.setCode(productform.getCode());
		product.setTax(productform.getTax());
		product.setAttachment(productform.getAttachment());
		product.setPricewithtax(productform.getPricewithtax());
		product.setPrice(productform.getPrice());
		product.setPub(productform.isPub());
		product.setMisc(productform.getMisc());
		product.setMaterial(productform.getMaterial());
		product.setDescriptiontitle(productform.getDescriptiontitle());
		product.setStocknum(productform.getStocknum());
		product.setTotalfixedprice(productform.getTotalfixedprice());
		product.setWeight(productform.getWeight());
		product.setAttention(productform.getAttention());
		product.setHtmlforoption(productform.getHtmlforoption());
		product.setName(productform.getName());
		product.setSize(productform.getSize());
		product.setColor(productform.getColor());
		product.setDescription(productform.getDescription());
		product.setDate(productform.getDate());


		
		StringFullfiller.fullfil(product);
                		Criteria criteria2 = session.createCriteria(Brand.class);
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