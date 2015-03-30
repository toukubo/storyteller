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


public class PostCountryVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Country country = new CountryImpl();
		CountryForm countryform = (CountryForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(countryform.getId() == null || countryform.getId().intValue() == 0){
			country.setId(null);
			countryform.setId(null);
		}else{
			country.setId(countryform.getId());
			Criteria criteria = session.createCriteria(Country.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			country = (Country) criteria.uniqueResult();

		}
                		country.setName(countryform.getName());


		
		StringFullfiller.fullfil(country);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(country);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCountryDetail.do", country.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Countrys.do", country.getId().toString());
		return null;

		
	}
	
	
}