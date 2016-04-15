package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.beans.*;


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


public class PostTestDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Test test = new TestImpl();
		TestForm testform = new TestForm();
		Criteria criteria = session.createCriteria(Test.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			test = (Test) criteria.uniqueResult();
			new CopyProperties(test,testform);
		} else if(req.getAttribute("form")!=null){
                        testform = (TestForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(testform.getId()));
			test = (Test) criteria.uniqueResult();
		}
		

		req.setAttribute("model",test);
		req.setAttribute("form",testform);



 

            Criteria criteriaJ2eeStory= session.createCriteria(J2eeStory.class);
		req.setAttribute("J2eeStorys", criteriaJ2eeStory.list());

Criteria criteriaJsp= session.createCriteria(Jsp.class);
		req.setAttribute("Jsps", criteriaJsp.list());
		
		Criteria criteriaIntraUser = session
				.createCriteria(IntraUser.class);
		req.setAttribute("IntraUsers", criteriaIntraUser.list());

		
		return mapping.findForward("success");
	}
	
	
}