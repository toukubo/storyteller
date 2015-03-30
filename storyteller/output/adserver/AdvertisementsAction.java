package net.adserver.web.app;

import net.adserver.model.*;
import net.adserver.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class AdvertisementsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="AdvertisementsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Advertisement.class);
                
		req.setAttribute("advertisements",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Advertisement advertisement = (Advertisement) iter.next();
//			vector.add(advertisement);
//		}
		Advertisement advertisement = new AdvertisementImpl();
		AdvertisementForm advertisementform = new AdvertisementForm();
		criteria = session.createCriteria(Advertisement.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			advertisement = (Advertisement) criteria.uniqueResult();
			new CopyProperties(advertisement,advertisementform);
		} else if(req.getAttribute("form")!=null){
                        advertisementform = (AdvertisementForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(advertisementform.getId()));
			advertisement = (Advertisement) criteria.uniqueResult();
		}
		

		req.setAttribute("model",advertisement);
		req.setAttribute("form",advertisementform);
		
		
//</snippet>

                   

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportAdvertisementsAction csvExportAdvertisementsAction 
//                               = new CsvExportAdvertisementsAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}