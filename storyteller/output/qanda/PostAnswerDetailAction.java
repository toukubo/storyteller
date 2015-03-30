package net.qanda.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.qanda.model.*;
import net.qanda.beans.*;


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


public class PostAnswerDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Answer answer = new AnswerImpl();
		AnswerForm answerform = new AnswerForm();
		Criteria criteria = session.createCriteria(Answer.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			answer = (Answer) criteria.uniqueResult();
			new CopyProperties(answer,answerform);
		} else if(req.getAttribute("form")!=null){
                        answerform = (AnswerForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(answerform.getId()));
			answer = (Answer) criteria.uniqueResult();
		}
		

		req.setAttribute("model",answer);
		req.setAttribute("form",answerform);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaQuestion= session.createCriteria(Question.class);
			req.setAttribute("Questions", criteriaQuestion.list());

 
		
		return mapping.findForward("success");
	}
	
	
}