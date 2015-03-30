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


public class PostImprovementReportOfNewCarProfitVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ImprovementReportOfNewCarProfit improvementReportOfNewCarProfit = new ImprovementReportOfNewCarProfitImpl();
		ImprovementReportOfNewCarProfitForm improvementReportOfNewCarProfitform = (ImprovementReportOfNewCarProfitForm) form;

                String error = "";


                		Integer baseInt = improvementReportOfNewCarProfitform.getBase();
		improvementReportOfNewCarProfitform.setBase(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(improvementReportOfNewCarProfitform.getId() == null || improvementReportOfNewCarProfitform.getId().intValue() == 0){
			improvementReportOfNewCarProfit.setId(null);
			improvementReportOfNewCarProfitform.setId(null);
		}else{
			improvementReportOfNewCarProfit.setId(improvementReportOfNewCarProfitform.getId());
			Criteria criteria = session.createCriteria(ImprovementReportOfNewCarProfit.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			improvementReportOfNewCarProfit = (ImprovementReportOfNewCarProfit) criteria.uniqueResult();

		}
                		improvementReportOfNewCarProfit.setRemianofacceptedlastmonth(improvementReportOfNewCarProfitform.getRemianofacceptedlastmonth());
		improvementReportOfNewCarProfit.setRemainofregistedlastmonth(improvementReportOfNewCarProfitform.getRemainofregistedlastmonth());
		improvementReportOfNewCarProfit.setNumofaccepted(improvementReportOfNewCarProfitform.getNumofaccepted());
		improvementReportOfNewCarProfit.setNumofregisted(improvementReportOfNewCarProfitform.getNumofregisted());
		improvementReportOfNewCarProfit.setIncentiveoflevelget(improvementReportOfNewCarProfitform.getIncentiveoflevelget());
		improvementReportOfNewCarProfit.setVolumeaction(improvementReportOfNewCarProfitform.getVolumeaction());
		improvementReportOfNewCarProfit.setProfitofnewcar(improvementReportOfNewCarProfitform.getProfitofnewcar());
		improvementReportOfNewCarProfit.setPriceofmainnewcar(improvementReportOfNewCarProfitform.getPriceofmainnewcar());
		improvementReportOfNewCarProfit.setProfitofmainnewcar(improvementReportOfNewCarProfitform.getProfitofmainnewcar());
		improvementReportOfNewCarProfit.setPriceofwithoptionsnewcar(improvementReportOfNewCarProfitform.getPriceofwithoptionsnewcar());
		improvementReportOfNewCarProfit.setProfitofwithoptionsnewcar(improvementReportOfNewCarProfitform.getProfitofwithoptionsnewcar());
		improvementReportOfNewCarProfit.setDiscountnewcar(improvementReportOfNewCarProfitform.getDiscountnewcar());
		improvementReportOfNewCarProfit.setChargeforregistnewcar(improvementReportOfNewCarProfitform.getChargeforregistnewcar());
		improvementReportOfNewCarProfit.setProfitofcarnewcar(improvementReportOfNewCarProfitform.getProfitofcarnewcar());
		improvementReportOfNewCarProfit.setPrincipalofcreditnewcar(improvementReportOfNewCarProfitform.getPrincipalofcreditnewcar());
		improvementReportOfNewCarProfit.setProfitofcreditnewcar(improvementReportOfNewCarProfitform.getProfitofcreditnewcar());
		improvementReportOfNewCarProfit.setProfitofsalesnewcar(improvementReportOfNewCarProfitform.getProfitofsalesnewcar());
		improvementReportOfNewCarProfit.setActionsnewcar(improvementReportOfNewCarProfitform.getActionsnewcar());
		improvementReportOfNewCarProfit.setMarginalprofitnewcar(improvementReportOfNewCarProfitform.getMarginalprofitnewcar());
		improvementReportOfNewCarProfit.setVolumeactionnewcar(improvementReportOfNewCarProfitform.getVolumeactionnewcar());
		improvementReportOfNewCarProfit.setMonthlyprofitnewcar(improvementReportOfNewCarProfitform.getMonthlyprofitnewcar());
		improvementReportOfNewCarProfit.setProfitofusedcar(improvementReportOfNewCarProfitform.getProfitofusedcar());
		improvementReportOfNewCarProfit.setPriceofmainusedcar(improvementReportOfNewCarProfitform.getPriceofmainusedcar());
		improvementReportOfNewCarProfit.setProfitofmainusedcar(improvementReportOfNewCarProfitform.getProfitofmainusedcar());
		improvementReportOfNewCarProfit.setPriceofwithoptionsusedcar(improvementReportOfNewCarProfitform.getPriceofwithoptionsusedcar());
		improvementReportOfNewCarProfit.setProfitofwithoptionsusedcar(improvementReportOfNewCarProfitform.getProfitofwithoptionsusedcar());
		improvementReportOfNewCarProfit.setDiscountusedcar(improvementReportOfNewCarProfitform.getDiscountusedcar());
		improvementReportOfNewCarProfit.setChargesforregistusedcar(improvementReportOfNewCarProfitform.getChargesforregistusedcar());
		improvementReportOfNewCarProfit.setProfitofcarusedcar(improvementReportOfNewCarProfitform.getProfitofcarusedcar());
		improvementReportOfNewCarProfit.setPrincipalofcreditusedcar(improvementReportOfNewCarProfitform.getPrincipalofcreditusedcar());
		improvementReportOfNewCarProfit.setProfitofcreditusedcar(improvementReportOfNewCarProfitform.getProfitofcreditusedcar());
		improvementReportOfNewCarProfit.setMarginalprofitusedcar(improvementReportOfNewCarProfitform.getMarginalprofitusedcar());
		improvementReportOfNewCarProfit.setCostofrecover(improvementReportOfNewCarProfitform.getCostofrecover());
		improvementReportOfNewCarProfit.setMonthlyprofitusedcar(improvementReportOfNewCarProfitform.getMonthlyprofitusedcar());
		improvementReportOfNewCarProfit.setMonth(improvementReportOfNewCarProfitform.getMonth());
		improvementReportOfNewCarProfit.setYear(improvementReportOfNewCarProfitform.getYear());


		
		StringFullfiller.fullfil(improvementReportOfNewCarProfit);
                		Criteria criteria2 = session.createCriteria(Base.class);
		criteria2.add(Restrictions.idEq(baseInt));
		Base base = (Base) criteria2.uniqueResult();
		improvementReportOfNewCarProfit.setBase(base);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(improvementReportOfNewCarProfit);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostImprovementReportOfNewCarProfitDetail.do", improvementReportOfNewCarProfit.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ImprovementReportOfNewCarProfits.do", improvementReportOfNewCarProfit.getId().toString());
		return null;

		
	}
	
	
}