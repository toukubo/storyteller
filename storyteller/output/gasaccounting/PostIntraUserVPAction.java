package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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


public class PostIntraUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		IntraUser intrauser = new IntraUserImpl();
		IntraUserForm intrauserform = (IntraUserForm) form;

                String error = "";
if(StringUtils.isBlank(intrauserform.getCode())){
   error += "コードは空にはできません。<br />"; 
}

if(StringUtils.isBlank(intrauserform.getSex())){
   error += "性別は空にはできません。<br />"; 
}

if(StringUtils.isBlank(intrauserform.getFamilyname())){
   error += "姓は空にはできません。<br />"; 
}

if(StringUtils.isBlank(intrauserform.getName())){
   error += "名前は空にはできません。<br />"; 
}

if(StringUtils.isBlank(intrauserform.getPassword())){
   error += "パスワードは空にはできません。<br />"; 
}

if(StringUtils.isBlank(intrauserform.getAccount())){
   error += "アカウントは空にはできません。<br />"; 
}

if(StringUtils.isBlank(intrauserform.getMail())){
   error += "メールは空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",intrauserform);
	return mapping.findForward("error");
}


                		Integer privilegeInt = intrauserform.getPrivilege();
		intrauserform.setPrivilege(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(intrauserform.getId() == null || intrauserform.getId().intValue() == 0){
			intrauser.setId(null);
			intrauserform.setId(null);
		}else{
			intrauser.setId(intrauserform.getId());
			Criteria criteria = session.createCriteria(IntraUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			intrauser = (IntraUser) criteria.uniqueResult();

		}
                		intrauser.setCode(intrauserform.getCode());
		intrauser.setPhonenum(intrauserform.getPhonenum());
		intrauser.setSex(intrauserform.getSex());
		intrauser.setFamilyname(intrauserform.getFamilyname());
		intrauser.setName(intrauserform.getName());
		intrauser.setFlag(intrauserform.getFlag());
		intrauser.setAddress(intrauserform.getAddress());
		intrauser.setPassword(intrauserform.getPassword());
		intrauser.setAccount(intrauserform.getAccount());
		intrauser.setMail(intrauserform.getMail());


		
		StringFullfiller.fullfil(intrauser);
                		Criteria criteria2 = session.createCriteria(Privilege.class);
		criteria2.add(Restrictions.idEq(privilegeInt));
		Privilege privilege = (Privilege) criteria2.uniqueResult();
		intrauser.setPrivilege(privilege);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(intrauser);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostIntraUserDetail.do", intrauser.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "IntraUsers.do", intrauser.getId().toString());
		return null;

		
	}
	
	
}