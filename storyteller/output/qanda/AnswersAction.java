package net.qanda.web.app;

import net.qanda.model.*;
import net.qanda.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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


public class AnswersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Answer.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Answer answer = (Answer) iter.next();
			vector.add(answer);
		}
		Answer answer = new AnswerImpl();
		AnswerForm answerform = new AnswerForm();
		criteria = session.createCriteria(Answer.class);


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
		
		
		req.setAttribute("answers",vector);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaQuestion= session.createCriteria(Question.class);
			req.setAttribute("Questions", criteriaQuestion.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}