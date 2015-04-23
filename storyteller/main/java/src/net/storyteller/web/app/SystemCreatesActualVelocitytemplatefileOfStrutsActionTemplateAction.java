package net.storyteller.web.app;

import java.io.File;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.StrutsActionTemplate;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class SystemCreatesActualVelocitytemplatefileOfStrutsActionTemplateAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(StrutsActionTemplate.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		StrutsActionTemplate actionTemplate = (StrutsActionTemplate) criteria.uniqueResult();
		//		actionTemplate.setName()
		File actualTemplateFile = new File(this.getServlet().getServletContext().getRealPath("./files/StrutsActtionTemplate" + actionTemplate.getId().intValue() + ".vm"));
		File actualNameTemplateFile = new File(this.getServlet().getServletContext().getRealPath("./files/StrutsActtionFilenameTemplate" + actionTemplate.getId().intValue() + ".vm"));
		try {
			PrintWriter writer = new PrintWriter(actualNameTemplateFile);
			writer.write(actionTemplate.getNametemplate());
			writer.flush();
			writer.close();
			
			writer = new PrintWriter(actualTemplateFile);
			writer.write(actionTemplate.getTemplate());
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.saveOrUpdate(actionTemplate);
		transaction.commit();
		session.flush();

		req.setAttribute("id", actionTemplate.getId());
		
		
		
		
		
		return mapping.findForward("success");
	}
	
	
}
