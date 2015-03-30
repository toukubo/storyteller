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


public class PostPolicyVPForImportingAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Policy policy = new PolicyImpl();
		PolicyForm policyform = (PolicyForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(policyform.getId() == null || policyform.getId().intValue() == 0){
			policy.setId(null);
			policyform.setId(null);
		}else{
			policy.setId(policyform.getId());
			Criteria criteria = session.createCriteria(Policy.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			policy = (Policy) criteria.uniqueResult();

		}
                		policy.setPriviledgeowner(policyform.getPriviledgeowner());
		policy.setDecreaseratebyprinter(policyform.isDecreaseratebyprinter());
		policy.setDecreasedrateforall(policyform.getDecreasedrateforall());
		policy.setSavingratefornewprinters(policyform.getSavingratefornewprinters());
		policy.setTimetokeeplog(policyform.getTimetokeeplog());
		policy.setDonotdeletelog(policyform.isDonotdeletelog());
		policy.setKeeplog(policyform.isKeeplog());
		policy.setKeeplogonserver(policyform.isKeeplogonserver());
		policy.setLogserverhostaddress(policyform.getLogserverhostaddress());
		policy.setExcludesapplications(policyform.isExcludesapplications());
		policy.setExcludesprinters(policyform.isExcludesprinters());
		policy.setTemp(policyform.isTemp());
		policy.setName(policyform.getName());
		policy.setTransfarport(policyform.getTransfarport());
		policy.setTransfarintcp(policyform.isTransfarintcp());
		policy.setUseserverforpolicyconfig(policyform.isUseserverforpolicyconfig());
		policy.setLisenceserviceport(policyform.getLisenceserviceport());
		policy.setTransfarslog(policyform.isTransfarslog());


		
		StringFullfiller.fullfil(policy);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(policy);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPolicyDetail.do", policy.getId().toString());
		return null;

		
	}
	
	
}