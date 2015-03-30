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

public class CommonTranslationVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CommonTranslation commonTranslation = new CommonTranslationImpl();
		CommonTranslationForm commonTranslationform = (CommonTranslationForm) form;
		
                
		
		BeanUtils.copyProperties(commonTranslation,commonTranslationform);
		StringFullfiller.fullfil(commonTranslation);
		if(commonTranslationform.getId() == null || commonTranslationform.getId().intValue() == 0){
			commonTranslation.setId(null);
		}else{
			commonTranslation.setId(commonTranslationform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(commonTranslation);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "CommonTranslationDetail.do", commonTranslation.getId().toString());
		return null;

		
	}
	
	
}