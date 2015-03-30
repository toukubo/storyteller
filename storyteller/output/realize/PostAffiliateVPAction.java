package net.realize.web.app;

import net.realize.model.*;
import net.realize.beans.*;

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
import org.hibernate.criterion.Restrictions;


public class PostAffiliateVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Affiliate affiliate = new AffiliateImpl();
		AffiliateForm affiliateform = (AffiliateForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(affiliateform.getId() == null || affiliateform.getId().intValue() == 0){
			affiliate.setId(null);
			affiliateform.setId(null);
		}else{
			affiliate.setId(affiliateform.getId());
			Criteria criteria = session.createCriteria(Affiliate.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			affiliate = (Affiliate) criteria.uniqueResult();

		}
                		affiliate.setTag(affiliateform.getTag());
		affiliate.setPrice(affiliateform.getPrice());
		affiliate.setName(affiliateform.getName());


		
		StringFullfiller.fullfil(affiliate);
                
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(affiliate);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAffiliateDetail.do", affiliate.getId().toString(),"success=true");
		return null;

		
	}
	
	
}