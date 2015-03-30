package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.beans.*;


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


public class PostStaticDataDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		StaticData staticData = new StaticDataImpl();
		StaticDataForm staticDataform = new StaticDataForm();
		Criteria criteria = session.createCriteria(StaticData.class);

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


                   
		
		return mapping.findForward("success");
	}
	
	
}