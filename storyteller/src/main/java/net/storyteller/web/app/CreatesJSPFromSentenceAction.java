package net.storyteller.web.app;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.Attr;
import net.storyteller.model.AttrUse;
import net.storyteller.model.Jsp;
import net.storyteller.model.JspImpl;
import net.storyteller.model.JspTemplate;
import net.storyteller.model.NounUse;
import net.storyteller.model.Sentence;
import net.storyteller.model.TemplateInput;
import net.storyteller.model.Verb;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CreatesJSPFromSentenceAction extends Action{
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

	Verb verb = sentence.getVerb();
	try {
		File specialInterpretrFile =  new File(this.getServlet().getServletContext().getRealPath("Interpreter"+verb.getName()+".class"));
		Interpreter interpreter = null;
		if(specialInterpretrFile.exists()){
			URLClassLoader classLoader= new URLClassLoader(new URL[]{specialInterpretrFile.toURL()});
			Class interpreterclass = classLoader.loadClass("Interpreter"+verb.getName() + ".class");
			interpreter =  (Interpreter)interpreterclass.newInstance();
		}else{
			interpreter = new DefaultInterpreter();
		}
		for (Iterator iter = verb.getJspTemplates().iterator(); iter.hasNext();) {
			JspTemplate JspTemplate = (JspTemplate) iter.next();
			String code = JspTemplate.getTemplate();
			String filename = JspTemplate.getNametemplate();
			for (Iterator iterator = JspTemplate.getVerb().getTemplateInputs().iterator(); iterator.hasNext();) {
				TemplateInput input = (TemplateInput) iterator.next();
				filename = filename.replaceAll("##"+input.getName()+"##",interpreter.interpret(sentence,input.getName()));
				code = StringUtils.replace(code,"##"+input.getName()+"##",interpreter.interpret(sentence,input.getName()));
			}
			if(StringUtils.isNotEmpty(sentence.getName())){
				String array[] = StringUtils.split(filename,".");
				String firstpart =array[0];
				String secoundpart = array[1];
				filename = firstpart + sentence.getName() + "."+secoundpart;
			}
			Jsp jsp= null;
			System.err.println("trial . do you have ##attr## in filename " + filename + "has attr ----------------------------------------------");
			
			if(filename.contains("##attr##") || filename.contains("##Attr##")){
				System.err.println("has attr ----------------------------------------------");
				if(filename.contains("Seperate")) {
					System.err.println("and seperated ----------------------------------------------");
					for (Iterator iterator = ((NounUse)sentence.getFirstobjective().getOfuse().toArray()[0]).getAttrUses().iterator(); iterator.hasNext();) {
						AttrUse attrUse = (AttrUse)iterator.next();
						Attr attr = attrUse.getAttr();
						String attrfilename = filename.replaceAll("##attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
						jsp = getJsp(session,attrfilename);
						String attrcode = code.toString();
						attrfilename  = attrfilename .replaceAll("##Attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
						attrcode = attrcode.replaceAll("##nameofsentence##",attrfilename +"Action");
						attrcode = attrcode.replaceAll("##attr##",attr.getName());
						attrcode = attrcode.replaceAll("##attrjapanese##",attr.getJapanese());

						attrcode = attrcode.replaceAll("##Attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
						jsp.setCode(attrcode);
						jsp.setFilename(attrfilename);
						jsp.setSentence(sentence);
						session.saveOrUpdate(jsp);
					}
				}else {
					System.err.println("in one file  ----------------------------------------------");
					jsp = getJsp(session,filename);
					StringBuilder builder = new StringBuilder();
					for (Iterator iterator = ((NounUse)sentence.getFirstobjective().getOfuse().toArray()[0]).getAttrUses().iterator(); iterator.hasNext();) {
						AttrUse attrUse = (AttrUse)iterator.next();
						Attr attr = attrUse.getAttr();
						String attrfilename = filename.replaceAll("##attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
						String attrcode = code.toString();
						attrfilename  = attrfilename .replaceAll("##Attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
						attrcode = attrcode.replaceAll("##nameofsentence##",attrfilename +"Action");
						attrcode = attrcode.replaceAll("##attrjapanese##",attr.getJapanese());
						attrcode = attrcode.replaceAll("##attr##",attr.getName());
						attrcode = attrcode.replaceAll("##Attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
						builder.append(attrcode);
						builder.append("\r\n");
					}
					jsp.setCode(builder.toString());
					jsp.setFilename(filename +"jsp.java");
					jsp.setSentence(sentence);
					session.saveOrUpdate(jsp);

					
				}
			}else {
				jsp = getJsp(session,filename);
				
				jsp.setCode(code);
				jsp.setFilename(filename);
				jsp.setSentence(sentence);
				session.saveOrUpdate(jsp);
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	session.saveOrUpdate(sentence);
	transaction.commit();
	session.flush();
	req.setAttribute("id", sentence.getId());
	return mapping.findForward("success");
}

private Jsp getJsp(Session session,String filename) {
	Criteria criteria2 = session.createCriteria(Jsp.class);
	Jsp jsp;
	criteria2.add(Restrictions.eq("filename",
			new String(filename)));
	if(criteria2.uniqueResult() == null){
		jsp = new JspImpl();
	}else{
		jsp = (Jsp) criteria2.uniqueResult();
	}
	return jsp;
}


}
