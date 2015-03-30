package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Contract contract = (Contract) iter.next();
			vector.add(contract);
		}
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
		
		
		req.setAttribute("contracts",vector);


                  Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

Criteria criteriaClient= session.createCriteria(Client.class);
			req.setAttribute("Clients", criteriaClient.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}