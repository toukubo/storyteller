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


public class PostContributeVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Contribute contribute = new ContributeImpl();
		ContributeForm contributeform = (ContributeForm) form;

                String error = "";


                		Integer contributionTypeInt = contributeform.getContributionType();
		contributeform.setContributionType(null);
		Integer intraUserInt = contributeform.getIntraUser();
		contributeform.setIntraUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(contributeform.getId() == null || contributeform.getId().intValue() == 0){
			contribute.setId(null);
			contributeform.setId(null);
		}else{
			contribute.setId(contributeform.getId());
			Criteria criteria = session.createCriteria(Contribute.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			contribute = (Contribute) criteria.uniqueResult();

		}
                		contribute.setValidyearstart(contributeform.getValidyearstart());
		contribute.setValidmonthstart(contributeform.getValidmonthstart());
		contribute.setValidmonthend(contributeform.getValidmonthend());
		contribute.setPoint(contributeform.getPoint());
		contribute.setValidyearend(contributeform.getValidyearend());
		contribute.setAcknowledged(contributeform.isAcknowledged());


		
		StringFullfiller.fullfil(contribute);
                		Criteria criteria2 = session.createCriteria(ContributionType.class);
		criteria2.add(Restrictions.idEq(contributionTypeInt));
		ContributionType contributiontype = (ContributionType) criteria2.uniqueResult();
		contribute.setContributionType(contributiontype);
		criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		contribute.setIntraUser(intrauser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(contribute);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostContributeDetail.do", contribute.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "AjaxDisplayContributes.do", null);
		return null;

		
	}
	
	
}