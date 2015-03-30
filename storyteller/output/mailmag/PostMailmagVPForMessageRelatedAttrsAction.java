package net.mailmag.web.app;

import net.mailmag.model.*;
import net.mailmag.beans.*;

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


public class PostMailmagVPForMessageRelatedAttrsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Mailmag mailmag = new MailmagImpl();
		MailmagForm mailmagform = (MailmagForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",mailmagform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(mailmagform.getId() == null || mailmagform.getId().intValue() == 0){
			mailmag.setId(null);
			mailmagform.setId(null);
		}else{
			mailmag.setId(mailmagform.getId());
			Criteria criteria = session.createCriteria(Mailmag.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			mailmag = (Mailmag) criteria.uniqueResult();

		}
                		mailmag.setDescription(mailmagform.getDescription());
		mailmag.setTitle(mailmagform.getTitle());


		
		StringFullfiller.fullfil(mailmag);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(mailmag);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostMailmagDetail.do", mailmag.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Mailmags.do", mailmag.getId().toString());
		return null;

		
	}
	
	
}