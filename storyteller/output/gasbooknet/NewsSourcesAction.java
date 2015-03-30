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


public class NewsSourcesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(NewsSource.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			NewsSource newsSource = (NewsSource) iter.next();
			vector.add(newsSource);
		}
		NewsSource newsSource = new NewsSourceImpl();
		NewsSourceForm newsSourceform = new NewsSourceForm();
		criteria = session.createCriteria(NewsSource.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			newsSource = (NewsSource) criteria.uniqueResult();
			new CopyProperties(newsSource,newsSourceform);
		} else if(req.getAttribute("form")!=null){
                        newsSourceform = (NewsSourceForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(newsSourceform.getId()));
			newsSource = (NewsSource) criteria.uniqueResult();
		}
		

		req.setAttribute("model",newsSource);
		req.setAttribute("form",newsSourceform);
		
		
		req.setAttribute("newsSources",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}