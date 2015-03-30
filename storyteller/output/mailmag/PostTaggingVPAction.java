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


public class PostTaggingVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Tagging tagging = new TaggingImpl();
		TaggingForm taggingform = (TaggingForm) form;

                String error = "";


                		Integer publicUserInt = taggingform.getPublicUser();
		taggingform.setPublicUser(null);
		Integer tagInt = taggingform.getTag();
		taggingform.setTag(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(taggingform.getId() == null || taggingform.getId().intValue() == 0){
			tagging.setId(null);
			taggingform.setId(null);
		}else{
			tagging.setId(taggingform.getId());
			Criteria criteria = session.createCriteria(Tagging.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			tagging = (Tagging) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(tagging);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		tagging.setPublicUser(publicuser);
		criteria2 = session.createCriteria(Tag.class);
		criteria2.add(Restrictions.idEq(tagInt));
		Tag tag = (Tag) criteria2.uniqueResult();
		tagging.setTag(tag);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(tagging);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTaggingDetail.do", tagging.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Taggings.do", tagging.getId().toString());
		return null;

		
	}
	
	
}