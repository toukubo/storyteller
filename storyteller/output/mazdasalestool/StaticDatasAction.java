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


public class StaticDatasAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(StaticData.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			StaticData staticData = (StaticData) iter.next();
			vector.add(staticData);
		}
		StaticData staticData = new StaticDataImpl();
		StaticDataForm staticDataform = new StaticDataForm();
		criteria = session.createCriteria(StaticData.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			staticData = (StaticData) criteria.uniqueResult();
			new CopyProperties(staticData,staticDataform);
		} else if(req.getAttribute("form")!=null){
                        staticDataform = (StaticDataForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(staticDataform.getId()));
			staticData = (StaticData) criteria.uniqueResult();
		}
		

		req.setAttribute("model",staticData);
		req.setAttribute("form",staticDataform);
		
		
		req.setAttribute("staticDatas",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}