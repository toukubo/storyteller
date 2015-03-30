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


public class WorkCommentsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(WorkComment.class);
                
		if(StringUtils.isNotBlank(req.getParameter("work"))) {
			Criteria criteria2 = session.createCriteria(Work.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("work"))));
			Work work = (Work) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("work", work));
		}
 


		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("workComments",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			WorkComment workComment = (WorkComment) iter.next();
//			vector.add(workComment);
//		}
		WorkComment workComment = new WorkCommentImpl();
		WorkCommentForm workCommentform = new WorkCommentForm();
		criteria = session.createCriteria(WorkComment.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			workComment = (WorkComment) criteria.uniqueResult();
			new CopyProperties(workComment,workCommentform);
		} else if(req.getAttribute("form")!=null){
                        workCommentform = (WorkCommentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(workCommentform.getId()));
			workComment = (WorkComment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",workComment);
		req.setAttribute("form",workCommentform);
		
		


                  Criteria criteriaWork= session.createCriteria(Work.class);
			req.setAttribute("Works", criteriaWork.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}