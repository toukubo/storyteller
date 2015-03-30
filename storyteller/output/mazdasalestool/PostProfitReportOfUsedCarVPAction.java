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


public class PostProfitReportOfUsedCarVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ProfitReportOfUsedCar profitReportOfUsedCar = new ProfitReportOfUsedCarImpl();
		ProfitReportOfUsedCarForm profitReportOfUsedCarform = (ProfitReportOfUsedCarForm) form;

                String error = "";


                		Integer intraUserInt = profitReportOfUsedCarform.getIntraUser();
		profitReportOfUsedCarform.setIntraUser(null);
		Integer improvementReportOfUsedCarProfitInt = profitReportOfUsedCarform.getImprovementReportOfUsedCarProfit();
		profitReportOfUsedCarform.setImprovementReportOfUsedCarProfit(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(profitReportOfUsedCarform.getId() == null || profitReportOfUsedCarform.getId().intValue() == 0){
			profitReportOfUsedCar.setId(null);
			profitReportOfUsedCarform.setId(null);
		}else{
			profitReportOfUsedCar.setId(profitReportOfUsedCarform.getId());
			Criteria criteria = session.createCriteria(ProfitReportOfUsedCar.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			profitReportOfUsedCar = (ProfitReportOfUsedCar) criteria.uniqueResult();

		}
                		profitReportOfUsedCar.setCredit(profitReportOfUsedCarform.getCredit());
		profitReportOfUsedCar.setMemo(profitReportOfUsedCarform.getMemo());
		profitReportOfUsedCar.setSalescost(profitReportOfUsedCarform.getSalescost());
		profitReportOfUsedCar.setAccepteddate(profitReportOfUsedCarform.getAccepteddate());
		profitReportOfUsedCar.setCustomername(profitReportOfUsedCarform.getCustomername());
		profitReportOfUsedCar.setChargesforregisttaxex(profitReportOfUsedCarform.getChargesforregisttaxex());
		profitReportOfUsedCar.setInterest(profitReportOfUsedCarform.getInterest());
		profitReportOfUsedCar.setNumofpaymentsforcredit(profitReportOfUsedCarform.getNumofpaymentsforcredit());
		profitReportOfUsedCar.setRegisteddate(profitReportOfUsedCarform.getRegisteddate());
		profitReportOfUsedCar.setPriceoftradein(profitReportOfUsedCarform.getPriceoftradein());
		profitReportOfUsedCar.setEntereddate(profitReportOfUsedCarform.getEntereddate());
		profitReportOfUsedCar.setModelyearofsalescar(profitReportOfUsedCarform.getModelyearofsalescar());
		profitReportOfUsedCar.setModelcodeofsalescar(profitReportOfUsedCarform.getModelcodeofsalescar());
		profitReportOfUsedCar.setNoofsalescar(profitReportOfUsedCarform.getNoofsalescar());
		profitReportOfUsedCar.setSourceofsales(profitReportOfUsedCarform.getSourceofsales());
		profitReportOfUsedCar.setAb(profitReportOfUsedCarform.getAb());
		profitReportOfUsedCar.setTriggerofsales(profitReportOfUsedCarform.getTriggerofsales());
		profitReportOfUsedCar.setRecoverorder(profitReportOfUsedCarform.getRecoverorder());
		profitReportOfUsedCar.setRegisttype(profitReportOfUsedCarform.getRegisttype());
		profitReportOfUsedCar.setAssignedpricetaxex(profitReportOfUsedCarform.getAssignedpricetaxex());
		profitReportOfUsedCar.setSalespricetaxex(profitReportOfUsedCarform.getSalespricetaxex());
		profitReportOfUsedCar.setCostpricetaxex(profitReportOfUsedCarform.getCostpricetaxex());
		profitReportOfUsedCar.setTotalpaymenttaxin(profitReportOfUsedCarform.getTotalpaymenttaxin());
		profitReportOfUsedCar.setCash(profitReportOfUsedCarform.getCash());
		profitReportOfUsedCar.setModelyearoftradein(profitReportOfUsedCarform.getModelyearoftradein());
		profitReportOfUsedCar.setModelcodeoftradein(profitReportOfUsedCarform.getModelcodeoftradein());
		profitReportOfUsedCar.setNooftradein(profitReportOfUsedCarform.getNooftradein());
		profitReportOfUsedCar.setPriceofnonfreemaintenancetaxex(profitReportOfUsedCarform.getPriceofnonfreemaintenancetaxex());
		profitReportOfUsedCar.setPriceofnonfreepartstaxex(profitReportOfUsedCarform.getPriceofnonfreepartstaxex());
		profitReportOfUsedCar.setCreditkb(profitReportOfUsedCarform.getCreditkb());
		profitReportOfUsedCar.setPriceofpartsforrecover(profitReportOfUsedCarform.getPriceofpartsforrecover());
		profitReportOfUsedCar.setPriceofoutsourcingforrecover(profitReportOfUsedCarform.getPriceofoutsourcingforrecover());
		profitReportOfUsedCar.setPriceofworkingforrecover(profitReportOfUsedCarform.getPriceofworkingforrecover());


		
		StringFullfiller.fullfil(profitReportOfUsedCar);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		profitReportOfUsedCar.setIntraUser(intrauser);
		criteria2 = session.createCriteria(ImprovementReportOfUsedCarProfit.class);
		criteria2.add(Restrictions.idEq(improvementReportOfUsedCarProfitInt));
		ImprovementReportOfUsedCarProfit improvementreportofusedcarprofit = (ImprovementReportOfUsedCarProfit) criteria2.uniqueResult();
		profitReportOfUsedCar.setImprovementReportOfUsedCarProfit(improvementreportofusedcarprofit);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(profitReportOfUsedCar);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostProfitReportOfUsedCarDetail.do", profitReportOfUsedCar.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ProfitReportOfUsedCars.do", profitReportOfUsedCar.getId().toString());
		return null;

		
	}
	
	
}