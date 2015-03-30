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

public class JspVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Jsp jsp = new JspImpl();
		JspForm jspform = (JspForm) form;
		
                		Integer sentenceInt = jspform.getsentence();
		jspform.setsentence(null);

		
		BeanUtils.copyProperties(jsp,jspform);
		StringFullfiller.fullfil(jsp);
		if(jspform.getId() == null || jspform.getId().intValue() == 0){
			jsp.setId(null);
		}else{
			jsp.setId(jspform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Sentence.class);
		criteria2.add(Restrictions.idEq(SentenceInt));
		Sentence sentence = (Sentence) criteria2.uniqueResult();
		Jsp.setSentence(sentence);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(jsp);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "JspDetail.do", jsp.getId().toString());
		return null;

		
	}
	
	
}


