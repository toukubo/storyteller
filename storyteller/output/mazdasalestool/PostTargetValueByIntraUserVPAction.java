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


public class PostTargetValueByIntraUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		TargetValueByIntraUser targetValueByIntraUser = new TargetValueByIntraUserImpl();
		TargetValueByIntraUserForm targetValueByIntraUserform = (TargetValueByIntraUserForm) form;

                String error = "";


                		Integer intraUserInt = targetValueByIntraUserform.getIntraUser();
		targetValueByIntraUserform.setIntraUser(null);
		Integer improvementReportOfNewCarProfitInt = targetValueByIntraUserform.getImprovementReportOfNewCarProfit();
		targetValueByIntraUserform.setImprovementReportOfNewCarProfit(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(targetValueByIntraUserform.getId() == null || targetValueByIntraUserform.getId().intValue() == 0){
			targetValueByIntraUser.setId(null);
			targetValueByIntraUserform.setId(null);
		}else{
			targetValueByIntraUser.setId(targetValueByIntraUserform.getId());
			Criteria criteria = session.createCriteria(TargetValueByIntraUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			targetValueByIntraUser = (TargetValueByIntraUser) criteria.uniqueResult();

		}
                		targetValueByIntraUser.setNumofaccepted(targetValueByIntraUserform.getNumofaccepted());
		targetValueByIntraUser.setNumofregisted(targetValueByIntraUserform.getNumofregisted());


		
		StringFullfiller.fullfil(targetValueByIntraUser);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		targetValueByIntraUser.setIntraUser(intrauser);
		criteria2 = session.createCriteria(ImprovementReportOfNewCarProfit.class);
		criteria2.add(Restrictions.idEq(improvementReportOfNewCarProfitInt));
		ImprovementReportOfNewCarProfit improvementreportofnewcarprofit = (ImprovementReportOfNewCarProfit) criteria2.uniqueResult();
		targetValueByIntraUser.setImprovementReportOfNewCarProfit(improvementreportofnewcarprofit);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(targetValueByIntraUser);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTargetValueByIntraUserDetail.do", targetValueByIntraUser.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "TargetValueByIntraUsers.do", targetValueByIntraUser.getId().toString());
		return null;

		
	}
	
	
}