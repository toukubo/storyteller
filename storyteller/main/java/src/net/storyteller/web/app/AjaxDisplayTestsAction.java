package net.storyteller.web.app;

import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.beans.TestForm;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.IntraUser;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.Jsp;
import net.storyteller.model.Test;
import net.storyteller.model.TestImpl;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class AjaxDisplayTestsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Test.class);
		if(StringUtils.isNotBlank(req.getParameter("j2eeStory"))){
			Criteria criteriaJ2eeStory = session
					.createCriteria(J2eeStory.class);
			criteriaJ2eeStory.add(Restrictions.eq("id", Integer.valueOf(req.getParameter("j2eeStory"))));
			J2eeStory story = (J2eeStory) criteriaJ2eeStory
					.uniqueResult();
			criteria.add(Restrictions.eq("j2eeStory", story));
		}
		if(StringUtils.isNotBlank(req.getParameter("debuged"))){
			criteria.add(Restrictions.eq("debuged", new Boolean( req.getParameter("debuged") )));
		}
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Test test = (Test) iter.next();
			vector.add(test);
		}
		Test test = new TestImpl();
		TestForm testform = new TestForm();
		criteria = session.createCriteria(Test.class);


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
		
		
		req.setAttribute("tests",vector);


                  Criteria criteriaJ2eeStory= session.createCriteria(J2eeStory.class);
			req.setAttribute("J2eeStorys", criteriaJ2eeStory.list());

Criteria criteriaJsp= session.createCriteria(Jsp.class);
			req.setAttribute("Jsps", criteriaJsp.list());
			Criteria criteriaIntraUser = session
					.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}