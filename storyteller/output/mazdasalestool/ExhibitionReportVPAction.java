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

public class ExhibitionReportVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExhibitionReport exhibitionReport = new ExhibitionReportImpl();
		ExhibitionReportForm exhibitionReportform = (ExhibitionReportForm) form;
		
                		Integer exhibitionInt = exhibitionReportform.getExhibition();
		exhibitionReportform.setExhibition(null);

		
		BeanUtils.copyProperties(exhibitionReport,exhibitionReportform);
		StringFullfiller.fullfil(exhibitionReport);
		if(exhibitionReportform.getId() == null || exhibitionReportform.getId().intValue() == 0){
			exhibitionReport.setId(null);
		}else{
			exhibitionReport.setId(exhibitionReportform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Exhibition.class);
		criteria2.add(Restrictions.idEq(exhibitionInt));
		Exhibition exhibition = (Exhibition) criteria2.uniqueResult();
		exhibitionReport.setExhibition(exhibition);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(exhibitionReport);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ExhibitionReportDetail.do", exhibitionReport.getId().toString());
		return null;

		
	}
	
	
}