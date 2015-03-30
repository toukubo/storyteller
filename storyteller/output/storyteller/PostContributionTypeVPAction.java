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


public class PostContributionTypeVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ContributionType contributionType = new ContributionTypeImpl();
		ContributionTypeForm contributionTypeform = (ContributionTypeForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(contributionTypeform.getId() == null || contributionTypeform.getId().intValue() == 0){
			contributionType.setId(null);
			contributionTypeform.setId(null);
		}else{
			contributionType.setId(contributionTypeform.getId());
			Criteria criteria = session.createCriteria(ContributionType.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			contributionType = (ContributionType) criteria.uniqueResult();

		}
                		contributionType.setName(contributionTypeform.getName());


		
		StringFullfiller.fullfil(contributionType);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(contributionType);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostContributionTypeDetail.do", contributionType.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ContributionTypes.do", contributionType.getId().toString());
		return null;

		
	}
	
	
}