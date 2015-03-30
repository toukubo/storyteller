package net.gasbooknet.web;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

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

public class WorkTaggingVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		WorkTagging workTagging = new WorkTaggingImpl();
		WorkTaggingForm workTaggingform = (WorkTaggingForm) form;
		
                		Integer tagInt = workTaggingform.getTag();
		workTaggingform.setTag(null);
		Integer workInt = workTaggingform.getWork();
		workTaggingform.setWork(null);

		
		BeanUtils.copyProperties(workTagging,workTaggingform);
		StringFullfiller.fullfil(workTagging);
		if(workTaggingform.getId() == null || workTaggingform.getId().intValue() == 0){
			workTagging.setId(null);
		}else{
			workTagging.setId(workTaggingform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Tag.class);
		criteria2.add(Restrictions.idEq(tagInt));
		Tag tag = (Tag) criteria2.uniqueResult();
		workTagging.setTag(tag);
		criteria2 = session.createCriteria(Work.class);
		criteria2.add(Restrictions.idEq(workInt));
		Work work = (Work) criteria2.uniqueResult();
		workTagging.setWork(work);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(workTagging);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "WorkTaggingDetail.do", workTagging.getId().toString());
		return null;

		
	}
	
	
}