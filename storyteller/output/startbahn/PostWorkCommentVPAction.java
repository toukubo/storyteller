package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostWorkCommentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		WorkComment workComment = new WorkCommentImpl();
		WorkCommentForm workCommentform = (WorkCommentForm) form;

                String error = "";


                		Integer workInt = workCommentform.getWork();
		workCommentform.setWork(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(workCommentform.getId() == null || workCommentform.getId().intValue() == 0){
			workComment.setId(null);
			workCommentform.setId(null);
		}else{
			workComment.setId(workCommentform.getId());
			Criteria criteria = session.createCriteria(WorkComment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			workComment = (WorkComment) criteria.uniqueResult();

		}
                		workComment.setTitle(workCommentform.getTitle());
		workComment.setDescription(workCommentform.getDescription());
		workComment.setDate(workCommentform.getDate());


		
		StringFullfiller.fullfil(workComment);
                		Criteria criteria2 = session.createCriteria(Work.class);
		criteria2.add(Restrictions.idEq(workInt));
		Work work = (Work) criteria2.uniqueResult();
		workComment.setWork(work);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(workComment);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostWorkCommentDetail.do", workComment.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "WorkComments.do", workComment.getId().toString());
		return null;

		
	}
	
	
}