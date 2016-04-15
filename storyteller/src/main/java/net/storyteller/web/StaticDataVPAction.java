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

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class StaticDataVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		StaticData staticdata = new StaticDataImpl();
		StaticDataForm staticdataform = (StaticDataForm) form;
		
                
		
		BeanUtils.copyProperties(staticdata,staticdataform);
		StringFullfiller.fullfil(staticdata);
		if(staticdataform.getId() == null || staticdataform.getId().intValue() == 0){
			staticdata.setId(null);
		}else{
			staticdata.setId(staticdataform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(staticdata);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "StaticDataDetail.do", staticdata.getId().toString());
		return null;

		
	}
	
	
}


