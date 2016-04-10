
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
import net.storyteller.model.NounUse;
import net.storyteller.model.Sentence;
import net.storyteller.model.StrutsAction;
import net.storyteller.model.StrutsActionImpl;
import net.storyteller.model.StrutsActionTemplate;
import net.storyteller.model.TemplateInput;
import net.storyteller.model.ValidationRuleChoise;
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

public class CreatesStrutsActionsFromSentenceAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext(),100);
		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Sentence.class);
		criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		
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
			for (Iterator iter = verb.getStrutsActionTemplates().iterator(); iter.hasNext();) {
				StrutsActionTemplate actionTemplate = (StrutsActionTemplate) iter.next();
				String code = actionTemplate.getTemplate();
					String filename =actionTemplate.getNametemplate();
					for (Iterator iterator = actionTemplate.getVerb().getTemplateInputs().iterator(); iterator.hasNext();) {
						TemplateInput input = (TemplateInput) iterator.next();
						filename = filename.replaceAll("##"+input.getName()+"##",interpreter.interpret(sentence,input.getName()));
						String modelclassname = "";
						if(input.getName().equals("validation")){
							StringBuilder builder = new StringBuilder();
							builder.append("String error = \"\";\r\n");
							for (Iterator iterator4 = sentence.getFirstobjective().getOfuse().iterator(); iterator4.hasNext();) {
								NounUse nounUse = (NounUse) iterator4.next();
								nounUse.getNoun().getName();
								if(nounUse.getAttrUses().size()>0){
									for (Iterator iterator5 = nounUse.getAttrUses()
											.iterator(); iterator5.hasNext();) {
										AttrUse attrUse = (AttrUse) iterator5.next();
										for (Iterator it7 = attrUse.getValidationRuleChoises()
												.iterator(); it7.hasNext();) {
											ValidationRuleChoise validationRuleChoise = (ValidationRuleChoise) it7.next();
											String template = validationRuleChoise.getValidationRule().getTemplate();
											template = template.replaceAll("##Attr##",attrUse.getAttr().getName().substring(0,1).toUpperCase()+attrUse.getAttr().getName().substring(1));
											template = template.replaceAll("##attr##",attrUse.getAttr().getName());
											template = template.replaceAll("##noun##",nounUse.getNoun().getName().toLowerCase());
											template = template.replaceAll("##japanese##",attrUse.getAttr().getJapanese());
											builder.append(template+"\r\n");
										}
									}
									//adding codes for checking this is error.
									builder.append("if(StringUtils.isNotBlank(error)){\r\n");
									builder.append("	req.getSession().setAttribute(\"error\",error);\r\n");
									builder.append("	req.setAttribute(\"form\","+DefaultInterpreter.getObjFromClass(nounUse.getNoun().getName())+"form);\r\n");
									builder.append("	return mapping.findForward(\"error\");\r\n");
//									builder.append("        	new HTTPGetRedirection(req, res, \""+nounUse.getNoun().getName()+"Detail.do\", "+nounUse.getNoun().getName().toLowerCase()+"form.getId().toString());\r\n");
									builder.append("}\r\n");
								}
							}
							code = code.replaceAll("##validation##",builder.toString());
						}
						if(interpreter.interpret(sentence,input.getName()) !=null){
							code = code.replaceAll("##"+input.getName()+"##",interpreter.interpret(sentence,input.getName()));
						}
					}
					if(StringUtils.isNotEmpty(sentence.getName())){
						filename = filename + sentence.getName();
					}
					StrutsAction action = null;
					if(filename.contains("##attr##") || filename.contains("##Attr##")){
						if(filename.contains("Seperate")) {
							for (Iterator iterator = ((NounUse)sentence.getFirstobjective().getOfuse().toArray()[0]).getAttrUses().iterator(); iterator.hasNext();) {
								AttrUse attrUse = (AttrUse)iterator.next();
								Attr attr = attrUse.getAttr();
								String attrfilename = filename.replaceAll("##attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
								action = getAttrAction(session,attrfilename);
								String attrcode = code.toString();
								attrfilename  = attrfilename .replaceAll("##Attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
								attrcode = attrcode.replaceAll("##nameofsentence##",attrfilename +"");
								attrcode = attrcode.replaceAll("##attr##",attr.getName());
								attrcode = attrcode.replaceAll("##attrjapanese##",attr.getJapanese());
								attrcode = attrcode.replaceAll("##Attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
								action.setCode(attrcode);
								action.setFilename(attrfilename +".java");
								action.setSentence(sentence);
								session.saveOrUpdate(action);
							}
						}else {
							action = getAction(session,filename);
							StringBuilder builder = new StringBuilder();
							for (Iterator iterator = ((NounUse)sentence.getFirstobjective().getOfuse().toArray()[0]).getAttrUses().iterator(); iterator.hasNext();) {
								AttrUse attrUse = (AttrUse)iterator.next();
								Attr attr = attrUse.getAttr();
								String attrfilename = filename.replaceAll("##attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
								String attrcode = code.toString();
								attrfilename  = attrfilename .replaceAll("##Attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
								attrcode = attrcode.replaceAll("##nameofsentence##",attrfilename +"");
								attrcode = attrcode.replaceAll("##attr##",attr.getName());
								attrcode = attrcode.replaceAll("##attrjapanese##",attr.getJapanese());
								attrcode = attrcode.replaceAll("##Attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
								builder.append(attrcode);
								builder.append("\r\n");
							}
							action.setCode(builder.toString());
							action.setFilename(filename +".java");
							action.setSentence(sentence);
							session.saveOrUpdate(action);
						}
					}else{
						action = getAction(session, filename);
						code = code.replaceAll("##nameofsentence##",filename+"");
						action.setCode(code);
						action.setFilename(filename+".java");
						action.setSentence(sentence);
						session.saveOrUpdate(action);
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

	private StrutsAction getAction(Session session, String filename) {
		StrutsAction action;
		Criteria criteria2 = session.createCriteria(StrutsAction.class);
		criteria2.add(Restrictions.eq("filename",
				new String(filename+".java")));
		if(criteria2.uniqueResult() == null){
			action = new StrutsActionImpl();
		}else{
			action = (StrutsAction) criteria2.uniqueResult();
		}
		return action;
	}

	private StrutsAction getAttrAction(Session session, String attrfilename) {
		Criteria criteria2 = session.createCriteria(StrutsAction.class);
		criteria2.add(Restrictions.eq("filename",new String(attrfilename+".java")));
		StrutsAction action = null;
		if(criteria2.uniqueResult() == null){
			action = new StrutsActionImpl();								
		}else {
			action = (StrutsAction)criteria2.uniqueResult();
		}
		return action;
	}
	
	
}
