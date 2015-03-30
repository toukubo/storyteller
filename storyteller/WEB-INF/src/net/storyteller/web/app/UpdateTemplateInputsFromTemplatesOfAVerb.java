package net.storyteller.web.app;

import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.model.JspTemplate;
import net.storyteller.model.StrutsActionTemplate;
import net.storyteller.model.TemplateInput;
import net.storyteller.model.TemplateInputImpl;
import net.storyteller.model.Verb;
import net.storyteller.model.VerbImpl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class UpdateTemplateInputsFromTemplatesOfAVerb extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Verb verb = new VerbImpl();
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Criteria criteria = session.createCriteria(Verb.class);
		criteria
				.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		verb = (Verb) criteria.uniqueResult();
		req.setAttribute("verb", verb);
		Vector vector= new Vector();
		Pattern pattern = Pattern.compile("##.*##");
		
		
		
		
		for (Iterator iter = verb.getJspTemplates().iterator(); iter.hasNext();) {
			JspTemplate jspTemplate = (JspTemplate) iter.next();
			Matcher matcher = pattern.matcher(jspTemplate.getTemplate());
			while (matcher.find()) {
				for (int i = 0; i <= matcher.groupCount(); i++) {
					String string = matcher.group(i).replaceAll("#", "");
					vector.add(string);
				}
			}
		}
		for (Iterator iter = verb.getStrutsActionTemplates().iterator(); iter.hasNext();) {
			StrutsActionTemplate strutsActionTemplate= (StrutsActionTemplate) iter.next();
			Matcher matcher = pattern.matcher(strutsActionTemplate.getTemplate());
			while (matcher.find()) {
				for (int i = 0; i <= matcher.groupCount(); i++) {
					String string = matcher.group(i).replaceAll("#", "");
					vector.add(string);
				}
			}
		}
		
		for (Iterator iter = vector.iterator(); iter.hasNext();) {
			String string = (String) iter.next();
			Criteria criteria2 = session.createCriteria(TemplateInput.class);
			criteria2.add(Restrictions.eq("verb", verb));
			criteria2.add(Restrictions.eq("name", new String(string)));
			TemplateInput templateInput = (TemplateInput) criteria2.uniqueResult();
			if(templateInput==null){
				templateInput = new TemplateInputImpl();
				templateInput.setVerb(verb);
				templateInput.setName(string);
				Transaction transaction = session.beginTransaction();
				session.saveOrUpdate(templateInput);
				transaction.commit();
				session.flush();
			}
		}
		
		new HTTPGetRedirection(req, res, "VerbDetail.do", verb.getId().toString());
		return null;
	}
	
	
}
