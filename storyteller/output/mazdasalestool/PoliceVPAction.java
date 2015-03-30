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

public class PoliceVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Police police = new PoliceImpl();
		PoliceForm policeform = (PoliceForm) form;
		
                
		
		BeanUtils.copyProperties(police,policeform);
		StringFullfiller.fullfil(police);
		if(policeform.getId() == null || policeform.getId().intValue() == 0){
			police.setId(null);
		}else{
			police.setId(policeform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(police);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "PoliceDetail.do", police.getId().toString());
		return null;

		
	}
	
	
}