package net.mazdaestimate.web.app;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;

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


public class PostResultAndProductivityVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ResultAndProductivity resultAndProductivity = new ResultAndProductivityImpl();
		ResultAndProductivityForm resultAndProductivityform = (ResultAndProductivityForm) form;

                String error = "";


                		Integer shopInt = resultAndProductivityform.getShop();
		resultAndProductivityform.setShop(null);
		Integer intraUserInt = resultAndProductivityform.getIntraUser();
		resultAndProductivityform.setIntraUser(null);
		Integer baseInt = resultAndProductivityform.getBase();
		resultAndProductivityform.setBase(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(resultAndProductivityform.getId() == null || resultAndProductivityform.getId().intValue() == 0){
			resultAndProductivity.setId(null);
			resultAndProductivityform.setId(null);
		}else{
			resultAndProductivity.setId(resultAndProductivityform.getId());
			Criteria criteria = session.createCriteria(ResultAndProductivity.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			resultAndProductivity = (ResultAndProductivity) criteria.uniqueResult();

		}
                		resultAndProductivity.setMonth(resultAndProductivityform.getMonth());
		resultAndProductivity.setYear(resultAndProductivityform.getYear());
		resultAndProductivity.setType(resultAndProductivityform.getType());
		resultAndProductivity.setTodate(resultAndProductivityform.getTodate());
		resultAndProductivity.setSalesnew(resultAndProductivityform.getSalesnew());
		resultAndProductivity.setNewcustomerparallel(resultAndProductivityform.getNewcustomerparallel());
		resultAndProductivity.setUsedotherintroductionemployee(resultAndProductivityform.getUsedotherintroductionemployee());
		resultAndProductivity.setUsedotherintroductionother(resultAndProductivityform.getUsedotherintroductionother());
		resultAndProductivity.setSalesused(resultAndProductivityform.getSalesused());
		resultAndProductivity.setStorageinspection(resultAndProductivityform.getStorageinspection());
		resultAndProductivity.setStorage12(resultAndProductivityform.getStorage12());
		resultAndProductivity.setStoragemsc(resultAndProductivityform.getStoragemsc());
		resultAndProductivity.setAssurancenew(resultAndProductivityform.getAssurancenew());
		resultAndProductivity.setAssurancecontinuance(resultAndProductivityform.getAssurancecontinuance());
		resultAndProductivity.setProfitnew(resultAndProductivityform.getProfitnew());
		resultAndProductivity.setProfitused(resultAndProductivityform.getProfitused());
		resultAndProductivity.setNewcustomeralternatives(resultAndProductivityform.getNewcustomeralternatives());
		resultAndProductivity.setNewcustomerincrement(resultAndProductivityform.getNewcustomerincrement());
		resultAndProductivity.setNewcustomerintroduction(resultAndProductivityform.getNewcustomerintroduction());
		resultAndProductivity.setNewnewotheralternatives(resultAndProductivityform.getNewnewotheralternatives());
		resultAndProductivity.setNewnewothernew(resultAndProductivityform.getNewnewothernew());
		resultAndProductivity.setNewvendormarket(resultAndProductivityform.getNewvendormarket());
		resultAndProductivity.setNewvendorintroduction(resultAndProductivityform.getNewvendorintroduction());
		resultAndProductivity.setNewotherintroductionemployee(resultAndProductivityform.getNewotherintroductionemployee());
		resultAndProductivity.setNewotherintroductionother(resultAndProductivityform.getNewotherintroductionother());
		resultAndProductivity.setUsedcustomeralternatives(resultAndProductivityform.getUsedcustomeralternatives());
		resultAndProductivity.setUsedcustomerincrement(resultAndProductivityform.getUsedcustomerincrement());
		resultAndProductivity.setUsedcustomerintroduction(resultAndProductivityform.getUsedcustomerintroduction());
		resultAndProductivity.setUsedcustomerparallel(resultAndProductivityform.getUsedcustomerparallel());
		resultAndProductivity.setUsednewotheralternatives(resultAndProductivityform.getUsednewotheralternatives());
		resultAndProductivity.setUsednewothernew(resultAndProductivityform.getUsednewothernew());
		resultAndProductivity.setUsedvendormarket(resultAndProductivityform.getUsedvendormarket());
		resultAndProductivity.setUsedvendorintroduction(resultAndProductivityform.getUsedvendorintroduction());
		resultAndProductivity.setNewsales(resultAndProductivityform.getNewsales());
		resultAndProductivity.setUsedsales(resultAndProductivityform.getUsedsales());
		resultAndProductivity.setNewassurancenew(resultAndProductivityform.getNewassurancenew());
		resultAndProductivity.setUsedassurancecontinuance(resultAndProductivityform.getUsedassurancecontinuance());
		resultAndProductivity.setNewprofit(resultAndProductivityform.getNewprofit());
		resultAndProductivity.setUsedprofit(resultAndProductivityform.getUsedprofit());
		resultAndProductivity.setNewotherintroductionothers(resultAndProductivityform.getNewotherintroductionothers());
		resultAndProductivity.setUsedotherintroductionothers(resultAndProductivityform.getUsedotherintroductionothers());
		resultAndProductivity.setActivitystorefront(resultAndProductivityform.getActivitystorefront());
		resultAndProductivity.setActivityvisit(resultAndProductivityform.getActivityvisit());
		resultAndProductivity.setActivityslc(resultAndProductivityform.getActivityslc());
		resultAndProductivity.setActivitymail(resultAndProductivityform.getActivitymail());
		resultAndProductivity.setActivitytel(resultAndProductivityform.getActivitytel());
		resultAndProductivity.setCustomeractivitystorefront(resultAndProductivityform.getCustomeractivitystorefront());
		resultAndProductivity.setCustomeractivityvisit(resultAndProductivityform.getCustomeractivityvisit());
		resultAndProductivity.setCustomeractivityslc(resultAndProductivityform.getCustomeractivityslc());
		resultAndProductivity.setCustomeractivitymail(resultAndProductivityform.getCustomeractivitymail());
		resultAndProductivity.setCustomeractivitytel(resultAndProductivityform.getCustomeractivitytel());
		resultAndProductivity.setCustomernum(resultAndProductivityform.getCustomernum());
		resultAndProductivity.setCustomerscore(resultAndProductivityform.getCustomerscore());
		resultAndProductivity.setTermgoal(resultAndProductivityform.getTermgoal());
		resultAndProductivity.setFirsthalfgoal(resultAndProductivityform.getFirsthalfgoal());
		resultAndProductivity.setSecondhalfgoal(resultAndProductivityform.getSecondhalfgoal());
		resultAndProductivity.setFirsthalfselfoverview(resultAndProductivityform.getFirsthalfselfoverview());
		resultAndProductivity.setSecondhalfselfoverview(resultAndProductivityform.getSecondhalfselfoverview());
		resultAndProductivity.setSelfoverview(resultAndProductivityform.getSelfoverview());


		
		StringFullfiller.fullfil(resultAndProductivity);
                		Criteria criteria2 = session.createCriteria(Shop.class);
		criteria2.add(Restrictions.idEq(shopInt));
		Shop shop = (Shop) criteria2.uniqueResult();
		resultAndProductivity.setShop(shop);
		criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		resultAndProductivity.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Base.class);
		criteria2.add(Restrictions.idEq(baseInt));
		Base base = (Base) criteria2.uniqueResult();
		resultAndProductivity.setBase(base);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(resultAndProductivity);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostResultAndProductivityDetail.do", resultAndProductivity.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ResultAndProductivitys.do", resultAndProductivity.getId().toString());
		return null;

		
	}
	
	
}