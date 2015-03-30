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


public class PostBrandVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Brand brand = new BrandImpl();
		BrandForm brandform = (BrandForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(brandform.getId() == null || brandform.getId().intValue() == 0){
			brand.setId(null);
			brandform.setId(null);
		}else{
			brand.setId(brandform.getId());
			Criteria criteria = session.createCriteria(Brand.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			brand = (Brand) criteria.uniqueResult();

		}
                		brand.setCode(brandform.getCode());
		brand.setName(brandform.getName());
		brand.setDescription(brandform.getDescription());


		
		StringFullfiller.fullfil(brand);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(brand);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBrandDetail.do", brand.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Brands.do", brand.getId().toString());
		return null;

		
	}
	
	
}