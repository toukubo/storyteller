package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class AwordWInnersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(AwordWInner.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			AwordWInner awordWInner = (AwordWInner) iter.next();
			vector.add(awordWInner);
		}
		AwordWInner awordWInner = new AwordWInnerImpl();
		AwordWInnerForm awordWInnerform = new AwordWInnerForm();
		criteria = session.createCriteria(AwordWInner.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			awordWInner = (AwordWInner) criteria.uniqueResult();
			new CopyProperties(awordWInner,awordWInnerform);
		} else if(req.getAttribute("form")!=null){
                        awordWInnerform = (AwordWInnerForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(awordWInnerform.getId()));
			awordWInner = (AwordWInner) criteria.uniqueResult();
		}
		

		req.setAttribute("model",awordWInner);
		req.setAttribute("form",awordWInnerform);
		
		
		req.setAttribute("awordWInners",vector);


                  Criteria criteriaAward= session.createCriteria(Award.class);
			req.setAttribute("Awards", criteriaAward.list());

Criteria criteriaArtist= session.createCriteria(Artist.class);
			req.setAttribute("Artists", criteriaArtist.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}