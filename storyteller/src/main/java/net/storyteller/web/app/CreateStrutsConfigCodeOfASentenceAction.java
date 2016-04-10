package net.storyteller.web.app;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.model.NounUse;
import net.storyteller.model.Sentence;
import net.storyteller.model.StrutsAction;
import net.storyteller.model.StrutsActionTemplate;
import net.storyteller.model.TemplateInput;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CreateStrutsConfigCodeOfASentenceAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Sentence.class);
		criteria.add(Restrictions.idEq(req.getAttribute("id")));
		Sentence sentence = (Sentence) criteria.uniqueResult();
		StringBuilder builder = new StringBuilder();
		try {
			File specialInterpretrFile =  new File(this.getServlet().getServletContext().getRealPath("Interpreter"+sentence.getVerb().getName()+".class"));
			Interpreter interpreter = null;
			if(specialInterpretrFile.exists()){
				URLClassLoader classLoader= new URLClassLoader(new URL[]{specialInterpretrFile.toURL()});
				Class interpreterclass = classLoader.loadClass("Interpreter"+sentence.getVerb().getName() + ".class");
				interpreter =  (Interpreter)interpreterclass.newInstance();
			}else{
				interpreter = new DefaultInterpreter();
			}
			
			for (Iterator iter = sentence.getStrutsActions().iterator(); iter.hasNext();) {
				StrutsAction targeterAction = (StrutsAction) iter.next();
				String filename = targeterAction.getFilename();
				filename = filename.replaceAll("Action.java","");
				StringBuilder builder2 = new StringBuilder();
				builder2.append("	<action path=\"/");
				builder2.append(filename);
				builder2.append("\" ");
				
				if(targeterAction.getFilename().contains("VP")){
					builder2.append("name=\"");
					builder2.append(((NounUse)sentence.getFirstobjective().getOfuse().toArray()[0]).getNoun().getName());
					builder2.append("Form");
					builder2.append("\" ");
				}
				builder2.append("type=\"");
				if(sentence.getVerb().getName().equals("ALL")){
					
					builder2.append("net."+sentence.getJ2eeStory().getName()+".web.");
				}else{
					
					builder2.append("net."+sentence.getJ2eeStory().getName()+".web.app.");
				}
				builder2.append(filename+"Action");
				builder2.append("\">\r\n");
				builder2.append("  <forward name=\"success\" path=\"");
				String forwardstring = "";
				if(targeterAction.getTargeteeaction()!=null){
					String targeteefilename = targeterAction.getTargeteeaction().getFilename();
					targeteefilename = targeteefilename.replaceAll("Action.java","");
					forwardstring = "/"+targeteefilename + ".do";
				}else if(targeterAction.getTargeteejsp()!=null){
					forwardstring = "/pages/" + targeterAction.getTargeteejsp().getFilename();
				}else{
					forwardstring = "";
				}
				builder2.append(forwardstring+"\" />\r\n");
				builder2.append("</action>\r\n");
				builder.append(builder2.toString());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		sentence.setStrutsConfigCode(builder.toString());	
		session.saveOrUpdate(sentence);
		transaction.commit();
		session.flush();

//		req.setAttribute("id", sentence.getId());
		
		new HTTPGetRedirection(req, res, "J2eeStoryDetail.do", sentence.getJ2eeStory().getId().toString());
		return null;
		
		
	}
}


