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


public class PostUserVPChangePasswordAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		User user = new UserImpl();
		UserForm userform = (UserForm) form;

                String error = "";


                		Integer departmentInt = userform.getDepartment();
		userform.setDepartment(null);
		Integer policyInt = userform.getPolicy();
		userform.setPolicy(null);

		
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
                		user.setAdname(userform.getAdname());
		user.setName(userform.getName());


		
		StringFullfiller.fullfil(user);
                		Criteria criteria2 = session.createCriteria(Department.class);
		criteria2.add(Restrictions.idEq(departmentInt));
		Department department = (Department) criteria2.uniqueResult();
		user.setDepartment(department);
		criteria2 = session.createCriteria(Policy.class);
		criteria2.add(Restrictions.idEq(policyInt));
		Policy policy = (Policy) criteria2.uniqueResult();
		user.setPolicy(policy);


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