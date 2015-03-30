package net.photo.web.app;

import net.photo.model.*;
import net.photo.beans.*;

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


public class PostAttachmentVPForOrdernumAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Attachment attachment = new AttachmentImpl();
		AttachmentForm attachmentform = (AttachmentForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",attachmentform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(attachmentform.getId() == null || attachmentform.getId().intValue() == 0){
			attachment.setId(null);
			attachmentform.setId(null);
		}else{
			attachment.setId(attachmentform.getId());
			Criteria criteria = session.createCriteria(Attachment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			attachment = (Attachment) criteria.uniqueResult();

		}
                		attachment.setOrdernum(attachmentform.getOrdernum());


		
		StringFullfiller.fullfil(attachment);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(attachment);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAttachmentDetail.do", attachment.getId().toString());
		return null;

		
	}
	
	
}