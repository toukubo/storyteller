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


public class PostItemVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Item item = new ItemImpl();
		ItemForm itemform = (ItemForm) form;

                String error = "";


                		Integer productInt = itemform.getProduct();
		itemform.setProduct(null);
		Integer itemCategoryInt = itemform.getItemCategory();
		itemform.setItemCategory(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(itemform.getId() == null || itemform.getId().intValue() == 0){
			item.setId(null);
			itemform.setId(null);
		}else{
			item.setId(itemform.getId());
			Criteria criteria = session.createCriteria(Item.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			item = (Item) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(item);
                		Criteria criteria2 = session.createCriteria(Product.class);
		criteria2.add(Restrictions.idEq(productInt));
		Product product = (Product) criteria2.uniqueResult();
		item.setProduct(product);
		criteria2 = session.createCriteria(ItemCategory.class);
		criteria2.add(Restrictions.idEq(itemCategoryInt));
		ItemCategory itemcategory = (ItemCategory) criteria2.uniqueResult();
		item.setItemCategory(itemcategory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(item);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostItemDetail.do", item.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Items.do", item.getId().toString());
		return null;

		
	}
	
	
}