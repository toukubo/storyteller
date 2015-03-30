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


public class PostAdminVPForChangingPasswordAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Admin admin = new AdminImpl();
		AdminForm adminform = (AdminForm) form;

                String error = "";
if(StringUtils.isBlank(adminform.getNewpasswordconfirmation())){
   error += "新しいパスワード（確認）は空にはできません。<br />"; 
}

        if(!adminform.getNewpasswordconfirmation().matches("\p{Alnum}*")){
   error += "新しいパスワード（確認）は半角英数字のみです。";
}
if(StringUtils.isBlank(adminform.getNewpassword())){
   error += "新しいパスワードは空にはできません。<br />"; 
}

        if(!adminform.getNewpassword().matches("\p{Alnum}*")){
   error += "新しいパスワードは半角英数字のみです。";
}
if(StringUtils.isBlank(adminform.getPassword())){
   error += "パスワードは空にはできません。<br />"; 
}

        if(!adminform.getPassword().matches("\p{Alnum}*")){
   error += "パスワードは半角英数字のみです。";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",adminform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(adminform.getId() == null || adminform.getId().intValue() == 0){
			admin.setId(null);
			adminform.setId(null);
		}else{
			admin.setId(adminform.getId());
			Criteria criteria = session.createCriteria(Admin.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			admin = (Admin) criteria.uniqueResult();

		}
                		admin.setNewpasswordconfirmation(adminform.getNewpasswordconfirmation());
		admin.setNewpassword(adminform.getNewpassword());
		admin.setPassword(adminform.getPassword());


		
		StringFullfiller.fullfil(admin);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(admin);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAdminDetail.do", admin.getId().toString());
		return null;

		
	}
	
	
}