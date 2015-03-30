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


public class PostUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		User user = new UserImpl();
		UserForm userform = (UserForm) form;

                String error = "";
if(StringUtils.isBlank(userform.getDepartment())){
   error += "部署は空にはできません。<br />"; 
}

if(StringUtils.isBlank(userform.getName())){
   error += "ユーザー氏名は空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",userform);
	return mapping.findForward("error");
}


                		Integer departmentInt = userform.getDepartment();
		userform.setDepartment(null);

		
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
                		user.setName(userform.getName());


		
		StringFullfiller.fullfil(user);
                		Criteria criteria2 = session.createCriteria(Department.class);
		criteria2.add(Restrictions.idEq(departmentInt));
		Department department = (Department) criteria2.uniqueResult();
		user.setDepartment(department);


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