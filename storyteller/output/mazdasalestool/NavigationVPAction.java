package net.mazdasalestool.web;

import net.mazdasalestool.model.*;
import net.mazdasalestool.model.crud.*;

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

public class NavigationVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Navigation navigation = new NavigationImpl();
		NavigationForm navigationform = (NavigationForm) form;
		
                
		
		BeanUtils.copyProperties(navigation,navigationform);
		StringFullfiller.fullfil(navigation);
		if(navigationform.getId() == null || navigationform.getId().intValue() == 0){
			navigation.setId(null);
		}else{
			navigation.setId(navigationform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(navigation);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "NavigationDetail.do", navigation.getId().toString());
		return null;

		
	}
	
	
}