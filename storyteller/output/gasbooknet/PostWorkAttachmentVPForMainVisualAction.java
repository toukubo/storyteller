package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class PostWorkAttachmentVPForMainVisualAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		WorkAttachment workAttachment = new WorkAttachmentImpl();
		WorkAttachmentForm workAttachmentform = (WorkAttachmentForm) form;

                String error = "";


                		Integer workInt = workAttachmentform.getWork();
		workAttachmentform.setWork(null);
		Integer attachmentInt = workAttachmentform.getAttachment();
		workAttachmentform.setAttachment(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(workAttachmentform.getId() == null || workAttachmentform.getId().intValue() == 0){
			workAttachment.setId(null);
			workAttachmentform.setId(null);
		}else{
			workAttachment.setId(workAttachmentform.getId());
			Criteria criteria = session.createCriteria(WorkAttachment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			workAttachment = (WorkAttachment) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(workAttachment);
                		Criteria criteria2 = session.createCriteria(Work.class);
		criteria2.add(Restrictions.idEq(workInt));
		Work work = (Work) criteria2.uniqueResult();
		workAttachment.setWork(work);
		criteria2 = session.createCriteria(Attachment.class);
		criteria2.add(Restrictions.idEq(attachmentInt));
		Attachment attachment = (Attachment) criteria2.uniqueResult();
		workAttachment.setAttachment(attachment);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(workAttachment);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostWorkAttachmentDetail.do", workAttachment.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "WorkAttachments.do", workAttachment.getId().toString());
		return null;

		
	}
	
	
}