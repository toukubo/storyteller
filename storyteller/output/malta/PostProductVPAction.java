package net.malta.web.app;

import net.malta.model.*;
import net.malta.beans.*;

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
if(!productform.isdateIsValid()){
   error += "日付 はyyyy/MM/ddにしてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("size"))){
    error += "サイズには数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(productform.getNo())){
   error += "商品Noは空にはできません。<br />"; 
}

if(StringUtils.isBlank(productform.getName())){
   error += "名前は空にはできません。<br />"; 
}

if(StringUtils.isBlank(productform.getPricewithtax())){
   error += "税込みは空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("pricewithtax"))){
    error += "税込みには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("stocknum"))){
    error += "在庫数には数値のみを入れてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",productform);
	return mapping.findForward("error");
}


                		Integer categoryInt = productform.getCategory();
		productform.setCategory(null);

		
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
		product.setSize(productform.getSize());
		product.setNo(productform.getNo());
		product.setName(productform.getName());
		product.setPricewithtax(productform.getPricewithtax());
		product.setCatchcopy(productform.getCatchcopy());
		product.setMaterial(productform.getMaterial());
		product.setDescription(productform.getDescription());
		product.setStocknum(productform.getStocknum());
		product.setPub(productform.isPub());


		
		StringFullfiller.fullfil(product);
                		Criteria criteria2 = session.createCriteria(Category.class);
		criteria2.add(Restrictions.idEq(categoryInt));
		Category category = (Category) criteria2.uniqueResult();
		product.setCategory(category);


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