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


public class PostResultAndProductivityVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ResultAndProductivity resultAndProductivity = new ResultAndProductivityImpl();
		ResultAndProductivityForm resultAndProductivityform = (ResultAndProductivityForm) form;

                String error = "";


                		Integer intraUserInt = resultAndProductivityform.getIntraUser();
		resultAndProductivityform.setIntraUser(null);

		
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
		resultAndProductivity.setNewsales(resultAndProductivityform.getNewsales());
		resultAndProductivity.setUsedsales(resultAndProductivityform.getUsedsales());
		resultAndProductivity.setStorageinspection(resultAndProductivityform.getStorageinspection());
		resultAndProductivity.setStorage12(resultAndProductivityform.getStorage12());
		resultAndProductivity.setStoragemsc(resultAndProductivityform.getStoragemsc());
		resultAndProductivity.setNewassurancenew(resultAndProductivityform.getNewassurancenew());
		resultAndProductivity.setUsedassurancecontinuance(resultAndProductivityform.getUsedassurancecontinuance());
		resultAndProductivity.setNewprofit(resultAndProductivityform.getNewprofit());
		resultAndProductivity.setUsedprofit(resultAndProductivityform.getUsedprofit());
		resultAndProductivity.setNewcustomeralternatives(resultAndProductivityform.getNewcustomeralternatives());
		resultAndProductivity.setNewcustomerincrement(resultAndProductivityform.getNewcustomerincrement());
		resultAndProductivity.setNewnewotheralternatives(resultAndProductivityform.getNewnewotheralternatives());
		resultAndProductivity.setNewnewothernew(resultAndProductivityform.getNewnewothernew());
		resultAndProductivity.setUsedcustomeralternatives(resultAndProductivityform.getUsedcustomeralternatives());
		resultAndProductivity.setUsedcustomerincrement(resultAndProductivityform.getUsedcustomerincrement());
		resultAndProductivity.setUsednewotheralternatives(resultAndProductivityform.getUsednewotheralternatives());
		resultAndProductivity.setUsednewothernew(resultAndProductivityform.getUsednewothernew());
		resultAndProductivity.setCustomernum(resultAndProductivityform.getCustomernum());
		resultAndProductivity.setCustomerprotectionrate(resultAndProductivityform.getCustomerprotectionrate());
		resultAndProductivity.setCustomerscore(resultAndProductivityform.getCustomerscore());
		resultAndProductivity.setTermgoal(resultAndProductivityform.getTermgoal());
		resultAndProductivity.setFirsthalfgoal(resultAndProductivityform.getFirsthalfgoal());
		resultAndProductivity.setSecondhalfgoal(resultAndProductivityform.getSecondhalfgoal());
		resultAndProductivity.setFirsthalfselfoverview(resultAndProductivityform.getFirsthalfselfoverview());
		resultAndProductivity.setSecondhalfselfoverview(resultAndProductivityform.getSecondhalfselfoverview());
		resultAndProductivity.setSelfoverview(resultAndProductivityform.getSelfoverview());
		resultAndProductivity.setCustomerassuarancerate(resultAndProductivityform.getCustomerassuarancerate());
		resultAndProductivity.setNewotherroute(resultAndProductivityform.getNewotherroute());
		resultAndProductivity.setUsedotherroute(resultAndProductivityform.getUsedotherroute());


		
		StringFullfiller.fullfil(resultAndProductivity);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		resultAndProductivity.setIntraUser(intrauser);


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