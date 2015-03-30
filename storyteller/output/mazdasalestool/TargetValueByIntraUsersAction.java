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


public class TargetValueByIntraUsersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(TargetValueByIntraUser.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			TargetValueByIntraUser targetValueByIntraUser = (TargetValueByIntraUser) iter.next();
			vector.add(targetValueByIntraUser);
		}
		TargetValueByIntraUser targetValueByIntraUser = new TargetValueByIntraUserImpl();
		TargetValueByIntraUserForm targetValueByIntraUserform = new TargetValueByIntraUserForm();
		criteria = session.createCriteria(TargetValueByIntraUser.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			targetValueByIntraUser = (TargetValueByIntraUser) criteria.uniqueResult();
			new CopyProperties(targetValueByIntraUser,targetValueByIntraUserform);
		} else if(req.getAttribute("form")!=null){
                        targetValueByIntraUserform = (TargetValueByIntraUserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(targetValueByIntraUserform.getId()));
			targetValueByIntraUser = (TargetValueByIntraUser) criteria.uniqueResult();
		}
		

		req.setAttribute("model",targetValueByIntraUser);
		req.setAttribute("form",targetValueByIntraUserform);
		
		
		req.setAttribute("targetValueByIntraUsers",vector);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaImprovementReportOfNewCarProfit= session.createCriteria(ImprovementReportOfNewCarProfit.class);
			req.setAttribute("ImprovementReportOfNewCarProfits", criteriaImprovementReportOfNewCarProfit.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}