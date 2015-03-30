package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class PostCommonTranslationVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CommonTranslation commontranslation = new CommonTranslationImpl();
		CommonTranslationForm commontranslationform = (CommonTranslationForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(commontranslationform.getId() == null || commontranslationform.getId().intValue() == 0){
			commontranslation.setId(null);
			commontranslationform.setId(null);
		}else{
			commontranslation.setId(commontranslationform.getId());
			Criteria criteria = session.createCriteria(CommonTranslation.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			commontranslation = (CommonTranslation) criteria.uniqueResult();

		}
                		commontranslation.setName(commontranslationform.getName());
		commontranslation.setJapanese(commontranslationform.getJapanese());


		
		StringFullfiller.fullfil(commontranslation);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(commontranslation);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCommonTranslationDetail.do", commontranslation.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "CommonTranslations.do", commontranslation.getId().toString());
		return null;

		
	}
	
	
}