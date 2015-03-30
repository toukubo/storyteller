package net.secretarize.web.app;

import net.secretarize.model.*;
import net.secretarize.beans.*;

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


public class PostAccountVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Account account = new AccountImpl();
		AccountForm accountform = (AccountForm) form;

                String error = "";


                		Integer publicUserInt = accountform.getPublicUser();
		accountform.setPublicUser(null);
		Integer serviceInt = accountform.getService();
		accountform.setService(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(accountform.getId() == null || accountform.getId().intValue() == 0){
			account.setId(null);
			accountform.setId(null);
		}else{
			account.setId(accountform.getId());
			Criteria criteria = session.createCriteria(Account.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			account = (Account) criteria.uniqueResult();

		}
                		account.setPassword(accountform.getPassword());
		account.setAccount(accountform.getAccount());


		
		StringFullfiller.fullfil(account);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		account.setPublicUser(publicuser);
		criteria2 = session.createCriteria(Service.class);
		criteria2.add(Restrictions.idEq(serviceInt));
		Service service = (Service) criteria2.uniqueResult();
		account.setService(service);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(account);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAccountDetail.do", account.getId().toString());
		return null;

		
	}
	
	
}