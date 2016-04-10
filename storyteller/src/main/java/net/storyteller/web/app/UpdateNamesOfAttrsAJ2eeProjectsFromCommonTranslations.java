package net.storyteller.web.app;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;
import net.storyteller.model.Attr;
import net.storyteller.model.CommonTranslation;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.J2eeStoryImpl;
import net.storyteller.model.Noun;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class UpdateNamesOfAttrsAJ2eeProjectsFromCommonTranslations extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		J2eeStory j2eeStory = new J2eeStoryImpl();
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Criteria criteria = session.createCriteria(J2eeStory.class);
		criteria
				.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
		j2eeStory = (J2eeStory) criteria.uniqueResult();
		
//		req.setAttribute("CommonTranslations", criteria2.list());
		
		for (Iterator iter = j2eeStory.getNouns().iterator(); iter.hasNext();) {
			Noun noun = (Noun) iter.next();
			if (StringUtils.isBlank(noun.getJapanese())) {
				Criteria criteria2 = session.createCriteria(CommonTranslation.class);
				criteria2.add(Restrictions.eq("name", new String(noun.getName())));
				if(criteria2.uniqueResult()!=null){
					CommonTranslation commonTranslation = (CommonTranslation) criteria2.uniqueResult();
					noun.setJapanese(commonTranslation.getJapanese());
					Transaction transaction = session.beginTransaction();
					session.save(noun);
					transaction.commit();
					session.flush();
				}
			}
			for (Iterator iterator = noun.getAttrs().iterator(); iterator.hasNext();) {
				Attr attr = (Attr) iterator.next();
				if (StringUtils.isBlank(attr.getJapanese())) {
					Criteria criteria2 = session.createCriteria(CommonTranslation.class);
					criteria2.add(Restrictions.eq("name", new String(attr.getName())));
					if(criteria2.uniqueResult()!=null){
						CommonTranslation commonTranslation = (CommonTranslation) criteria2.uniqueResult();
						attr.setJapanese(commonTranslation.getJapanese());
						Transaction transaction = session.beginTransaction();
						session.save(attr);
						transaction.commit();
						session.flush();
					}

				}


			}
		}
		
		new HTTPGetRedirection(req, res, "J2eeStoryDetail.do", j2eeStory.getId().toString());
		return null;
	}
	
	
}
