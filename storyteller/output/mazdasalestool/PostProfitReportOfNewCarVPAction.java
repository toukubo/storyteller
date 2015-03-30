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


public class PostProfitReportOfNewCarVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ProfitReportOfNewCar profitReportOfNewCar = new ProfitReportOfNewCarImpl();
		ProfitReportOfNewCarForm profitReportOfNewCarform = (ProfitReportOfNewCarForm) form;

                String error = "";


                		Integer intraUserInt = profitReportOfNewCarform.getIntraUser();
		profitReportOfNewCarform.setIntraUser(null);
		Integer carInt = profitReportOfNewCarform.getCar();
		profitReportOfNewCarform.setCar(null);
		Integer navigationInt = profitReportOfNewCarform.getNavigation();
		profitReportOfNewCarform.setNavigation(null);
		Integer companyOfCreditInt = profitReportOfNewCarform.getCompanyOfCredit();
		profitReportOfNewCarform.setCompanyOfCredit(null);
		Integer policeInt = profitReportOfNewCarform.getPolice();
		profitReportOfNewCarform.setPolice(null);
		Integer improvementReportOfNewCarProfitInt = profitReportOfNewCarform.getImprovementReportOfNewCarProfit();
		profitReportOfNewCarform.setImprovementReportOfNewCarProfit(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(profitReportOfNewCarform.getId() == null || profitReportOfNewCarform.getId().intValue() == 0){
			profitReportOfNewCar.setId(null);
			profitReportOfNewCarform.setId(null);
		}else{
			profitReportOfNewCar.setId(profitReportOfNewCarform.getId());
			Criteria criteria = session.createCriteria(ProfitReportOfNewCar.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			profitReportOfNewCar = (ProfitReportOfNewCar) criteria.uniqueResult();

		}
                		profitReportOfNewCar.setCancel(profitReportOfNewCarform.isCancel());
		profitReportOfNewCar.setRemain(profitReportOfNewCarform.isRemain());
		profitReportOfNewCar.setOrderno(profitReportOfNewCarform.getOrderno());
		profitReportOfNewCar.setAccepteddate(profitReportOfNewCarform.getAccepteddate());
		profitReportOfNewCar.setNumofcars(profitReportOfNewCarform.getNumofcars());
		profitReportOfNewCar.setTypecode(profitReportOfNewCarform.getTypecode());
		profitReportOfNewCar.setCustomername(profitReportOfNewCarform.getCustomername());
		profitReportOfNewCar.setWinnerspoint(profitReportOfNewCarform.getWinnerspoint());
		profitReportOfNewCar.setOwntradein(profitReportOfNewCarform.isOwntradein());
		profitReportOfNewCar.setCarlineoftradein(profitReportOfNewCarform.getCarlineoftradein());
		profitReportOfNewCar.setPriceofmaintaxin(profitReportOfNewCarform.getPriceofmaintaxin());
		profitReportOfNewCar.setProfitrateofmain(profitReportOfNewCarform.getProfitrateofmain());
		profitReportOfNewCar.setPriceofwithoptionstaxin(profitReportOfNewCarform.getPriceofwithoptionstaxin());
		profitReportOfNewCar.setProfitrateofwithoptions(profitReportOfNewCarform.getProfitrateofwithoptions());
		profitReportOfNewCar.setDiscounttaxin(profitReportOfNewCarform.getDiscounttaxin());
		profitReportOfNewCar.setChargesforregisttaxin(profitReportOfNewCarform.getChargesforregisttaxin());
		profitReportOfNewCar.setChargesforregisttaxex(profitReportOfNewCarform.getChargesforregisttaxex());
		profitReportOfNewCar.setPrincipalofcredit(profitReportOfNewCarform.getPrincipalofcredit());
		profitReportOfNewCar.setProfitofcredit(profitReportOfNewCarform.getProfitofcredit());
		profitReportOfNewCar.setActionforcredit(profitReportOfNewCarform.getActionforcredit());
		profitReportOfNewCar.setInterest(profitReportOfNewCarform.getInterest());
		profitReportOfNewCar.setNumofpaymentsforcredit(profitReportOfNewCarform.getNumofpaymentsforcredit());
		profitReportOfNewCar.setFeeofintroduction(profitReportOfNewCarform.getFeeofintroduction());
		profitReportOfNewCar.setSubmitteddateofordersheet(profitReportOfNewCarform.getSubmitteddateofordersheet());
		profitReportOfNewCar.setSubmitteddateofparkingspacecertificate(profitReportOfNewCarform.getSubmitteddateofparkingspacecertificate());
		profitReportOfNewCar.setReceiptdateofparkingspacecertificate(profitReportOfNewCarform.getReceiptdateofparkingspacecertificate());
		profitReportOfNewCar.setCollecteddateofsealcertificate(profitReportOfNewCarform.getCollecteddateofsealcertificate());
		profitReportOfNewCar.setCollecteddateofproxy(profitReportOfNewCarform.getCollecteddateofproxy());
		profitReportOfNewCar.setCollecteddateofresidencecertificate(profitReportOfNewCarform.getCollecteddateofresidencecertificate());
		profitReportOfNewCar.setSenddateofcreditapplication(profitReportOfNewCarform.getSenddateofcreditapplication());
		profitReportOfNewCar.setSubmitteddateofregistrequest(profitReportOfNewCarform.getSubmitteddateofregistrequest());
		profitReportOfNewCar.setRegisteddate(profitReportOfNewCarform.getRegisteddate());
		profitReportOfNewCar.setSendthankyouletter(profitReportOfNewCarform.isSendthankyouletter());
		profitReportOfNewCar.setSendthankyouletterbymanager(profitReportOfNewCarform.isSendthankyouletterbymanager());
		profitReportOfNewCar.setEmployeecodeofregist(profitReportOfNewCarform.getEmployeecodeofregist());
		profitReportOfNewCar.setForecastofregist(profitReportOfNewCarform.getForecastofregist());
		profitReportOfNewCar.setCarryregist(profitReportOfNewCarform.getCarryregist());
		profitReportOfNewCar.setCollectadvancereceipt(profitReportOfNewCarform.getCollectadvancereceipt());
		profitReportOfNewCar.setProceeds(profitReportOfNewCarform.getProceeds());
		profitReportOfNewCar.setPriceoftradein(profitReportOfNewCarform.getPriceoftradein());
		profitReportOfNewCar.setApplicationfee(profitReportOfNewCarform.getApplicationfee());
		profitReportOfNewCar.setCollecteddateofapplicationfee(profitReportOfNewCarform.getCollecteddateofapplicationfee());
		profitReportOfNewCar.setAdvancereceipt(profitReportOfNewCarform.getAdvancereceipt());
		profitReportOfNewCar.setCollecteddateofadvancereceipt(profitReportOfNewCarform.getCollecteddateofadvancereceipt());
		profitReportOfNewCar.setRemainder(profitReportOfNewCarform.getRemainder());
		profitReportOfNewCar.setCollecteddateofremainder(profitReportOfNewCarform.getCollecteddateofremainder());


		
		StringFullfiller.fullfil(profitReportOfNewCar);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		profitReportOfNewCar.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Car.class);
		criteria2.add(Restrictions.idEq(carInt));
		Car car = (Car) criteria2.uniqueResult();
		profitReportOfNewCar.setCar(car);
		criteria2 = session.createCriteria(Navigation.class);
		criteria2.add(Restrictions.idEq(navigationInt));
		Navigation navigation = (Navigation) criteria2.uniqueResult();
		profitReportOfNewCar.setNavigation(navigation);
		criteria2 = session.createCriteria(CompanyOfCredit.class);
		criteria2.add(Restrictions.idEq(companyOfCreditInt));
		CompanyOfCredit companyofcredit = (CompanyOfCredit) criteria2.uniqueResult();
		profitReportOfNewCar.setCompanyOfCredit(companyofcredit);
		criteria2 = session.createCriteria(Police.class);
		criteria2.add(Restrictions.idEq(policeInt));
		Police police = (Police) criteria2.uniqueResult();
		profitReportOfNewCar.setPolice(police);
		criteria2 = session.createCriteria(ImprovementReportOfNewCarProfit.class);
		criteria2.add(Restrictions.idEq(improvementReportOfNewCarProfitInt));
		ImprovementReportOfNewCarProfit improvementreportofnewcarprofit = (ImprovementReportOfNewCarProfit) criteria2.uniqueResult();
		profitReportOfNewCar.setImprovementReportOfNewCarProfit(improvementreportofnewcarprofit);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(profitReportOfNewCar);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostProfitReportOfNewCarDetail.do", profitReportOfNewCar.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ProfitReportOfNewCars.do", profitReportOfNewCar.getId().toString());
		return null;

		
	}
	
	
}