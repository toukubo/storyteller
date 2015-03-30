package net.djbi.web.app;

import net.djbi.model.*;
import net.djbi.beans.*;

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


public class PostUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		User user = new UserImpl();
		UserForm userform = (UserForm) form;

                String error = "";


                		Integer privilegeInt = userform.getPrivilege();
		userform.setPrivilege(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(userform.getId() == null || userform.getId().intValue() == 0){
			user.setId(null);
			userform.setId(null);
		}else{
			user.setId(userform.getId());
			Criteria criteria = session.createCriteria(User.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			user = (User) criteria.uniqueResult();

		}
                		user.setPassword(userform.getPassword());
		user.setMail(userform.getMail());
		user.setName(userform.getName());


		
		StringFullfiller.fullfil(user);
                		Criteria criteria2 = session.createCriteria(Privilege.class);
		criteria2.add(Restrictions.idEq(privilegeInt));
		Privilege privilege = (Privilege) criteria2.uniqueResult();
		user.setPrivilege(privilege);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(user);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostUserDetail.do", user.getId().toString());
		return null;

		
	}
	
	
}