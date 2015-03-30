package net.gasbooknet.web;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

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

public class BrandVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Brand brand = new BrandImpl();
		BrandForm brandform = (BrandForm) form;
		
                		Integer logoInt = brandform.getLogo();
		brandform.setLogo(null);

		
		BeanUtils.copyProperties(brand,brandform);
		StringFullfiller.fullfil(brand);
		if(brandform.getId() == null || brandform.getId().intValue() == 0){
			brand.setId(null);
		}else{
			brand.setId(brandform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Logo.class);
		criteria2.add(Restrictions.idEq(logoInt));
		Logo logo = (Logo) criteria2.uniqueResult();
		brand.setLogo(logo);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(brand);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "BrandDetail.do", brand.getId().toString());
		return null;

		
	}
	
	
}