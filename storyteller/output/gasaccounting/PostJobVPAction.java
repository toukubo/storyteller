package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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


public class PostJobVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Job job = new JobImpl();
		JobForm jobform = (JobForm) form;

                String error = "";


                		Integer jobCategoryInt = jobform.getJobCategory();
		jobform.setJobCategory(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(jobform.getId() == null || jobform.getId().intValue() == 0){
			job.setId(null);
			jobform.setId(null);
		}else{
			job.setId(jobform.getId());
			Criteria criteria = session.createCriteria(Job.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			job = (Job) criteria.uniqueResult();

		}
                		job.setCostsum(jobform.getCostsum());
		job.setName(jobform.getName());
		job.setTitle(jobform.getTitle());
		job.setActive(jobform.isActive());
		job.setCode(jobform.getCode());
		job.setActualsales(jobform.getActualsales());
		job.setActualsalesminuscost(jobform.getActualsalesminuscost());
		job.setProfitrate(jobform.getProfitrate());
		job.setHumanaletotalcost(jobform.getHumanaletotalcost());
		job.setTotalcost(jobform.getTotalcost());


		
		StringFullfiller.fullfil(job);
                		Criteria criteria2 = session.createCriteria(JobCategory.class);
		criteria2.add(Restrictions.idEq(jobCategoryInt));
		JobCategory jobcategory = (JobCategory) criteria2.uniqueResult();
		job.setJobCategory(jobcategory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(job);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostJobDetail.do", job.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Jobs.do", job.getId().toString());
		return null;

		
	}
	
	
}