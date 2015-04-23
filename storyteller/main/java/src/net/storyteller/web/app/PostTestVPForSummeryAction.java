package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.beans.TestForm;
import net.storyteller.model.StaticData;
import net.storyteller.model.Test;
import net.storyteller.model.TestImpl;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostTestVPForSummeryAction extends Action{
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
		Integer creatorInt = testform.getCreator();
		testform.setCreator(null);
		Integer debuggerInt = testform.getDebugger();
		testform.setDebugger(null);
		Integer jspInt = testform.getJsp();
		testform.setJsp(null);
		Integer asnormalInt = testform.getAsnormal();
		testform.setAsnormal(null);
		Integer asmainInt = testform.getAsmain();
		testform.setAsmain(null);

		
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
		Criteria criteria2 = session.createCriteria(StaticData.class);
		criteria2.add(Restrictions.eq("id", new Integer(1)));
		StaticData staticData = (StaticData) criteria2.uniqueResult();
		if (staticData.isUnix()) {
			test.setSummery(new String(req.getParameter("summery").getBytes(
					"8859_1"), "UTF-8"));
		} else {
			test.setSummery(testform.getSummery());
		}

		
		StringFullfiller.fullfil(test);


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

		
		new HTTPGetRedirection(req, res, "ShowEstimation.do", req.getParameter("from"));
		return null;

		
	}
	
	
}