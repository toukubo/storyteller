package net.realize.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.realize.model.*;
import net.realize.beans.*;


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


public class PostIntroductionDetailSettingIntroductionAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Introduction introduction = new IntroductionImpl();
		IntroductionForm introductionform = new IntroductionForm();
		Criteria criteria = session.createCriteria(Introduction.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			introduction = (Introduction) criteria.uniqueResult();
			new CopyProperties(introduction,introductionform);
		} else if(req.getAttribute("form")!=null){
                        introductionform = (IntroductionForm)req.getAttribute("form");
			req.setAttribute("error", req.getSession().getAttribute("error"));
			req.getSession().setAttribute("error", null);

			criteria.add(Restrictions.idEq(introductionform.getId()));
			introduction = (Introduction) criteria.uniqueResult();
		}
		

		req.setAttribute("model",introduction);
		req.setAttribute("form",introductionform);


                  Criteria criteriaCommitionPayment= session.createCriteria(CommitionPayment.class);
			req.setAttribute("CommitionPayments", criteriaCommitionPayment.list());

 
		
		return mapping.findForward("success");
	}
	
	
}