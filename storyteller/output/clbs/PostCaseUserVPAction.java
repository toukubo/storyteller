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


public class PostCaseUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CaseUser caseUser = new CaseUserImpl();
		CaseUserForm caseUserform = (CaseUserForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(caseUserform.getId() == null || caseUserform.getId().intValue() == 0){
			caseUser.setId(null);
			caseUserform.setId(null);
		}else{
			caseUser.setId(caseUserform.getId());
			Criteria criteria = session.createCriteria(CaseUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			caseUser = (CaseUser) criteria.uniqueResult();

		}
                		caseUser.setAccount(caseUserform.getAccount());
		caseUser.setBodyweight(caseUserform.getBodyweight());
		caseUser.setName(caseUserform.getName());
		caseUser.setSex(caseUserform.isSex());
		caseUser.setAge(caseUserform.getAge());
		caseUser.setHeight(caseUserform.getHeight());
		caseUser.setOnsetage(caseUserform.getOnsetage());
		caseUser.setCurebeforoperation(caseUserform.getCurebeforoperation());


		
		StringFullfiller.fullfil(caseUser);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(caseUser);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCaseUserDetail.do", caseUser.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "CaseUsers.do", caseUser.getId().toString());
		return null;

		
	}
	
	
}