package net.ars.web.app;

import net.ars.model.*;
import net.ars.beans.*;

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


public class PostApprovalVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Approval approval = new ApprovalImpl();
		ApprovalForm approvalform = (ApprovalForm) form;

                String error = "";


                		Integer accidentInt = approvalform.getAccident();
		approvalform.setAccident(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(approvalform.getId() == null || approvalform.getId().intValue() == 0){
			approval.setId(null);
			approvalform.setId(null);
		}else{
			approval.setId(approvalform.getId());
			Criteria criteria = session.createCriteria(Approval.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			approval = (Approval) criteria.uniqueResult();

		}
                		approval.setApprovaldate(approvalform.getApprovaldate());
		approval.setPosition(approvalform.getPosition());


		
		StringFullfiller.fullfil(approval);
                		Criteria criteria2 = session.createCriteria(Accident.class);
		criteria2.add(Restrictions.idEq(accidentInt));
		Accident accident = (Accident) criteria2.uniqueResult();
		approval.setAccident(accident);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(approval);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostApprovalDetail.do", approval.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Approvals.do", approval.getId().toString());
		return null;

		
	}
	
	
}