package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class PostTestVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Test test = new TestImpl();
		TestForm testform = (TestForm) form;

                String error = "";


                		Integer j2eeStoryInt = testform.getJ2eeStory();
		testform.setJ2eeStory(null);
		Integer responsibleInt = testform.getResponsible();
		testform.setResponsible(null);
		Integer debuggerInt = testform.getDebugger();
		testform.setDebugger(null);
		Integer jspInt = testform.getJsp();
		testform.setJsp(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(testform.getId() == null || testform.getId().intValue() == 0){
			test.setId(null);
			testform.setId(null);
		}else{
			test.setId(testform.getId());
			Criteria criteria = session.createCriteria(Test.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			test = (Test) criteria.uniqueResult();

		}
                		test.setStepstorepeat(testform.getStepstorepeat());
		test.setWhatyouexpectedtosee(testform.getWhatyouexpectedtosee());
		test.setWhatyousawinstead(testform.getWhatyousawinstead());
		test.setDebuged(testform.isDebuged());
		test.setChecked(testform.isChecked());
		test.setSummery(testform.getSummery());


		
		StringFullfiller.fullfil(test);
                		Criteria criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(j2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		test.setJ2eeStory(j2eestory);
		criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(responsibleInt));
		IntraUser responsible = (IntraUser) criteria2.uniqueResult();
		test.setResponsible(responsible);
		criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(debuggerInt));
		IntraUser debugger = (IntraUser) criteria2.uniqueResult();
		test.setDebugger(debugger);
		criteria2 = session.createCriteria(Jsp.class);
		criteria2.add(Restrictions.idEq(jspInt));
		Jsp jsp = (Jsp) criteria2.uniqueResult();
		test.setJsp(jsp);
		
		IntraUser intraUser = (IntraUser) req.getAttribute("u");
		if(intraUser==null){
			Criteria criteria = session.createCriteria(IntraUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(1)));
			intraUser = (IntraUser) criteria.uniqueResult();
		}
		test.setCreator(intraUser);
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(test);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTestDetail.do", test.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Tests.do", test.getId().toString());
		return null;

		
	}
	
	
}