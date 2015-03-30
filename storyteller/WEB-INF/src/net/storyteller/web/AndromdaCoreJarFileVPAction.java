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

public class AndromdaCoreJarFileVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		AndromdaCoreJarFile andromdacorejarfile = new AndromdaCoreJarFileImpl();
		AndromdaCoreJarFileForm andromdacorejarfileform = (AndromdaCoreJarFileForm) form;
		
                		Integer j2eeStoryInt = andromdacorejarfileform.getj2eeStory();
		andromdacorejarfileform.setj2eeStory(null);

		
		BeanUtils.copyProperties(andromdacorejarfile,andromdacorejarfileform);
		StringFullfiller.fullfil(andromdacorejarfile);
		if(andromdacorejarfileform.getId() == null || andromdacorejarfileform.getId().intValue() == 0){
			andromdacorejarfile.setId(null);
		}else{
			andromdacorejarfile.setId(andromdacorejarfileform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(J2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		AndromdaCoreJarFile.setJ2eeStory(j2eestory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(andromdacorejarfile);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "AndromdaCoreJarFileDetail.do", andromdacorejarfile.getId().toString());
		return null;

		
	}
	
	
}


