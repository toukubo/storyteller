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

public class ExhibitionIntraUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExhibitionIntraUser exhibitionIntraUser = new ExhibitionIntraUserImpl();
		ExhibitionIntraUserForm exhibitionIntraUserform = (ExhibitionIntraUserForm) form;
		
                		Integer intraUserInt = exhibitionIntraUserform.getIntraUser();
		exhibitionIntraUserform.setIntraUser(null);
		Integer exhibitionInt = exhibitionIntraUserform.getExhibition();
		exhibitionIntraUserform.setExhibition(null);

		
		BeanUtils.copyProperties(exhibitionIntraUser,exhibitionIntraUserform);
		StringFullfiller.fullfil(exhibitionIntraUser);
		if(exhibitionIntraUserform.getId() == null || exhibitionIntraUserform.getId().intValue() == 0){
			exhibitionIntraUser.setId(null);
		}else{
			exhibitionIntraUser.setId(exhibitionIntraUserform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		exhibitionIntraUser.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Exhibition.class);
		criteria2.add(Restrictions.idEq(exhibitionInt));
		Exhibition exhibition = (Exhibition) criteria2.uniqueResult();
		exhibitionIntraUser.setExhibition(exhibition);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(exhibitionIntraUser);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ExhibitionIntraUserDetail.do", exhibitionIntraUser.getId().toString());
		return null;

		
	}
	
	
}