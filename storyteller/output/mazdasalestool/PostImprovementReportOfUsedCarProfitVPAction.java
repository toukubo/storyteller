package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

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


public class PostImprovementReportOfUsedCarProfitVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ImprovementReportOfUsedCarProfit improvementReportOfUsedCarProfit = new ImprovementReportOfUsedCarProfitImpl();
		ImprovementReportOfUsedCarProfitForm improvementReportOfUsedCarProfitform = (ImprovementReportOfUsedCarProfitForm) form;

                String error = "";


                		Integer profitReportOfUsedCarInt = improvementReportOfUsedCarProfitform.getProfitReportOfUsedCar();
		improvementReportOfUsedCarProfitform.setProfitReportOfUsedCar(null);
		Integer baseInt = improvementReportOfUsedCarProfitform.getBase();
		improvementReportOfUsedCarProfitform.setBase(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(improvementReportOfUsedCarProfitform.getId() == null || improvementReportOfUsedCarProfitform.getId().intValue() == 0){
			improvementReportOfUsedCarProfit.setId(null);
			improvementReportOfUsedCarProfitform.setId(null);
		}else{
			improvementReportOfUsedCarProfit.setId(improvementReportOfUsedCarProfitform.getId());
			Criteria criteria = session.createCriteria(ImprovementReportOfUsedCarProfit.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			improvementReportOfUsedCarProfit = (ImprovementReportOfUsedCarProfit) criteria.uniqueResult();

		}
                		improvementReportOfUsedCarProfit.setNumofplan(improvementReportOfUsedCarProfitform.getNumofplan());
		improvementReportOfUsedCarProfit.setNumofforecast(improvementReportOfUsedCarProfitform.getNumofforecast());
		improvementReportOfUsedCarProfit.setMonth(improvementReportOfUsedCarProfitform.getMonth());
		improvementReportOfUsedCarProfit.setYear(improvementReportOfUsedCarProfitform.getYear());


		
		StringFullfiller.fullfil(improvementReportOfUsedCarProfit);
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
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostImprovementReportOfUsedCarProfitDetail.do", improvementReportOfUsedCarProfit.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ImprovementReportOfUsedCarProfits.do", improvementReportOfUsedCarProfit.getId().toString());
		return null;

		
	}
	
	
}