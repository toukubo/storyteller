package net.universe.web;

import net.universe.model.*;
import net.universe.model.crud.*;

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

public class ContractVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Contract contract = new ContractImpl();
		ContractForm contractform = (ContractForm) form;
		
                		Integer customerInt = contractform.getCustomer();
		contractform.setCustomer(null);
		Integer narratorInt = contractform.getNarrator();
		contractform.setNarrator(null);

		
		BeanUtils.copyProperties(contract,contractform);
		StringFullfiller.fullfil(contract);
		if(contractform.getId() == null || contractform.getId().intValue() == 0){
			contract.setId(null);
		}else{
			contract.setId(contractform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Customer.class);
		criteria2.add(Restrictions.idEq(customerInt));
		Customer customer = (Customer) criteria2.uniqueResult();
		contract.setCustomer(customer);
		criteria2 = session.createCriteria(Narrator.class);
		criteria2.add(Restrictions.idEq(narratorInt));
		Narrator narrator = (Narrator) criteria2.uniqueResult();
		contract.setNarrator(narrator);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(contract);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ContractDetail.do", contract.getId().toString());
		return null;

		
	}
	
	
}