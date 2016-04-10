package net.storyteller.web.app;

import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.Estimation;
import net.storyteller.model.EstimationChoise;
import net.storyteller.model.EstimationImpl;
import net.storyteller.model.Test;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ShowEstimationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Estimation estimation = new EstimationImpl();
		Criteria criteria = session.createCriteria(Estimation.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			estimation = (Estimation) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			estimation = (Estimation) criteria.uniqueResult();
		}

		req.setAttribute("estimation",estimation);
		
		Vector Tests = new Vector();
		
		Criteria criteriaTest = session.createCriteria(Test.class);
		criteriaTest.add(Restrictions.eq("j2eeStory", estimation.getJ2eeStory()));
		if(StringUtils.isNotBlank(req.getParameter("withNullEstimationChoises"))){
			criteriaTest.add(Restrictions.isEmpty("estimationChoises"));
		}
		for (Iterator iter = criteriaTest.list().iterator(); iter.hasNext();) {
			Test test = (Test) iter.next();
			boolean chosen = false;
			for (Iterator iterator = estimation.getEstimationChoises().iterator(); iterator.hasNext();) {
				EstimationChoise choise = (EstimationChoise) iterator.next();
				if(choise.getTest().getId().intValue() == test.getId().intValue()){
					chosen = true;
				}
			}
			if(!chosen){
				Tests.add(test);
			}
		}
		req.setAttribute("Tests", Tests);
		Vector vector = new Vector();
		vector.addAll(estimation.getEstimationChoises());
		if(StringUtils.isNotBlank(req.getParameter("export"))){
			res.setHeader("Pragma", ""); 
			res.setHeader("Cache-Control", ""); 
			res.setHeader("Content-Disposition","attachment; filename=Estimation_"+estimation.getId().toString()+"-"+estimation.getJ2eeStory().getName()+".xls"); 

			if(StringUtils.isNotBlank(req.getParameter("intra"))){
				XlsExportOfEstimationChoiseForIntraUserAction xlsExportOfEstimationChoiseForIntraUserAction
				 = new XlsExportOfEstimationChoiseForIntraUserAction(vector,res.getOutputStream(),session);
			}else{
				XlsExportOfEstimationChoiseAction xlsExportOfEstimationChoiseAction
				= new XlsExportOfEstimationChoiseAction(vector,res.getOutputStream(),session);
			}
		}
		
		
		
		return mapping.findForward("success");
	}
	
	
}