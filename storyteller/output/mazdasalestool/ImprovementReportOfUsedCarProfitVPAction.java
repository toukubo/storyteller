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

public class ImprovementReportOfUsedCarProfitVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ImprovementReportOfUsedCarProfit improvementReportOfUsedCarProfit = new ImprovementReportOfUsedCarProfitImpl();
		ImprovementReportOfUsedCarProfitForm improvementReportOfUsedCarProfitform = (ImprovementReportOfUsedCarProfitForm) form;
		
                		Integer profitReportOfUsedCarInt = improvementReportOfUsedCarProfitform.getProfitReportOfUsedCar();
		improvementReportOfUsedCarProfitform.setProfitReportOfUsedCar(null);
		Integer baseInt = improvementReportOfUsedCarProfitform.getBase();
		improvementReportOfUsedCarProfitform.setBase(null);

		
		BeanUtils.copyProperties(improvementReportOfUsedCarProfit,improvementReportOfUsedCarProfitform);
		StringFullfiller.fullfil(improvementReportOfUsedCarProfit);
		if(improvementReportOfUsedCarProfitform.getId() == null || improvementReportOfUsedCarProfitform.getId().intValue() == 0){
			improvementReportOfUsedCarProfit.setId(null);
		}else{
			improvementReportOfUsedCarProfit.setId(improvementReportOfUsedCarProfitform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(ProfitReportOfUsedCar.class);
		criteria2.add(Restrictions.idEq(profitReportOfUsedCarInt));
		ProfitReportOfUsedCar profitreportofusedcar = (ProfitReportOfUsedCar) criteria2.uniqueResult();
		improvementReportOfUsedCarProfit.setProfitReportOfUsedCar(profitreportofusedcar);
		criteria2 = session.createCriteria(Base.class);
		criteria2.add(Restrictions.idEq(baseInt));
		Base base = (Base) criteria2.uniqueResult();
		improvementReportOfUsedCarProfit.setBase(base);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(improvementReportOfUsedCarProfit);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ImprovementReportOfUsedCarProfitDetail.do", improvementReportOfUsedCarProfit.getId().toString());
		return null;

		
	}
	
	
}