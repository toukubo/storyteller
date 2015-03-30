package net.mazdaestimate.web.app;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;

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


public class ResultAndProductivitysAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ResultAndProductivity.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			ResultAndProductivity resultAndProductivity = (ResultAndProductivity) iter.next();
			vector.add(resultAndProductivity);
		}
		ResultAndProductivity resultAndProductivity = new ResultAndProductivityImpl();
		ResultAndProductivityForm resultAndProductivityform = new ResultAndProductivityForm();
		criteria = session.createCriteria(ResultAndProductivity.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			resultAndProductivity = (ResultAndProductivity) criteria.uniqueResult();
			new CopyProperties(resultAndProductivity,resultAndProductivityform);
		} else if(req.getAttribute("form")!=null){
                        resultAndProductivityform = (ResultAndProductivityForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(resultAndProductivityform.getId()));
			resultAndProductivity = (ResultAndProductivity) criteria.uniqueResult();
		}
		

		req.setAttribute("model",resultAndProductivity);
		req.setAttribute("form",resultAndProductivityform);
		
		
		req.setAttribute("resultAndProductivitys",vector);


                  Criteria criteriaShop= session.createCriteria(Shop.class);
			req.setAttribute("Shops", criteriaShop.list());

Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaBase= session.createCriteria(Base.class);
			req.setAttribute("Bases", criteriaBase.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}