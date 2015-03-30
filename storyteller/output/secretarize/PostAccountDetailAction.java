package net.secretarize.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.secretarize.model.*;
import net.secretarize.beans.*;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class PostAccountDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Account account = new AccountImpl();
		AccountForm accountform = new AccountForm();
		Criteria criteria = session.createCriteria(Account.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			account = (Account) criteria.uniqueResult();
			new CopyProperties(account,accountform);
		} else if(req.getAttribute("form")!=null){
                        accountform = (AccountForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(accountform.getId()));
			account = (Account) criteria.uniqueResult();
		}
		

		req.setAttribute("model",account);
		req.setAttribute("form",accountform);


                  Criteria criteriaPublicUser= session.createCriteria(PublicUser.class);
			req.setAttribute("PublicUsers", criteriaPublicUser.list());

Criteria criteriaService= session.createCriteria(Service.class);
			req.setAttribute("Services", criteriaService.list());

 
		
		return mapping.findForward("success");
	}
	
	
}