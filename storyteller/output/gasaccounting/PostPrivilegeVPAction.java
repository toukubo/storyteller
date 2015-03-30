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


public class PostPrivilegeVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Privilege privilege = new PrivilegeImpl();
		PrivilegeForm privilegeform = (PrivilegeForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(privilegeform.getId() == null || privilegeform.getId().intValue() == 0){
			privilege.setId(null);
			privilegeform.setId(null);
		}else{
			privilege.setId(privilegeform.getId());
			Criteria criteria = session.createCriteria(Privilege.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			privilege = (Privilege) criteria.uniqueResult();

		}
                		privilege.setName(privilegeform.getName());


		
		StringFullfiller.fullfil(privilege);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(privilege);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostPrivilegeDetail.do", privilege.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Privileges.do", privilege.getId().toString());
		return null;

		
	}
	
	
}