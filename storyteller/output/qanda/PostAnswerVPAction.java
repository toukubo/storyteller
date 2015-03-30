package net.qanda.web.app;

import net.qanda.model.*;
import net.qanda.beans.*;

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


public class PostAnswerVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Answer answer = new AnswerImpl();
		AnswerForm answerform = (AnswerForm) form;

                String error = "";


                		Integer intraUserInt = answerform.getIntraUser();
		answerform.setIntraUser(null);
		Integer questionInt = answerform.getQuestion();
		answerform.setQuestion(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(answerform.getId() == null || answerform.getId().intValue() == 0){
			answer.setId(null);
			answerform.setId(null);
		}else{
			answer.setId(answerform.getId());
			Criteria criteria = session.createCriteria(Answer.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			answer = (Answer) criteria.uniqueResult();

		}
                		answer.setContent(answerform.getContent());
		answer.setScore(answerform.getScore());
		answer.setDescription(answerform.getDescription());
		answer.setDate(answerform.getDate());


		
		StringFullfiller.fullfil(answer);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		answer.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Question.class);
		criteria2.add(Restrictions.idEq(questionInt));
		Question question = (Question) criteria2.uniqueResult();
		answer.setQuestion(question);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(answer);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostAnswerDetail.do", answer.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Answers.do", answer.getId().toString());
		return null;

		
	}
	
	
}