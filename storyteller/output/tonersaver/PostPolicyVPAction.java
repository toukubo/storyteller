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


public class PostPolicyVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Policy policy = new PolicyImpl();
		PolicyForm policyform = (PolicyForm) form;

                String error = "";
if(StringUtils.isBlank(policyform.getDecreasedrateforall())){
   error += "全てのプリンターの削減率は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("decreasedrateforall"))){
    error += "全てのプリンターの削減率には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(policyform.getPriviledgeowner())){
   error += "は空にはできません。<br />"; 
}

if(StringUtils.isBlank(policyform.getSavingratefornewprinters())){
   error += "新規追加プリンターの削減率は空にはできません。<br />"; 
}

if(StringUtils.isBlank(policyform.getSavingratefornewprinters())){
   error += "新規追加プリンターの削減率は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("savingratefornewprinters"))){
    error += "新規追加プリンターの削減率には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("savingratefornewprinters"))){
    error += "新規追加プリンターの削減率には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(policyform.getTimetokeeplog())){
   error += "保存期間は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("timetokeeplog"))){
    error += "保存期間には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(policyform.getLogserverhostaddress())){
   error += "サーバー名orIPアドレスは空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",policyform);
	return mapping.findForward("error");
}


                
		
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
                		policy.setDecreasedrateforall(policyform.getDecreasedrateforall());
		policy.setPriviledgeowner(policyform.getPriviledgeowner());
		policy.setSavingratefornewprinters(policyform.getSavingratefornewprinters());
		policy.setTimetokeeplog(policyform.getTimetokeeplog());
		policy.setLogserverhostaddress(policyform.getLogserverhostaddress());


		
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