package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class TestsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Test.class);
                
		if(StringUtils.isNotBlank(req.getParameter("j2eeStory"))) {
			Criteria criteria2 = session.createCriteria(J2eeStory.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("j2eeStory"))));
			J2eeStory j2eeStory = (J2eeStory) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("j2eeStory", j2eeStory));
		}
 




if(StringUtils.isNotBlank(req.getParameter("debuged"))){   if(req.getParameter("debuged").equals("true")){
      criteria.add(Restrictions.eq("debuged",true));
   }else{
      criteria.add(Restrictions.eq("debuged",false));
   }
}

if(StringUtils.isNotBlank(req.getParameter("checked"))){   if(req.getParameter("checked").equals("true")){
      criteria.add(Restrictions.eq("checked",true));
   }else{
      criteria.add(Restrictions.eq("checked",false));
   }
}



		if(StringUtils.isNotBlank(req.getParameter("jsp"))) {
			Criteria criteria2 = session.createCriteria(Jsp.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("jsp"))));
			Jsp jsp = (Jsp) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("jsp", jsp));
		}
 








		req.setAttribute("tests",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Test test = (Test) iter.next();
//			vector.add(test);
//		}
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
		
		


                  Criteria criteriaJ2eeStory= session.createCriteria(J2eeStory.class);
			req.setAttribute("J2eeStorys", criteriaJ2eeStory.list());

Criteria criteriaJsp= session.createCriteria(Jsp.class);
			req.setAttribute("Jsps", criteriaJsp.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}