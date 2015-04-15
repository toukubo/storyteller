package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

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


public class PostCommonTranslationDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//
//		CommonTranslation commontranslation = new CommonTranslationImpl();
//		CommonTranslationForm commontranslationform = new CommonTranslationForm();
//		Criteria criteria = session.createCriteria(CommonTranslation.class);
//
//		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
//			criteria.add(Restrictions.idEq(Integer.valueOf(req
//					.getParameter("id"))));
//			commontranslation = (CommonTranslation) criteria.uniqueResult();
//			new CopyProperties(commontranslation,commontranslationform);
//		} else if(req.getAttribute("form")!=null){
//                        commontranslationform = (CommonTranslationForm)req.getAttribute("form");
//			criteria.add(Restrictions.idEq(commontranslationform.getId()));
//			commontranslation = (CommonTranslation) criteria.uniqueResult();
//		}
//		
//
//		req.setAttribute("model",commontranslation);
//		req.setAttribute("form",commontranslationform);


                   
		
		return mapping.findForward("success");
	}
	
	
}