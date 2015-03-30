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


public class PostPartnerMediaVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		PartnerMedia partnerMedia = new PartnerMediaImpl();
		PartnerMediaForm partnerMediaform = (PartnerMediaForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(partnerMediaform.getId() == null || partnerMediaform.getId().intValue() == 0){
			partnerMedia.setId(null);
			partnerMediaform.setId(null);
		}else{
			partnerMedia.setId(partnerMediaform.getId());
			Criteria criteria = session.createCriteria(PartnerMedia.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			partnerMedia = (PartnerMedia) criteria.uniqueResult();

		}
                		partnerMedia.setName(partnerMediaform.getName());


		
		StringFullfiller.fullfil(partnerMedia);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(partnerMedia);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostPartnerMediaDetail.do", partnerMedia.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PartnerMedias.do", partnerMedia.getId().toString());
		return null;

		
	}
	
	
}