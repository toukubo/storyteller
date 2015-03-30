package net.mazdasalestool.web;

import net.mazdasalestool.model.*;
import net.mazdasalestool.model.crud.*;

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

public class ExhibitionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Exhibition exhibition = new ExhibitionImpl();
		ExhibitionForm exhibitionform = (ExhibitionForm) form;
		
                		Integer baseInt = exhibitionform.getBase();
		exhibitionform.setBase(null);

		
		BeanUtils.copyProperties(exhibition,exhibitionform);
		StringFullfiller.fullfil(exhibition);
		if(exhibitionform.getId() == null || exhibitionform.getId().intValue() == 0){
			exhibition.setId(null);
		}else{
			exhibition.setId(exhibitionform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Base.class);
		criteria2.add(Restrictions.idEq(baseInt));
		Base base = (Base) criteria2.uniqueResult();
		exhibition.setBase(base);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(exhibition);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ExhibitionDetail.do", exhibition.getId().toString());
		return null;

		
	}
	
	
}