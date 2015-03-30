package net.djbi.web.app;

import net.djbi.model.*;
import net.djbi.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;


import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class SupplierDeliveryRatesForBestWorstAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="SupplierDeliveryRatesForBestWorstAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(SupplierDeliveryRate.class);
                		if(StringUtils.isNotBlank(req.getParameter("term"))) {
			Criteria criteria2 = session.createCriteria(Term.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("term"))));
			Term term = (Term) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("term", term));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("company"))) {
			Criteria criteria2 = session.createCriteria(Company.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("company"))));
			Company company = (Company) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("company", company));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("supplier"))) {
			Criteria criteria2 = session.createCriteria(Supplier.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("supplier"))));
			Supplier supplier = (Supplier) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("supplier", supplier));
		}
 






		req.setAttribute("supplierDeliveryRates",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			SupplierDeliveryRate supplierDeliveryRate = (SupplierDeliveryRate) iter.next();
//			vector.add(supplierDeliveryRate);
//		}
		SupplierDeliveryRate supplierDeliveryRate = new SupplierDeliveryRateImpl();
		SupplierDeliveryRateForm supplierDeliveryRateform = new SupplierDeliveryRateForm();
		criteria = session.createCriteria(SupplierDeliveryRate.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			supplierDeliveryRate = (SupplierDeliveryRate) criteria.uniqueResult();
			new CopyProperties(supplierDeliveryRate,supplierDeliveryRateform);
		} else if(req.getAttribute("form")!=null){
                        supplierDeliveryRateform = (SupplierDeliveryRateForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(supplierDeliveryRateform.getId()));
			supplierDeliveryRate = (SupplierDeliveryRate) criteria.uniqueResult();
		}
		

		req.setAttribute("model",supplierDeliveryRate);
		req.setAttribute("form",supplierDeliveryRateform);
		
		
//</snippet>

                  Criteria criteriaTerm= session.createCriteria(Term.class);
			req.setAttribute("Terms", criteriaTerm.list());

Criteria criteriaCompany= session.createCriteria(Company.class);
			req.setAttribute("Companys", criteriaCompany.list());

Criteria criteriaSupplier= session.createCriteria(Supplier.class);
			req.setAttribute("Suppliers", criteriaSupplier.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}