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


public class PostQuestionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Question question = new QuestionImpl();
		QuestionForm questionform = (QuestionForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(questionform.getId() == null || questionform.getId().intValue() == 0){
			question.setId(null);
			questionform.setId(null);
		}else{
			question.setId(questionform.getId());
			Criteria criteria = session.createCriteria(Question.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			question = (Question) criteria.uniqueResult();

		}
                		question.setOrdernum(questionform.getOrdernum());
		question.setPrequestion(questionform.getPrequestion());
		question.setFullscore(questionform.getFullscore());
		question.setDescription(questionform.getDescription());


		
		StringFullfiller.fullfil(question);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(question);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostQuestionDetail.do", question.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Questions.do", question.getId().toString());
		return null;

		
	}
	
	
}