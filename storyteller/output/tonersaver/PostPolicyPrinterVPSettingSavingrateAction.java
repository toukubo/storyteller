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


public class PostPolicyPrinterVPSettingSavingrateAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		PolicyPrinter policyPrinter = new PolicyPrinterImpl();
		PolicyPrinterForm policyPrinterform = (PolicyPrinterForm) form;

                String error = "";
if(StringUtils.isBlank(req.getParameter("savingrate"))){
    error += "は空にはできません。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("savingrate"))){
    error += "には数値のみを入れてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",policyPrinterform);
	return mapping.findForward("error");
}


                
		
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
                		policyPrinter.setSavingrate(policyPrinterform.getSavingrate());


		
		StringFullfiller.fullfil(policyPrinter);
                

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