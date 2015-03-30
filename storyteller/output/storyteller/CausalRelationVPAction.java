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

public class CausalRelationVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CausalRelation causalRelation = new CausalRelationImpl();
		CausalRelationForm causalRelationform = (CausalRelationForm) form;
		
                		Integer attrInt = causalRelationform.getAttr();
		causalRelationform.setAttr(null);

		
		BeanUtils.copyProperties(causalRelation,causalRelationform);
		StringFullfiller.fullfil(causalRelation);
		if(causalRelationform.getId() == null || causalRelationform.getId().intValue() == 0){
			causalRelation.setId(null);
		}else{
			causalRelation.setId(causalRelationform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Attr.class);
		criteria2.add(Restrictions.idEq(attrInt));
		Attr attr = (Attr) criteria2.uniqueResult();
		causalRelation.setAttr(attr);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(causalRelation);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "CausalRelationDetail.do", causalRelation.getId().toString());
		return null;

		
	}
	
	
}