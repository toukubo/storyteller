package net.keionbu.web;

import net.keionbu.model.*;
import net.keionbu.model.crud.*;

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

public class StaticDataVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		StaticData staticData = new StaticDataImpl();
		StaticDataForm staticDataform = (StaticDataForm) form;
		
                
		
		BeanUtils.copyProperties(staticData,staticDataform);
		StringFullfiller.fullfil(staticData);
		if(staticDataform.getId() == null || staticDataform.getId().intValue() == 0){
			staticData.setId(null);
		}else{
			staticData.setId(staticDataform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(staticData);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "StaticDataDetail.do", staticData.getId().toString());
		return null;

		
	}
	
	
}