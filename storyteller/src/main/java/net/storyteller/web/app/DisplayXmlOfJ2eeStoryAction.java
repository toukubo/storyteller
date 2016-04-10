package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;


import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class DisplayXmlOfJ2eeStoryAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(J2eeStory.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			J2eeStory j2eestory = (J2eeStory) iter.next();
			vector.add(j2eestory);
		}
		J2eeStory j2eestory = new J2eeStoryImpl();
		J2eeStoryForm j2eestoryform = new J2eeStoryForm();
		criteria = session.createCriteria(J2eeStory.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			j2eestory = (J2eeStory) criteria.uniqueResult();
			new CopyProperties(j2eestory,j2eestoryform);
		} else if(req.getAttribute("form")!=null){
                        j2eestoryform = (J2eeStoryForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(j2eestoryform.getId()));
			j2eestory = (J2eeStory) criteria.uniqueResult();
		}
		

		req.setAttribute("model",j2eestory);
		req.setAttribute("form",j2eestoryform);
		
		
		req.setAttribute("j2eestorys",vector);
		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}