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


public class PostTargetValueByGroupOfCarLineVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		TargetValueByGroupOfCarLine targetValueByGroupOfCarLine = new TargetValueByGroupOfCarLineImpl();
		TargetValueByGroupOfCarLineForm targetValueByGroupOfCarLineform = (TargetValueByGroupOfCarLineForm) form;

                String error = "";


                		Integer groupOfCarLineInt = targetValueByGroupOfCarLineform.getGroupOfCarLine();
		targetValueByGroupOfCarLineform.setGroupOfCarLine(null);
		Integer improvementReportOfNewCarProfitInt = targetValueByGroupOfCarLineform.getImprovementReportOfNewCarProfit();
		targetValueByGroupOfCarLineform.setImprovementReportOfNewCarProfit(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(targetValueByGroupOfCarLineform.getId() == null || targetValueByGroupOfCarLineform.getId().intValue() == 0){
			targetValueByGroupOfCarLine.setId(null);
			targetValueByGroupOfCarLineform.setId(null);
		}else{
			targetValueByGroupOfCarLine.setId(targetValueByGroupOfCarLineform.getId());
			Criteria criteria = session.createCriteria(TargetValueByGroupOfCarLine.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			targetValueByGroupOfCarLine = (TargetValueByGroupOfCarLine) criteria.uniqueResult();

		}
                		targetValueByGroupOfCarLine.setNumofaccepted(targetValueByGroupOfCarLineform.getNumofaccepted());
		targetValueByGroupOfCarLine.setNumofregisted(targetValueByGroupOfCarLineform.getNumofregisted());
		targetValueByGroupOfCarLine.setIncentiveoflevelget(targetValueByGroupOfCarLineform.getIncentiveoflevelget());


		
		StringFullfiller.fullfil(targetValueByGroupOfCarLine);
                		Criteria criteria2 = session.createCriteria(GroupOfCarLine.class);
		criteria2.add(Restrictions.idEq(groupOfCarLineInt));
		GroupOfCarLine groupofcarline = (GroupOfCarLine) criteria2.uniqueResult();
		targetValueByGroupOfCarLine.setGroupOfCarLine(groupofcarline);
		criteria2 = session.createCriteria(ImprovementReportOfNewCarProfit.class);
		criteria2.add(Restrictions.idEq(improvementReportOfNewCarProfitInt));
		ImprovementReportOfNewCarProfit improvementreportofnewcarprofit = (ImprovementReportOfNewCarProfit) criteria2.uniqueResult();
		targetValueByGroupOfCarLine.setImprovementReportOfNewCarProfit(improvementreportofnewcarprofit);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(targetValueByGroupOfCarLine);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTargetValueByGroupOfCarLineDetail.do", targetValueByGroupOfCarLine.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "TargetValueByGroupOfCarLines.do", targetValueByGroupOfCarLine.getId().toString());
		return null;

		
	}
	
	
}