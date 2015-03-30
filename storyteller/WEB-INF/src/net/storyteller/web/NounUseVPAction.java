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

public class NounUseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		NounUse nounuse = new NounUseImpl();
		NounUseForm nounuseform = (NounUseForm) form;
		
                		Integer nounInt = nounuseform.getnoun();
		nounuseform.setnoun(null);
		Integer nounClauseInt = nounuseform.getnounClause();
		nounuseform.setnounClause(null);

		
		BeanUtils.copyProperties(nounuse,nounuseform);
		StringFullfiller.fullfil(nounuse);
		if(nounuseform.getId() == null || nounuseform.getId().intValue() == 0){
			nounuse.setId(null);
		}else{
			nounuse.setId(nounuseform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Noun.class);
		criteria2.add(Restrictions.idEq(NounInt));
		Noun noun = (Noun) criteria2.uniqueResult();
		NounUse.setNoun(noun);
		Criteria criteria2 = session.createCriteria(NounClause.class);
		criteria2.add(Restrictions.idEq(NounClauseInt));
		NounClause nounclause = (NounClause) criteria2.uniqueResult();
		NounUse.setNounClause(nounclause);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(nounuse);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "NounUseDetail.do", nounuse.getId().toString());
		return null;

		
	}
	
	
}


