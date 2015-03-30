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


public class RawDataDownloadReasonsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(RawDataDownloadReason.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			RawDataDownloadReason rawDataDownloadReason = (RawDataDownloadReason) iter.next();
			vector.add(rawDataDownloadReason);
		}
		RawDataDownloadReason rawDataDownloadReason = new RawDataDownloadReasonImpl();
		RawDataDownloadReasonForm rawDataDownloadReasonform = new RawDataDownloadReasonForm();
		criteria = session.createCriteria(RawDataDownloadReason.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			rawDataDownloadReason = (RawDataDownloadReason) criteria.uniqueResult();
			new CopyProperties(rawDataDownloadReason,rawDataDownloadReasonform);
		} else if(req.getAttribute("form")!=null){
                        rawDataDownloadReasonform = (RawDataDownloadReasonForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(rawDataDownloadReasonform.getId()));
			rawDataDownloadReason = (RawDataDownloadReason) criteria.uniqueResult();
		}
		

		req.setAttribute("model",rawDataDownloadReason);
		req.setAttribute("form",rawDataDownloadReasonform);
		
		
		req.setAttribute("rawDataDownloadReasons",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}