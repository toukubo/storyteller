package net.storyteller.web;

import net.storyteller.beans.AttrUseForm;
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
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AttrUseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		AttrUse attruse = new AttrUseImpl();
		AttrUseForm attruseform = (AttrUseForm) form;
		
                		Integer attrInt = attruseform.getAttr();
		attruseform.setAttr(null);
		Integer nounUseInt = attruseform.getNounUse();
		attruseform.setNounUse(null);

		
		BeanUtils.copyProperties(attruse,attruseform);
		StringFullfiller.fullfil(attruse);
		if(attruseform.getId() == null || attruseform.getId().intValue() == 0){
			attruse.setId(null);
		}else{
			attruse.setId(attruseform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Attr.class);
		criteria2.add(Restrictions.idEq(attrInt));
		Attr attr = (Attr) criteria2.uniqueResult();
		attruse.setAttr(attr);
		criteria2 = session.createCriteria(NounUse.class);
		criteria2.add(Restrictions.idEq(nounUseInt));
		NounUse nounuse = (NounUse) criteria2.uniqueResult();
		attruse.setNounUse(nounuse);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(attruse);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "AttrUseDetail.do", attruse.getId().toString());
		return null;

		
	}
	
	
}