package net.mazdasalestool.web;

import net.mazdasalestool.model.*;
import net.mazdasalestool.model.crud.*;

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

public class ResultAndProductivityVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ResultAndProductivity resultAndProductivity = new ResultAndProductivityImpl();
		ResultAndProductivityForm resultAndProductivityform = (ResultAndProductivityForm) form;
		
                		Integer intraUserInt = resultAndProductivityform.getIntraUser();
		resultAndProductivityform.setIntraUser(null);

		
		BeanUtils.copyProperties(resultAndProductivity,resultAndProductivityform);
		StringFullfiller.fullfil(resultAndProductivity);
		if(resultAndProductivityform.getId() == null || resultAndProductivityform.getId().intValue() == 0){
			resultAndProductivity.setId(null);
		}else{
			resultAndProductivity.setId(resultAndProductivityform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		resultAndProductivity.setIntraUser(intrauser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(resultAndProductivity);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ResultAndProductivityDetail.do", resultAndProductivity.getId().toString());
		return null;

		
	}
	
	
}