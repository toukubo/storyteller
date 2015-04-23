package net.storyteller.web.app;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.J2eeStoryImpl;
import net.storyteller.model.Sentence;
import net.storyteller.model.StrutsAction;
import net.storyteller.model.crud.StrutsActionValueObject;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DisplayStrutsActionsOfJ2eeStoryAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		
		J2eeStory story = new J2eeStoryImpl();
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Criteria criteria = session.createCriteria(J2eeStory.class);
		criteria.add(Restrictions.eq("name", new String(req.getParameter("name"))));
		story = (J2eeStory) criteria.uniqueResult();
		
		Vector vector = new Vector();
		for (Iterator iter = story.getSentences().iterator(); iter.hasNext();) {
			Sentence sentence = (Sentence) iter.next();
			for (Iterator iterator = sentence.getStrutsActions().iterator(); iterator.hasNext();) {
				StrutsAction strutsAction = (StrutsAction) iterator.next();
				vector.add(strutsAction);
			}
		}
		if (StringUtils.isBlank(req.getParameter("vo"))) {
			List list = new ArrayList();
			for (Iterator iter = vector.iterator(); iter.hasNext();) {
				StrutsAction model = (StrutsAction) iter.next();
				StrutsActionValueObject valueObject = new StrutsActionValueObject();
				CopyProperties copyProperties = new CopyProperties(model,valueObject);
				list.add(valueObject);
			}
			res.setHeader("Pragma", ""); 
			res.setHeader("Cache-Control", ""); 
			res.setHeader("Content-Disposition","attachment; filename=StrutsActoinsOfAJ2eeStory."+ story.getId().toString()+".out");
			OutputStream outputStream = res.getOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(list);
			session.flush();
			outputStream.flush();
			outputStream.close();
			
		}
		return mapping.findForward("success");
	}
	
	
}
