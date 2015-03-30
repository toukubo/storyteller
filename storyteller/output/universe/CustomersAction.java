package net.universe.web.app;

import net.universe.model.*;
import net.universe.beans.*;

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


public class CustomersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Customer.class);
                











		if(StringUtils.isNotBlank(req.getParameter("startupdatestartdate")) && StringUtils.isNotBlank(req.getParameter("startupdateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("startupdatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("startupdateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}

		if(StringUtils.isNotBlank(req.getParameter("closedatestartdate")) && StringUtils.isNotBlank(req.getParameter("closedateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("closedatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("closedateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}




if(StringUtils.isNotBlank(req.getParameter("printout"))){   if(req.getParameter("printout").equals("true")){
      criteria.add(Restrictions.eq("printout",true));
   }else{
      criteria.add(Restrictions.eq("printout",false));
   }
}


		req.setAttribute("customers",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Customer customer = (Customer) iter.next();
//			vector.add(customer);
//		}
		Customer customer = new CustomerImpl();
		CustomerForm customerform = new CustomerForm();
		criteria = session.createCriteria(Customer.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			customer = (Customer) criteria.uniqueResult();
			new CopyProperties(customer,customerform);
		} else if(req.getAttribute("form")!=null){
                        customerform = (CustomerForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(customerform.getId()));
			customer = (Customer) criteria.uniqueResult();
		}
		

		req.setAttribute("model",customer);
		req.setAttribute("form",customerform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}