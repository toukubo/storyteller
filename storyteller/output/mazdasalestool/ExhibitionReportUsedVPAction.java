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

public class ExhibitionReportUsedVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExhibitionReportUsed exhibitionReportUsed = new ExhibitionReportUsedImpl();
		ExhibitionReportUsedForm exhibitionReportUsedform = (ExhibitionReportUsedForm) form;
		
                		Integer exhibitionInt = exhibitionReportUsedform.getExhibition();
		exhibitionReportUsedform.setExhibition(null);

		
		BeanUtils.copyProperties(exhibitionReportUsed,exhibitionReportUsedform);
		StringFullfiller.fullfil(exhibitionReportUsed);
		if(exhibitionReportUsedform.getId() == null || exhibitionReportUsedform.getId().intValue() == 0){
			exhibitionReportUsed.setId(null);
		}else{
			exhibitionReportUsed.setId(exhibitionReportUsedform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Exhibition.class);
		criteria2.add(Restrictions.idEq(exhibitionInt));
		Exhibition exhibition = (Exhibition) criteria2.uniqueResult();
		exhibitionReportUsed.setExhibition(exhibition);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(exhibitionReportUsed);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ExhibitionReportUsedDetail.do", exhibitionReportUsed.getId().toString());
		return null;

		
	}
	
	
}