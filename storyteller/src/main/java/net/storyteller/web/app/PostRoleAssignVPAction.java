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


public class PostRoleAssignVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		RoleAssign roleAssign = new RoleAssignImpl();
		RoleAssignForm roleAssignform = (RoleAssignForm) form;

                String error = "";


                		Integer intraUserInt = roleAssignform.getIntraUser();
		roleAssignform.setIntraUser(null);
		Integer storytellerRoleInt = roleAssignform.getStorytellerRole();
		roleAssignform.setStorytellerRole(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(roleAssignform.getId() == null || roleAssignform.getId().intValue() == 0){
			roleAssign.setId(null);
			roleAssignform.setId(null);
		}else{
			roleAssign.setId(roleAssignform.getId());
			Criteria criteria = session.createCriteria(RoleAssign.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			roleAssign = (RoleAssign) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(roleAssign);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		roleAssign.setIntraUser(intrauser);
		criteria2 = session.createCriteria(StorytellerRole.class);
		criteria2.add(Restrictions.idEq(storytellerRoleInt));
		StorytellerRole storytellerrole = (StorytellerRole) criteria2.uniqueResult();
		roleAssign.setStorytellerRole(storytellerrole);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(roleAssign);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostRoleAssignDetail.do", roleAssign.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "RoleAssigns.do", roleAssign.getId().toString());
		return null;

		
	}
	
	
}