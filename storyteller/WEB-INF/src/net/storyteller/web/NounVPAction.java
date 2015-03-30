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

public class NounVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Noun noun = new NounImpl();
		NounForm nounform = (NounForm) form;
		
                		Integer j2eeStoryInt = nounform.getj2eeStory();
		nounform.setj2eeStory(null);

		
		BeanUtils.copyProperties(noun,nounform);
		StringFullfiller.fullfil(noun);
		if(nounform.getId() == null || nounform.getId().intValue() == 0){
			noun.setId(null);
		}else{
			noun.setId(nounform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(J2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		Noun.setJ2eeStory(j2eestory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(noun);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "NounDetail.do", noun.getId().toString());
		return null;

		
	}
	
	
}


