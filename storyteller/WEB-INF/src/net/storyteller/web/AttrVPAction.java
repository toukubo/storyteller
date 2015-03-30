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

public class AttrVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Attr attr = new AttrImpl();
		AttrForm attrform = (AttrForm) form;
		
                		Integer nounInt = attrform.getnoun();
		attrform.setnoun(null);

		
		BeanUtils.copyProperties(attr,attrform);
		StringFullfiller.fullfil(attr);
		if(attrform.getId() == null || attrform.getId().intValue() == 0){
			attr.setId(null);
		}else{
			attr.setId(attrform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Noun.class);
		criteria2.add(Restrictions.idEq(NounInt));
		Noun noun = (Noun) criteria2.uniqueResult();
		Attr.setNoun(noun);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(attr);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "AttrDetail.do", attr.getId().toString());
		return null;

		
	}
	
	
}


