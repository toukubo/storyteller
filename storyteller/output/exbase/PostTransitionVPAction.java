package net.exbase.web.app;

import net.exbase.model.*;
import net.exbase.beans.*;

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


public class PostTransitionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Transition transition = new TransitionImpl();
		TransitionForm transitionform = (TransitionForm) form;

                String error = "";


                		Integer nextActivityTemplateInt = transitionform.getNextActivityTemplate();
		transitionform.setNextActivityTemplate(null);
		Integer previousActivityTemplateInt = transitionform.getPreviousActivityTemplate();
		transitionform.setPreviousActivityTemplate(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(transitionform.getId() == null || transitionform.getId().intValue() == 0){
			transition.setId(null);
			transitionform.setId(null);
		}else{
			transition.setId(transitionform.getId());
			Criteria criteria = session.createCriteria(Transition.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			transition = (Transition) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(transition);
                		Criteria criteria2 = session.createCriteria(NextActivityTemplate.class);
		criteria2.add(Restrictions.idEq(nextActivityTemplateInt));
		NextActivityTemplate nextactivitytemplate = (NextActivityTemplate) criteria2.uniqueResult();
		transition.setNextActivityTemplate(nextactivitytemplate);
		criteria2 = session.createCriteria(PreviousActivityTemplate.class);
		criteria2.add(Restrictions.idEq(previousActivityTemplateInt));
		PreviousActivityTemplate previousactivitytemplate = (PreviousActivityTemplate) criteria2.uniqueResult();
		transition.setPreviousActivityTemplate(previousactivitytemplate);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(transition);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostTransitionDetail.do", transition.getId().toString());
		return null;

		
	}
	
	
}