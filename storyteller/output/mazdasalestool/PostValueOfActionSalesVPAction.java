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


public class PostValueOfActionSalesVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ValueOfActionSales valueOfActionSales = new ValueOfActionSalesImpl();
		ValueOfActionSalesForm valueOfActionSalesform = (ValueOfActionSalesForm) form;

                String error = "";


                		Integer profitReportOfNewCarInt = valueOfActionSalesform.getProfitReportOfNewCar();
		valueOfActionSalesform.setProfitReportOfNewCar(null);
		Integer actionForSalesInt = valueOfActionSalesform.getActionForSales();
		valueOfActionSalesform.setActionForSales(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(valueOfActionSalesform.getId() == null || valueOfActionSalesform.getId().intValue() == 0){
			valueOfActionSales.setId(null);
			valueOfActionSalesform.setId(null);
		}else{
			valueOfActionSales.setId(valueOfActionSalesform.getId());
			Criteria criteria = session.createCriteria(ValueOfActionSales.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			valueOfActionSales = (ValueOfActionSales) criteria.uniqueResult();

		}
                		valueOfActionSales.setPrice(valueOfActionSalesform.getPrice());


		
		StringFullfiller.fullfil(valueOfActionSales);
                		Criteria criteria2 = session.createCriteria(ProfitReportOfNewCar.class);
		criteria2.add(Restrictions.idEq(profitReportOfNewCarInt));
		ProfitReportOfNewCar profitreportofnewcar = (ProfitReportOfNewCar) criteria2.uniqueResult();
		valueOfActionSales.setProfitReportOfNewCar(profitreportofnewcar);
		criteria2 = session.createCriteria(ActionForSales.class);
		criteria2.add(Restrictions.idEq(actionForSalesInt));
		ActionForSales actionforsales = (ActionForSales) criteria2.uniqueResult();
		valueOfActionSales.setActionForSales(actionforsales);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(valueOfActionSales);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostValueOfActionSalesDetail.do", valueOfActionSales.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ValueOfActionSaless.do", valueOfActionSales.getId().toString());
		return null;

		
	}
	
	
}