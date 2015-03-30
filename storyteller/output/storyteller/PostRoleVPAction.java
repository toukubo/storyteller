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


public class PostRoleVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Role role = new RoleImpl();
		RoleForm roleform = (RoleForm) form;

                String error = "";


                		Integer intraUserInt = roleform.getIntraUser();
		roleform.setIntraUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(roleform.getId() == null || roleform.getId().intValue() == 0){
			role.setId(null);
			roleform.setId(null);
		}else{
			role.setId(roleform.getId());
			Criteria criteria = session.createCriteria(Role.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			role = (Role) criteria.uniqueResult();

		}
                		role.setName(roleform.getName());


		
		StringFullfiller.fullfil(role);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		role.setIntraUser(intrauser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(role);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostRoleDetail.do", role.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Roles.do", role.getId().toString());
		return null;

		
	}
	
	
}