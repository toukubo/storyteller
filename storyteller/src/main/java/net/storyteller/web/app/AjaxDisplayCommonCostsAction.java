package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class AjaxDisplayCommonCostsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(CommonCost.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			CommonCost commonCost = (CommonCost) iter.next();
			vector.add(commonCost);
		}
		CommonCost commonCost = new CommonCostImpl();
		CommonCostForm commonCostform = new CommonCostForm();
		criteria = session.createCriteria(CommonCost.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			commonCost = (CommonCost) criteria.uniqueResult();
			new CopyProperties(commonCost,commonCostform);
		} else if(req.getAttribute("form")!=null){
                        commonCostform = (CommonCostForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(commonCostform.getId()));
			commonCost = (CommonCost) criteria.uniqueResult();
		}
		

		req.setAttribute("model",commonCost);
		req.setAttribute("form",commonCostform);
		
		
		req.setAttribute("commonCosts",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}