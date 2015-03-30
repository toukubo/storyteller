package net.ja.web.app;

import net.ja.model.*;
import net.ja.beans.*;

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


public class PageLayoutsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(PageLayout.class);
                



		req.setAttribute("pageLayouts",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			PageLayout pageLayout = (PageLayout) iter.next();
//			vector.add(pageLayout);
//		}
		PageLayout pageLayout = new PageLayoutImpl();
		PageLayoutForm pageLayoutform = new PageLayoutForm();
		criteria = session.createCriteria(PageLayout.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			pageLayout = (PageLayout) criteria.uniqueResult();
			new CopyProperties(pageLayout,pageLayoutform);
		} else if(req.getAttribute("form")!=null){
                        pageLayoutform = (PageLayoutForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(pageLayoutform.getId()));
			pageLayout = (PageLayout) criteria.uniqueResult();
		}
		

		req.setAttribute("model",pageLayout);
		req.setAttribute("form",pageLayoutform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}