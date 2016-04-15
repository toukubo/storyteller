package net.storyteller.web.app;

import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.beans.NounForm;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.Noun;
import net.storyteller.model.NounImpl;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class DisplayXmlOfNounAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Noun.class);
		if(StringUtils.isNotBlank(req.getParameter("j2eeStory"))){
			Criteria criteriaJ2eeStory = session.createCriteria(J2eeStory.class);
			criteriaJ2eeStory.add(Restrictions.eq("name", req.getParameter("j2eeStory")));
			J2eeStory j2eeStory = (J2eeStory) criteriaJ2eeStory.uniqueResult();
			criteria.add(Restrictions.eq("j2eeStory", j2eeStory));
		}
		
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Noun noun = (Noun) iter.next();
			vector.add(noun);
		}
		Noun noun = new NounImpl();
		NounForm nounform = new NounForm();
		criteria = session.createCriteria(Noun.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			noun = (Noun) criteria.uniqueResult();
			new CopyProperties(noun,nounform);
		} else if(req.getAttribute("form")!=null){
                        nounform = (NounForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(nounform.getId()));
			noun = (Noun) criteria.uniqueResult();
		}
		

		req.setAttribute("model",noun);
		req.setAttribute("form",nounform);
		
		
		req.setAttribute("nouns",vector);
		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}