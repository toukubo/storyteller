package net.clbs.web;

import net.clbs.model.*;
import net.clbs.model.crud.*;

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

public class OperationVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Operation operation = new OperationImpl();
		OperationForm operationform = (OperationForm) form;
		
                		Integer intraUserInt = operationform.getIntraUser();
		operationform.setIntraUser(null);
		Integer caseUserInt = operationform.getCaseUser();
		operationform.setCaseUser(null);

		
		BeanUtils.copyProperties(operation,operationform);
		StringFullfiller.fullfil(operation);
		if(operationform.getId() == null || operationform.getId().intValue() == 0){
			operation.setId(null);
		}else{
			operation.setId(operationform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		operation.setIntraUser(intrauser);
		criteria2 = session.createCriteria(CaseUser.class);
		criteria2.add(Restrictions.idEq(caseUserInt));
		CaseUser caseuser = (CaseUser) criteria2.uniqueResult();
		operation.setCaseUser(caseuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(operation);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "OperationDetail.do", operation.getId().toString());
		return null;

		
	}
	
	
}