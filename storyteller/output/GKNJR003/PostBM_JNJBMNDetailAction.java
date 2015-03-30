package net.GKNJR003.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.GKNJR003.model.*;
import net.GKNJR003.beans.*;


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


public class PostBM_JNJBMNDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		BM_JNJBMN bM_JNJBMN = new BM_JNJBMNImpl();
		BM_JNJBMNForm bM_JNJBMNform = new BM_JNJBMNForm();
		Criteria criteria = session.createCriteria(BM_JNJBMN.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			bM_JNJBMN = (BM_JNJBMN) criteria.uniqueResult();
			new CopyProperties(bM_JNJBMN,bM_JNJBMNform);
		} else if(req.getAttribute("form")!=null){
                        bM_JNJBMNform = (BM_JNJBMNForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(bM_JNJBMNform.getId()));
			bM_JNJBMN = (BM_JNJBMN) criteria.uniqueResult();
		}
		

		req.setAttribute("model",bM_JNJBMN);
		req.setAttribute("form",bM_JNJBMNform);


                   
		
		return mapping.findForward("success");
	}
	
	
}