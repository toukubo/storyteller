package net.gasbooknet.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class PostWorkAttachmentDetailForMainVisualAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		WorkAttachment workAttachment = new WorkAttachmentImpl();
		WorkAttachmentForm workAttachmentform = new WorkAttachmentForm();
		Criteria criteria = session.createCriteria(WorkAttachment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			workAttachment = (WorkAttachment) criteria.uniqueResult();
			new CopyProperties(workAttachment,workAttachmentform);
		} else if(req.getAttribute("form")!=null){
                        workAttachmentform = (WorkAttachmentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(workAttachmentform.getId()));
			workAttachment = (WorkAttachment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",workAttachment);
		req.setAttribute("form",workAttachmentform);


                  Criteria criteriaWork= session.createCriteria(Work.class);
			req.setAttribute("Works", criteriaWork.list());

Criteria criteriaAttachment= session.createCriteria(Attachment.class);
			req.setAttribute("Attachments", criteriaAttachment.list());

 
		
		return mapping.findForward("success");
	}
	
	
}