package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

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


public class TargetValueByGroupOfCarLinesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(TargetValueByGroupOfCarLine.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			TargetValueByGroupOfCarLine targetValueByGroupOfCarLine = (TargetValueByGroupOfCarLine) iter.next();
			vector.add(targetValueByGroupOfCarLine);
		}
		TargetValueByGroupOfCarLine targetValueByGroupOfCarLine = new TargetValueByGroupOfCarLineImpl();
		TargetValueByGroupOfCarLineForm targetValueByGroupOfCarLineform = new TargetValueByGroupOfCarLineForm();
		criteria = session.createCriteria(TargetValueByGroupOfCarLine.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			targetValueByGroupOfCarLine = (TargetValueByGroupOfCarLine) criteria.uniqueResult();
			new CopyProperties(targetValueByGroupOfCarLine,targetValueByGroupOfCarLineform);
		} else if(req.getAttribute("form")!=null){
                        targetValueByGroupOfCarLineform = (TargetValueByGroupOfCarLineForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(targetValueByGroupOfCarLineform.getId()));
			targetValueByGroupOfCarLine = (TargetValueByGroupOfCarLine) criteria.uniqueResult();
		}
		

		req.setAttribute("model",targetValueByGroupOfCarLine);
		req.setAttribute("form",targetValueByGroupOfCarLineform);
		
		
		req.setAttribute("targetValueByGroupOfCarLines",vector);


                  Criteria criteriaGroupOfCarLine= session.createCriteria(GroupOfCarLine.class);
			req.setAttribute("GroupOfCarLines", criteriaGroupOfCarLine.list());

Criteria criteriaImprovementReportOfNewCarProfit= session.createCriteria(ImprovementReportOfNewCarProfit.class);
			req.setAttribute("ImprovementReportOfNewCarProfits", criteriaImprovementReportOfNewCarProfit.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}