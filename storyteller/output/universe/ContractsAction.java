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


public class ContractsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Contract.class);
                		if(StringUtils.isNotBlank(req.getParameter("appearancedatestartdate")) && StringUtils.isNotBlank(req.getParameter("appearancedateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("appearancedatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("appearancedateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}




		if(StringUtils.isNotBlank(req.getParameter("customer"))) {
			Criteria criteria2 = session.createCriteria(Customer.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("customer"))));
			Customer customer = (Customer) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("customer", customer));
		}
 




		if(StringUtils.isNotBlank(req.getParameter("invoicedatestartdate")) && StringUtils.isNotBlank(req.getParameter("invoicedateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("invoicedatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("invoicedateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}

		if(StringUtils.isNotBlank(req.getParameter("receivedatestartdate")) && StringUtils.isNotBlank(req.getParameter("receivedateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("receivedatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("receivedateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}



		if(StringUtils.isNotBlank(req.getParameter("contractdatestartdate")) && StringUtils.isNotBlank(req.getParameter("contractdateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("contractdatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("contractdateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}

if(StringUtils.isNotBlank(req.getParameter("invoiced"))){   if(req.getParameter("invoiced").equals("true")){
      criteria.add(Restrictions.eq("invoiced",true));
   }else{
      criteria.add(Restrictions.eq("invoiced",false));
   }
}

if(StringUtils.isNotBlank(req.getParameter("received"))){   if(req.getParameter("received").equals("true")){
      criteria.add(Restrictions.eq("received",true));
   }else{
      criteria.add(Restrictions.eq("received",false));
   }
}


		req.setAttribute("contracts",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Contract contract = (Contract) iter.next();
//			vector.add(contract);
//		}
		Contract contract = new ContractImpl();
		ContractForm contractform = new ContractForm();
		criteria = session.createCriteria(Contract.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			contract = (Contract) criteria.uniqueResult();
			new CopyProperties(contract,contractform);
		} else if(req.getAttribute("form")!=null){
                        contractform = (ContractForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(contractform.getId()));
			contract = (Contract) criteria.uniqueResult();
		}
		

		req.setAttribute("model",contract);
		req.setAttribute("form",contractform);
		
		


                  Criteria criteriaCustomer= session.createCriteria(Customer.class);
			req.setAttribute("Customers", criteriaCustomer.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}