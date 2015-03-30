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


public class PostAdminVPForResettingPasswordAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Admin admin = new AdminImpl();
		AdminForm adminform = (AdminForm) form;

                String error = "";


                		Integer priviledgeInt = adminform.getPriviledge();
		adminform.setPriviledge(null);

		
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
                		admin.setPagesize(adminform.getPagesize());
		admin.setPassword(adminform.getPassword());
		admin.setPasswordchanged(adminform.isPasswordchanged());
		admin.setName(adminform.getName());
		admin.setNewpasswordconfirmation(adminform.getNewpasswordconfirmation());
		admin.setNewpassword(adminform.getNewpassword());
		admin.setAccountstatus(adminform.getAccountstatus());
		admin.setDecimallevel(adminform.getDecimallevel());
		admin.setDisplayssummery(adminform.isDisplayssummery());
		admin.setRemoved(adminform.isRemoved());


		
		StringFullfiller.fullfil(admin);
                		Criteria criteria2 = session.createCriteria(Priviledge.class);
		criteria2.add(Restrictions.idEq(priviledgeInt));
		Priviledge priviledge = (Priviledge) criteria2.uniqueResult();
		admin.setPriviledge(priviledge);


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