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


public class UpdateEstimationFromForSummingupAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Estimation estimation = new EstimationImpl();
		EstimationForm estimationform = new EstimationForm();
		Criteria criteria = session.createCriteria(Estimation.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			estimation = (Estimation) criteria.uniqueResult();
			new CopyProperties(estimation,estimationform);
		} else if(req.getAttribute("form")!=null){
                        estimationform = (EstimationForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(estimationform.getId()));
			estimation = (Estimation) criteria.uniqueResult();
		}
                   
                   
		



	}
}