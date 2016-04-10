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


public class PostStorytellerRoleVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		StorytellerRole storytellerRole = new StorytellerRoleImpl();
		StorytellerRoleForm storytellerRoleform = (StorytellerRoleForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(storytellerRoleform.getId() == null || storytellerRoleform.getId().intValue() == 0){
			storytellerRole.setId(null);
			storytellerRoleform.setId(null);
		}else{
			storytellerRole.setId(storytellerRoleform.getId());
			Criteria criteria = session.createCriteria(StorytellerRole.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			storytellerRole = (StorytellerRole) criteria.uniqueResult();

		}
                		storytellerRole.setName(storytellerRoleform.getName());


		
		StringFullfiller.fullfil(storytellerRole);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(storytellerRole);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostStorytellerRoleDetail.do", storytellerRole.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "AjaxDisplayStorytellerRoles.do", null);
		return null;

		
	}
	
	
}