package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class PostCommonCostVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CommonCost commonCost = new CommonCostImpl();
		CommonCostForm commonCostform = (CommonCostForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(commonCostform.getId() == null || commonCostform.getId().intValue() == 0){
			commonCost.setId(null);
			commonCostform.setId(null);
		}else{
			commonCost.setId(commonCostform.getId());
			Criteria criteria = session.createCriteria(CommonCost.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			commonCost = (CommonCost) criteria.uniqueResult();

		}
                		commonCost.setCyclename(commonCostform.getCyclename());
		commonCost.setCycle(commonCostform.isCycle());
		commonCost.setEquipment(commonCostform.isEquipment());
		commonCost.setPayed(commonCostform.isPayed());
		commonCost.setCostperhour(commonCostform.getCostperhour());
		commonCost.setHour(commonCostform.getHour());
		commonCost.setValue(commonCostform.getValue());
		commonCost.setName(commonCostform.getName());


		
		StringFullfiller.fullfil(commonCost);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(commonCost);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCommonCostDetail.do", commonCost.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "CommonCosts.do", commonCost.getId().toString());
		return null;

		
	}
	
	
}