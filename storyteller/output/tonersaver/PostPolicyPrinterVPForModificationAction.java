package net.tonersaver.web.app;

import net.tonersaver.model.*;
import net.tonersaver.beans.*;

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


public class PostPolicyPrinterVPForModificationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		PolicyPrinter policyPrinter = new PolicyPrinterImpl();
		PolicyPrinterForm policyPrinterform = (PolicyPrinterForm) form;

                String error = "";


                		Integer policyInt = policyPrinterform.getPolicy();
		policyPrinterform.setPolicy(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(policyPrinterform.getId() == null || policyPrinterform.getId().intValue() == 0){
			policyPrinter.setId(null);
			policyPrinterform.setId(null);
		}else{
			policyPrinter.setId(policyPrinterform.getId());
			Criteria criteria = session.createCriteria(PolicyPrinter.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			policyPrinter = (PolicyPrinter) criteria.uniqueResult();

		}
                		policyPrinter.setPriviledgeowner(policyPrinterform.getPriviledgeowner());
		policyPrinter.setSavingrate(policyPrinterform.getSavingrate());


		
		StringFullfiller.fullfil(policyPrinter);
                		Criteria criteria2 = session.createCriteria(Policy.class);
		criteria2.add(Restrictions.idEq(policyInt));
		Policy policy = (Policy) criteria2.uniqueResult();
		policyPrinter.setPolicy(policy);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(policyPrinter);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPolicyPrinterDetail.do", policyPrinter.getId().toString());
		return null;

		
	}
	
	
}