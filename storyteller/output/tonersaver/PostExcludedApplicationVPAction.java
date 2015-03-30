package net.tonersaver.web.app;

import net.tonersaver.model.*;
import net.tonersaver.beans.*;

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


public class PostExcludedApplicationVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExcludedApplication excludedApplication = new ExcludedApplicationImpl();
		ExcludedApplicationForm excludedApplicationform = (ExcludedApplicationForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(excludedApplicationform.getId() == null || excludedApplicationform.getId().intValue() == 0){
			excludedApplication.setId(null);
			excludedApplicationform.setId(null);
		}else{
			excludedApplication.setId(excludedApplicationform.getId());
			Criteria criteria = session.createCriteria(ExcludedApplication.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			excludedApplication = (ExcludedApplication) criteria.uniqueResult();

		}
                		excludedApplication.setName(excludedApplicationform.getName());


		
		StringFullfiller.fullfil(excludedApplication);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(excludedApplication);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostExcludedApplicationDetail.do", excludedApplication.getId().toString());
		return null;

		
	}
	
	
}