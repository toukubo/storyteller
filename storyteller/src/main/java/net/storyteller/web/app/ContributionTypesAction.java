package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

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


public class ContributionTypesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


//
//		Session session = new HibernateSession().currentSession(this
//				.getServlet().getServletContext());
//
//                Vector vector = new Vector();
//		Criteria criteria = session.createCriteria(ContributionType.class);
//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			ContributionType contributiontype = (ContributionType) iter.next();
//			vector.add(contributiontype);
//		}
//		ContributionType contributiontype = new ContributionTypeImpl();
//		ContributionTypeForm contributiontypeform = new ContributionTypeForm();
//		criteria = session.createCriteria(ContributionType.class);
//
//
//		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
//			criteria.add(Restrictions.idEq(Integer.valueOf(req
//					.getParameter("id"))));
//			contributiontype = (ContributionType) criteria.uniqueResult();
//			new CopyProperties(contributiontype,contributiontypeform);
//		} else if(req.getAttribute("form")!=null){
//                        contributiontypeform = (ContributionTypeForm)req.getAttribute("form");
//			criteria.add(Restrictions.idEq(contributiontypeform.getId()));
//			contributiontype = (ContributionType) criteria.uniqueResult();
//		}
//		
//
//		req.setAttribute("model",contributiontype);
//		req.setAttribute("form",contributiontypeform);
//		
//		
//		req.setAttribute("contributiontypes",vector);
//
//
//                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}