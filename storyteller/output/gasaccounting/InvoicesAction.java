package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class InvoicesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Invoice.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Invoice invoice = (Invoice) iter.next();
			vector.add(invoice);
		}
		Invoice invoice = new InvoiceImpl();
		InvoiceForm invoiceform = new InvoiceForm();
		criteria = session.createCriteria(Invoice.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			invoice = (Invoice) criteria.uniqueResult();
			new CopyProperties(invoice,invoiceform);
		} else if(req.getAttribute("form")!=null){
                        invoiceform = (InvoiceForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(invoiceform.getId()));
			invoice = (Invoice) criteria.uniqueResult();
		}
		

		req.setAttribute("model",invoice);
		req.setAttribute("form",invoiceform);
		
		
		req.setAttribute("invoices",vector);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaJob= session.createCriteria(Job.class);
			req.setAttribute("Jobs", criteriaJob.list());

Criteria criteriaOrganization= session.createCriteria(Organization.class);
			req.setAttribute("Organizations", criteriaOrganization.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}