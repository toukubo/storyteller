package net.storyteller.web;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

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

public class IntraUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		IntraUser intraUser = new IntraUserImpl();
		IntraUserForm intraUserform = (IntraUserForm) form;
		
                
		
		BeanUtils.copyProperties(intraUser,intraUserform);
		StringFullfiller.fullfil(intraUser);
		if(intraUserform.getId() == null || intraUserform.getId().intValue() == 0){
			intraUser.setId(null);
		}else{
			intraUser.setId(intraUserform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(intraUser);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "IntraUserDetail.do", intraUser.getId().toString());
		return null;

		
	}
	
	
}