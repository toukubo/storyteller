package net.storyteller.web.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.Attr;
import net.storyteller.model.Jsp;
import net.storyteller.model.NounUse;
import net.storyteller.model.Sentence;
import net.storyteller.model.StrutsAction;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.util.FileCopyUtils;

public class CreateActualFilesOfJSPsAndStrutsActionsOfASentenceAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext(),30);
		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Sentence.class);
		criteria.add(Restrictions.idEq(req.getAttribute("id")));
		Sentence sentence = (Sentence) criteria.uniqueResult();
		for (Iterator iter = sentence.getStrutsActions().iterator(); iter.hasNext();) {
			StrutsAction strutsAction = (StrutsAction) iter.next();
			if(strutsAction.getFilename().contains("##attr##") || strutsAction.getFilename().contains("##Attr##")){
				for (Iterator iterator = ((NounUse)strutsAction.getSentence().getFirstobjective().getOfuse().toArray()[0]).getNoun().getAttrs().iterator(); iterator
						.hasNext();) {
					Attr attr = (Attr)iterator.next();
					File dir = new File(this.getServlet().getServletContext().getRealPath("output/" +sentence.getJ2eeStory().getName() + "/"+sentence.getJ2eeStory().getName().replaceAll(".","/")));
					if(!dir.exists()){
						dir.mkdirs();
						dir.createNewFile();
					}
					String filename = strutsAction.getFilename().replaceAll("##attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
					String codestr = strutsAction.getCode().replaceAll("##attr##",attr.getName());
					filename = filename.replaceAll("##Attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
					codestr = codestr.replaceAll("##Attr##",attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1));
					File file = new File(dir.getAbsolutePath() + "/" + filename);
					PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8"));
					writer.write(codestr);
					writer.flush();
					writer.close();
				}
			}else{
				File dir = new File(this.getServlet().getServletContext().getRealPath("output/"+ sentence.getJ2eeStory().getName() + "/" +sentence.getJ2eeStory().getName().replaceAll(".","/")));
				if(!dir.exists()){
					dir.mkdirs();
					dir.createNewFile();
				}
				File file = new File(dir.getAbsolutePath() + "/" + strutsAction.getFilename());
				PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8"));
				writer.write(strutsAction.getCode());
				writer.flush();
				writer.close();
			}
		}
		for (Iterator iter = sentence.getJsps().iterator(); iter.hasNext();) {
			Jsp jsp = (Jsp) iter.next();
			File dir = new File(this.getServlet().getServletContext().getRealPath("output/"+ sentence.getJ2eeStory().getName() + "/pages/"+sentence.getJ2eeStory().getName().replaceAll(".","/")));
			if(!dir.exists()){
				dir.mkdirs();
			}
			File file = new File(dir.getAbsolutePath() + "/" + jsp.getFilename());
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8"));
			writer.write(jsp.getCode());
			writer.flush();
			writer.close();
			
			FileCopyUtils.copy(file,new File(file.getAbsolutePath().replaceAll(".jsp","_jsp")));
			
		}
		
		
		session.saveOrUpdate(sentence);
		transaction.commit();
		session.flush();

		req.setAttribute("id", sentence.getId());
		
		return mapping.findForward("success");
	}
	
	
}

