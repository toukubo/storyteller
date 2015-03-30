package net.clbs.web.app;

import net.clbs.model.*;
import net.clbs.beans.*;

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


public class PostOperationVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Operation operation = new OperationImpl();
		OperationForm operationform = (OperationForm) form;

                String error = "";
if(!operationform.isdatetimeIsValid()){
   error += "日時 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isBlank(req.getParameter("datetime"))){
    error += "日時は空にはできません。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("bs"))){
    error += "血糖値には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(req.getParameter("bs"))){
    error += "血糖値は空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("caseUser"))){
    error += "は空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("intraUser"))){
    error += "内部ユーザーは空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("diseasename"))){
    error += "は空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("name"))){
    error += "名前は空にはできません。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",operationform);
	return mapping.findForward("error");
}


                		Integer caseUserInt = operationform.getCaseUser();
		operationform.setCaseUser(null);
		Integer intraUserInt = operationform.getIntraUser();
		operationform.setIntraUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(operationform.getId() == null || operationform.getId().intValue() == 0){
			operation.setId(null);
			operationform.setId(null);
		}else{
			operation.setId(operationform.getId());
			Criteria criteria = session.createCriteria(Operation.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			operation = (Operation) criteria.uniqueResult();

		}
                		operation.setDatetime(operationform.getDatetime());
		operation.setBs(operationform.getBs());
		operation.setDiseasename(operationform.getDiseasename());
		operation.setName(operationform.getName());


		
		StringFullfiller.fullfil(operation);
                		Criteria criteria2 = session.createCriteria(CaseUser.class);
		criteria2.add(Restrictions.idEq(caseUserInt));
		CaseUser caseuser = (CaseUser) criteria2.uniqueResult();
		operation.setCaseUser(caseuser);
		criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		operation.setIntraUser(intrauser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(operation);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostOperationDetail.do", operation.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Operations.do", operation.getId().toString());
		return null;

		
	}
	
	
}