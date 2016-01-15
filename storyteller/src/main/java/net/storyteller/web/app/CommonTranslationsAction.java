package net.storyteller.web.app;

import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.beans.CommonTranslationForm;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.CommonTranslation;
import net.storyteller.model.CommonTranslationImpl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class CommonTranslationsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(CommonTranslation.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			CommonTranslation commontranslation = (CommonTranslation) iter.next();
			vector.add(commontranslation);
		}
		CommonTranslation commontranslation = new CommonTranslationImpl();
		CommonTranslationForm commontranslationform = new CommonTranslationForm();
		criteria = session.createCriteria(CommonTranslation.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			commontranslation = (CommonTranslation) criteria.uniqueResult();
			new CopyProperties(commontranslation,commontranslationform);
		} else if(req.getAttribute("form")!=null){
                        commontranslationform = (CommonTranslationForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(commontranslationform.getId()));
			commontranslation = (CommonTranslation) criteria.uniqueResult();
		}
		

		req.setAttribute("model",commontranslation);
		req.setAttribute("form",commontranslationform);
		
		
		req.setAttribute("commontranslations",vector);
		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}