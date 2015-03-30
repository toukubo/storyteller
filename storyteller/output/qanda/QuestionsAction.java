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


public class QuestionsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Question.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Question question = (Question) iter.next();
			vector.add(question);
		}
		Question question = new QuestionImpl();
		QuestionForm questionform = new QuestionForm();
		criteria = session.createCriteria(Question.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			question = (Question) criteria.uniqueResult();
			new CopyProperties(question,questionform);
		} else if(req.getAttribute("form")!=null){
                        questionform = (QuestionForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(questionform.getId()));
			question = (Question) criteria.uniqueResult();
		}
		

		req.setAttribute("model",question);
		req.setAttribute("form",questionform);
		
		
		req.setAttribute("questions",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}