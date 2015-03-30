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


public class PolicesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Police.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Police police = (Police) iter.next();
			vector.add(police);
		}
		Police police = new PoliceImpl();
		PoliceForm policeform = new PoliceForm();
		criteria = session.createCriteria(Police.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			police = (Police) criteria.uniqueResult();
			new CopyProperties(police,policeform);
		} else if(req.getAttribute("form")!=null){
                        policeform = (PoliceForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(policeform.getId()));
			police = (Police) criteria.uniqueResult();
		}
		

		req.setAttribute("model",police);
		req.setAttribute("form",policeform);
		
		
		req.setAttribute("polices",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}