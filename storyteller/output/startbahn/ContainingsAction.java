package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class ContainingsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Containing.class);
                

		if(StringUtils.isNotBlank(req.getParameter("work"))) {
			Criteria criteria2 = session.createCriteria(Work.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("work"))));
			Work work = (Work) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("work", work));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("folder"))) {
			Criteria criteria2 = session.createCriteria(Folder.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("folder"))));
			Folder folder = (Folder) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("folder", folder));
		}
 

		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("containings",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Containing containing = (Containing) iter.next();
//			vector.add(containing);
//		}
		Containing containing = new ContainingImpl();
		ContainingForm containingform = new ContainingForm();
		criteria = session.createCriteria(Containing.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			containing = (Containing) criteria.uniqueResult();
			new CopyProperties(containing,containingform);
		} else if(req.getAttribute("form")!=null){
                        containingform = (ContainingForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(containingform.getId()));
			containing = (Containing) criteria.uniqueResult();
		}
		

		req.setAttribute("model",containing);
		req.setAttribute("form",containingform);
		
		


                  Criteria criteriaWork= session.createCriteria(Work.class);
			req.setAttribute("Works", criteriaWork.list());

Criteria criteriaFolder= session.createCriteria(Folder.class);
			req.setAttribute("Folders", criteriaFolder.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}