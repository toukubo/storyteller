package net.storyteller.web.app;

import java.io.File;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.JspTemplate;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class SystemCreatesActualVelocityTemplatefileOfJspTemplate extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(JspTemplate.class);
		criteria
				.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		JspTemplate jsptemplate = (JspTemplate) criteria.uniqueResult();
		File templatefile = new File(this.getServlet().getServletContext().getRealPath("files/JSPTemplate" + jsptemplate.getId().intValue() + ".vm"));
		File nameTemplateFile = new File(this.getServlet().getServletContext().getRealPath("files/JSPFilenameTemplate" + jsptemplate.getId().intValue() + ".vm"));
		try {
			PrintWriter writer = new PrintWriter(templatefile);
			writer.write(jsptemplate.getTemplate());
			writer.flush();
			writer.close();
			
			writer = new PrintWriter(nameTemplateFile);
			writer.write(jsptemplate.getNametemplate());
			writer.flush();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		//		jsptemplate.setName()
		session.saveOrUpdate(jsptemplate);
		transaction.commit();
		session.flush();
		req.setAttribute("id", jsptemplate.getId());
		
		
		
		
		
		return mapping.findForward("success");
	}
	
	
}

