package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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


public class PostContractVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Contract contract = new ContractImpl();
		ContractForm contractform = (ContractForm) form;

                String error = "";


                		Integer organizationInt = contractform.getOrganization();
		contractform.setOrganization(null);
		Integer jobInt = contractform.getJob();
		contractform.setJob(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(contractform.getId() == null || contractform.getId().intValue() == 0){
			contract.setId(null);
			contractform.setId(null);
		}else{
			contract.setId(contractform.getId());
			Criteria criteria = session.createCriteria(Contract.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			contract = (Contract) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(contract);
                		Criteria criteria2 = session.createCriteria(Organization.class);
		criteria2.add(Restrictions.idEq(organizationInt));
		Organization organization = (Organization) criteria2.uniqueResult();
		contract.setOrganization(organization);
		criteria2 = session.createCriteria(Job.class);
		criteria2.add(Restrictions.idEq(jobInt));
		Job job = (Job) criteria2.uniqueResult();
		contract.setJob(job);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(contract);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostContractDetail.do", contract.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Contracts.do", contract.getId().toString());
		return null;

		
	}
	
	
}