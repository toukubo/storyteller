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


public class PostItemCategoryVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ItemCategory itemCategory = new ItemCategoryImpl();
		ItemCategoryForm itemCategoryform = (ItemCategoryForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(itemCategoryform.getId() == null || itemCategoryform.getId().intValue() == 0){
			itemCategory.setId(null);
			itemCategoryform.setId(null);
		}else{
			itemCategory.setId(itemCategoryform.getId());
			Criteria criteria = session.createCriteria(ItemCategory.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			itemCategory = (ItemCategory) criteria.uniqueResult();

		}
                		itemCategory.setName(itemCategoryform.getName());


		
		StringFullfiller.fullfil(itemCategory);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(itemCategory);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostItemCategoryDetail.do", itemCategory.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ItemCategorys.do", itemCategory.getId().toString());
		return null;

		
	}
	
	
}