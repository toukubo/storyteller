package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class PostBasecampAccountVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		BasecampAccount basecampAccount = new BasecampAccountImpl();
		BasecampAccountForm basecampAccountform = (BasecampAccountForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(basecampAccountform.getId() == null || basecampAccountform.getId().intValue() == 0){
			basecampAccount.setId(null);
			basecampAccountform.setId(null);
		}else{
			basecampAccount.setId(basecampAccountform.getId());
			basecampAccount.setUrl(basecampAccountform.getUrl());
			Criteria criteria = session.createCriteria(BasecampAccount.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			basecampAccount = (BasecampAccount) criteria.uniqueResult();

		}
		basecampAccount.setApid(basecampAccountform.getApid());
		basecampAccount.setUrl(basecampAccountform.getUrl());
		basecampAccount.setAccount(basecampAccountform.getAccount());
		basecampAccount.setPassword(basecampAccountform.getPassword());


		
		StringFullfiller.fullfil(basecampAccount);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(basecampAccount);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBasecampAccountDetail.do", basecampAccount.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "BasecampAccounts.do", basecampAccount.getId().toString());
		return null;

		
	}
	
	
}